import java.util.Scanner;

public class Disemvoweling {

    public static String findDouble (String str) {
        int oldLength = str.length()-1;
        StringBuilder undoubledBuilder = new StringBuilder();
        for (int i = 0; i< oldLength; i++) {
            String string1 = str.substring(i,i+1);
            String string2 = str.substring(i+1,i+2);

            if (!(string1.equals(string2))) {
                undoubledBuilder.append(str.charAt(i));
            }
        }
        String undoubled = undoubledBuilder.toString();
        undoubled += str.substring(oldLength);
        return undoubled;
    }

    public static String removeLetter(String str, String letter) {
        boolean lettersReplaced = false;
        while (!lettersReplaced) {
            if (!str.contains(letter)) {
                 lettersReplaced = true;
            }
            else {
                str = (str.substring(0, str.indexOf(letter)) + (str.substring((str.indexOf(letter) + 1))));
            }
        }
        return str;
    }

    public static String disemvowel(String str) {
        int oldLength = str.length();
        str = removeLetter(str, "a");
        str = removeLetter(str, "e");
        str = removeLetter(str, "i");
        str = removeLetter(str, "o");
        str = removeLetter(str, "u");
        int newLength = str.length();
        return str;
    }

    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the disemvoweling utility.");
        System.out.println(" Please enter your phrase: ");
        str = scan.nextLine();
        str = str.toLowerCase();
        String phrase = findDouble(disemvowel(str));
        System.out.println("Your disemvoweled phrase is: " + findDouble(disemvowel(str)));
        System.out.println("Reduced from " + str.length() + " to " + phrase.length() + " characters. Reduction rate of " + ((int) (((double) (str.length() - phrase.length()) / str.length()) * 100)) + "%");
    }
}