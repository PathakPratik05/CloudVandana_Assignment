import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman Number : ");
        String inputRoman = sc.next();
        int integerConveted = ConversionOfRomanToInteger(inputRoman.toUpperCase());
        System.out.println("Number format = " + integerConveted);
    }

    public static int ConversionOfRomanToInteger(String input) {

        int answer = 0;

        for (int i = 0; i < input.length(); i++) {
            char runningChar = input.charAt(i);
            int runningValue = getRomanValue(runningChar);

            if (i < input.length() - 1) {
                char nextChar = input.charAt(i + 1);
                int nextValue = getRomanValue(nextChar);

                if (runningValue < nextValue) {
                    answer = answer - runningValue;
                } else {
                    answer = answer + runningValue;
                }
            } else {
                answer = answer + runningValue;
            }
        }

        return answer;

    }

    // mentioned each and every roman value

    public static int getRomanValue(char romanValue) {
        switch (romanValue) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
