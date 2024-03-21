import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        String firstSecond = firstString.concat(secondString);
        String secondFirst = secondString.concat(firstString);
        System.out.println("Concatenated (first + second): " + firstSecond);
        System.out.println("Concatenated (second + first): " + secondFirst);

        if (isAlternating(firstString, secondString))
        {
            System.out.println("The composition of the two strings is alternating.");
        } else {
            System.out.println("The composition of the two strings is not alternating.");
        }
    }
    private static boolean isAlternating(String s1, String s2) {
        if (s1.length() != s2.length())
        {
            return false;
        }

        for (int i = 0; i < s1.length(); i++)
        {
            if (i % 2 == 0) {
                if (s1.charAt(i / 2) != s2.charAt(i))
                {
                    return false;
                }
            }
            else
            {
                if (s2.charAt(i / 2) != s1.charAt(i))
                {
                    return false;
                }
            }
        }

        return true;
    }
}
