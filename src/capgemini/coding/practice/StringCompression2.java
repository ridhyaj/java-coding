package capgemini.coding.practice;
public class StringCompression2 {
    public static String compress(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }


        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);


        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        String input = "aaabbcc";
        String result = compress(input);
        System.out.println("Compressed string: " + result);
    }
}
