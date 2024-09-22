package ridhya;
public class StringComparisonExample {
    public static void main(String[] args) {
        String str1 = "Hello   World";
        String str2 = "Hello World";

        // Remove leading and trailing spaces, and replace multiple spaces with a single space
//        String modifiedStr1 = str1.trim().replaceAll("\\s+", " ");
//        String modifiedStr2 = str2.trim().replaceAll("\\s+", " ");

        // Compare the modified strings
        if (str1.trim().replaceAll("\\s+", " ").equals(str2.trim().replaceAll("\\s+", " "))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
