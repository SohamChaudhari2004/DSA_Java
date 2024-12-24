import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NaiveBayesCoreJava {

    static class DataInstance {
        double openPrice;
        double closePrice;
        int marketTrend; // 1 = Up, 0 = Down

        public DataInstance(double openPrice, double closePrice, int marketTrend) {
            this.openPrice = openPrice;
            this.closePrice = closePrice;
            this.marketTrend = marketTrend;
        }
    }

    static class NaiveBayesClassifier {
        private double pUp, pDown;
        private double meanOpenUp, meanOpenDown, meanCloseUp, meanCloseDown;
        private double varianceOpenUp, varianceOpenDown, varianceCloseUp, varianceCloseDown;

        // Train the classifier with the training data
        public void train(List<DataInstance> data) {
            int totalInstances = data.size();
            int countUp = 0, countDown = 0;
            double sumOpenUp = 0, sumCloseUp = 0, sumOpenDown = 0, sumCloseDown = 0;

            for (DataInstance instance : data) {
                if (instance.marketTrend == 1) {
                    countUp++;
                    sumOpenUp += instance.openPrice;
                    sumCloseUp += instance.closePrice;
                } else {
                    countDown++;
                    sumOpenDown += instance.openPrice;
                    sumCloseDown += instance.closePrice;
                }
            }

            // Calculate prior probabilities
            pUp = (double) countUp / totalInstances;
            pDown = (double) countDown / totalInstances;

            // Calculate means
            meanOpenUp = sumOpenUp / countUp;
            meanCloseUp = sumCloseUp / countUp;
            meanOpenDown = sumOpenDown / countDown;
            meanCloseDown = sumCloseDown / countDown;

            // Calculate variances
            double varOpenUp = 0, varCloseUp = 0, varOpenDown = 0, varCloseDown = 0;
            for (DataInstance instance : data) {
                if (instance.marketTrend == 1) {
                    varOpenUp += Math.pow(instance.openPrice - meanOpenUp, 2);
                    varCloseUp += Math.pow(instance.closePrice - meanCloseUp, 2);
                } else {
                    varOpenDown += Math.pow(instance.openPrice - meanOpenDown, 2);
                    varCloseDown += Math.pow(instance.closePrice - meanCloseDown, 2);
                }
            }

            varianceOpenUp = varOpenUp / countUp;
            varianceCloseUp = varCloseUp / countUp;
            varianceOpenDown = varOpenDown / countDown;
            varianceCloseDown = varCloseDown / countDown;
        }

        // Gaussian probability density function
        private double gaussian(double x, double mean, double variance) {
            return (1 / Math.sqrt(2 * Math.PI * variance)) * Math.exp(-(Math.pow(x - mean, 2) / (2 * variance)));
        }

        // Predict the class for a new instance
        public int predict(DataInstance instance) {
            double likelihoodUp = gaussian(instance.openPrice, meanOpenUp, varianceOpenUp) *
                                  gaussian(instance.closePrice, meanCloseUp, varianceCloseUp);
            double likelihoodDown = gaussian(instance.openPrice, meanOpenDown, varianceOpenDown) *
                                    gaussian(instance.closePrice, meanCloseDown, varianceCloseDown);

            double posteriorUp = pUp * likelihoodUp;
            double posteriorDown = pDown * likelihoodDown;

            return posteriorUp > posteriorDown ? 1 : 0;
        }

        // Evaluate the accuracy of the model
        public double evaluate(List<DataInstance> testData) {
            int correctPredictions = 0;

            for (DataInstance instance : testData) {
                int predicted = predict(instance);
                if (predicted == instance.marketTrend) {
                    correctPredictions++;
                }
            }

            return (double) correctPredictions / testData.size() * 100;
        }
    }

    // Function to load CSV data with error handling for empty values
    public static List<DataInstance> loadCSV(String filePath) throws IOException {
        List<DataInstance> data = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        br.readLine(); // Skip the header line

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            
            // Check if openPrice or closePrice is empty, skip the row if true
            if (!values[2].isEmpty() && !values[5].isEmpty()) {
                try {
                    double openPrice = Double.parseDouble(values[2]);  // Assuming Open is in 3rd column
                    double closePrice = Double.parseDouble(values[5]); // Assuming Close is in 6th column
                    int marketTrend = closePrice > openPrice ? 1 : 0;  // Market trend (Up or Down)
                    data.add(new DataInstance(openPrice, closePrice, marketTrend));
                } catch (NumberFormatException e) {
                    // Handle the case where parsing fails (e.g., invalid numbers)
                    System.err.println("Skipping invalid data row: " + line);
                }
            }
        }

        br.close();
        return data;
    }

    public static void main(String[] args) {
        try {
            // Load data
            List<DataInstance> data = loadCSV("src/Market.csv"); // Update this with the actual file path

            // Split the data into training (70%) and test sets (30%)
            int trainSize = (int) (data.size() * 0.7);
            List<DataInstance> trainData = data.subList(0, trainSize);
            List<DataInstance> testData = data.subList(trainSize, data.size());

            // Train the Naive Bayes classifier
            NaiveBayesClassifier classifier = new NaiveBayesClassifier();
            classifier.train(trainData);

            // Evaluate the classifier
            double accuracy = classifier.evaluate(testData);
            System.out.println("Model accuracy: " + accuracy + "%");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
