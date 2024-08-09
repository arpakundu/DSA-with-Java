public class CheckPalindrome {

    public boolean isPalindrome(String word){
        word = word.toLowerCase(); //converting the string into lowerclass to avoid the case sensitive situation// 
        char[] charArray = word.toCharArray();  //Here, the datatype of 'word' is changed to character array using the method 'toCharArray'//
        int start = 0;
        int end = word.length() - 1;
        while(start < end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        CheckPalindrome obj = new CheckPalindrome();
        if(obj.isPalindrome("Rotator")){
            System.out.println("The strinng is palindrome.");
        }
        else{
            System.out.println("The string is not palindrome.");
        }
    }
}
