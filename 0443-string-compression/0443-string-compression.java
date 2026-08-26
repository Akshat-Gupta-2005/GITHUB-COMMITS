class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        String s = "";

        while(i<n){
            int c = 1;
            char ch = chars[i];

            while(i < n-1 && ch == chars[i+1]){
                c++;
                i++;
            }

            if(c ==1) s+= ch;
            else s = s + ch + c;

            i++;
        }
        for ( i = 0 ; i < s.length() ; i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}