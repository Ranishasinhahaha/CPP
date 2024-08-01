import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0, d = 0, o = 0;
        
        System.out.println("Enter a string:");
        String s = in.nextLine();  // Use java.lang.String or just String
        
        char[] c = s.toCharArray();
        
        for (int i = 0; i < c.length; i++) {
            if (Character.isAlphabetic(c[i])) {
                a++;
            } else if (Character.isDigit(c[i])) {
                d++;
            } else {
                o++;
            }
        }
        
        System.out.println("No. of alphabets: " + a);
        System.out.println("No. of digits: " + d);
        System.out.println("No. of other characters: " + o);
        
        in.close();  // Close the scanner
    }
}
