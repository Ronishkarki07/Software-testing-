package Workshop;

public class StringManipulator {

    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    public boolean isPalindrome(String input) {
        String reversed = reverse(input);
        return input.equalsIgnoreCase(reversed);
    }

    public int countVowels(String input) {
        int count = 0;
        String lower = input.toLowerCase();

        for (char ch : lower.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
