package Strings;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder string =  new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            string.append(ch);
        }
        System.out.println(string);

    }
}
