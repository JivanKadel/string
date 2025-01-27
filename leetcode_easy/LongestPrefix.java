package leetcode_easy;

public class LongestPrefix {
    public static String longestCommonPrefix(String[] strs){
        if (strs == null || strs[0].isEmpty()) {
            return "";
        }
        String s = strs[0];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || s.charAt(i) != strs[j].charAt(i))
                    if(i==0){
                        return "No match";
                    }else{
                        return s.substring(0, i);
                    }
            }
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[]{"yo","your","you","y "}));
    }
}
