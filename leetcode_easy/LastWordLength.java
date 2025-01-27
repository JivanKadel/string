package leetcode_easy;

public class LastWordLength {
    public static int lengthOfLastWord(String s){
        s = s.trim();
        int lastSpace = s.lastIndexOf(" ");
        return (s.length() - lastSpace - 1);
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
