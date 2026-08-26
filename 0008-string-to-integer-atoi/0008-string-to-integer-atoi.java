class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;
        int sign = 1;
        int i =0;
        if (s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = s.charAt(i) == '-'?-1:1;
            i++;
        }
        int num = 0;
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            if ((num )> Integer.MAX_VALUE/10 || ((num ) == Integer.MAX_VALUE/10 && s.charAt(i)-'0' > Integer.MAX_VALUE%10)) return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            num = num * 10 + (s.charAt(i)-'0');
            i++;
        }

        return sign*num;


    }
}