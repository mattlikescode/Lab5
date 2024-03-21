import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word to check if it's a palindrome:");
        String word = scanner.nextLine();
        String lowerCaseWord = word.toLowerCase();
        boolean isPalindrome = isPalindrome(lowerCaseWord);

        if (isPalindrome)
        {
            System.out.println("The word " + word + " is a palindrome.");
        }
        else
        {
            System.out.println("The word '" + word + "' is not a palindrome.");
        }
    }

    private static boolean isPalindrome(String str)
    {
        int i = 0;
        int j = str.length() - 1;

        while (i < j)
        {
            if (str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
