import java.util.Scanner;

public class Panagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String for checking panagram : ");
        String input = sc.nextLine();
        boolean output = isPanagram(input);

        if (output) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPanagram(String s) {
        s = s.toLowerCase();
        char[] totalAlphabate = new char[26];
        // iterating whole string

        for (int i = 0; i < s.length(); i++) {
            char running = s.charAt(i);
            if (running >= 'a' && running <= 'z') {
                totalAlphabate[running - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (totalAlphabate[i] == 0) {
                return false;
            }
        }
        return true;
    }

}
