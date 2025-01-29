package leetcode_easy;

public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0)FXFxf0"));
    }
}
