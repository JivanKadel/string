package leetcode_medium;

public class IntegerToRoman {
    public static String toRoman(int num){
        StringBuilder roman = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanEquivalents = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while(num >= values[i]){
                num -= values[i];
                roman.append(romanEquivalents[i]);
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        System.out.println(toRoman(1994));
        System.out.println(toRoman(58));
        System.out.println(toRoman(3749));
    }
}
