public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("asymmetric"));
    }
    static String reverse(String string){
        int stringLength = string.length();
        char[] charArray= string.toCharArray();
        for (int i = 0;i<stringLength/2; i++){
            char temp = charArray[i];
            charArray[i] = charArray[stringLength-1-i];
            charArray[stringLength-1-i] = temp;
        }
        return String.valueOf(charArray);
    }
}
