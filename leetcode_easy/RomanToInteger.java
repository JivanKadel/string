package leetcode_easy;

public class RomanToInteger {
    public static int toInteger(String roman){
        int total = 0;
        // All other characters defaults to 0
        int[] romanToInt = new int[128];
        romanToInt['I'] = 1;
        romanToInt['V'] = 5;
        romanToInt['X'] = 10;
        romanToInt['L'] = 50;
        romanToInt['C'] = 100;
        romanToInt['D'] = 500;
        romanToInt['M'] = 1000;

        for(int i=0; i<roman.length()-1; i++){
            if(romanToInt[roman.charAt(i)] < romanToInt[roman.charAt(i+1)]){
                total -= romanToInt[roman.charAt(i)];
            }else{
                total += romanToInt[roman.charAt(i)];
            }
        }
        return total + romanToInt[roman.charAt(roman.length()-1)];
    }
    public static void main(String[] args) {
        System.out.println(toInteger("IX"));
        System.out.println(toInteger("MCMXCIV"));
        System.out.println(toInteger("LVIII"));
        System.out.println(toInteger("III"));
    }
}
