package leetcode_easy;

public class FirstOccurrenceIndex {
    public static int firstOccurance(String lookup, String value){
        // return lookup.indexOf(value);

        // We use loop
        final int m = lookup.length();
        final int n = value.length();
        for (int i = 0; i < m - n; i++) {
            for (int j = 0; j < n; j++) {
                if(lookup.charAt(i+j) != value.charAt(j)){
                    break;
                }
                if(j==n-1){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(firstOccurance("sadbutsad", "sad"));
        System.out.println(firstOccurance("leetcode", "leeto"));
        System.out.println(firstOccurance("youaremysunshine", "my"));
    }
}
