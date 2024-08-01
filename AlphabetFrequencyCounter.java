import java.util.Scanner;
public class AlphabetFrequencyCounter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the text:");
        String input = in.nextLine();
        countAlphabetFrequency(input);
    }

    public static void countAlphabetFrequency(String str) {
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        int[] frequencyArray = new int[26];
        for (char c : str.toCharArray()) {
            int index = c - 'a';
            frequencyArray[index]++;
        }
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {  
                char letter = (char) (i + 'a');
                System.out.println(letter + ": " + frequencyArray[i]);
            }
        }
    }
}
