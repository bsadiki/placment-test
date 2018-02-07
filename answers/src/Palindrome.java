public class Palindrome {
    public static void main(String[] args) {
        System.out.printf(String.valueOf(isPalindrome(123)));
        System.out.printf(String.valueOf(isPalindrome(121)));
    }
    static boolean isPalindrome(int number){
        boolean isPalindrome = true;
        String stringValue = String.valueOf(number);
        int stringLength = stringValue.length();
        for (int i = 0;i<stringLength; i++){
            if(stringValue.charAt(i)!= stringValue.charAt(stringLength-1-i))
                isPalindrome = false;
        }
        return isPalindrome;
    }
}
