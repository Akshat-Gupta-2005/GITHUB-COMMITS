class Solution {
    public boolean isValid(String s) {
        // if (s.length()%2 == 1) return false;
        // Stack<String> stk = new Stack<>();
        // for (int i = 0 ; i< s.length() ; i++){
        //     String str = s.charAt(i) + "";
        //     if (str.compareTo("(") == 0 || str.compareTo("[") == 0 || str.compareTo("{") == 0){
        //         stk.push(str);
        //     }else{
        //         if (stk.empty()) return false;
        //         String pop = stk.pop();
        //         if (str.compareTo(")") == 0 && pop.compareTo("(")!=0) return false;
        //         if (str.compareTo("}") == 0 && pop.compareTo("{")!=0) return false;
        //         if (str.compareTo("]") == 0 && pop.compareTo("[")!=0) return false;
        //     }
        // }
        // if (!stk.empty()) return false;
        // return true;

        int n = s.length();
        if (n%2 == 1) return false;

        Stack <Character> stk = new Stack<>();

        for (int i = 0 ; i < n ; i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ) stk.push(s.charAt(i));

            else{
                if (stk.isEmpty()) return false;
                char ch = stk.pop();

                if (s.charAt(i) == ')' && ch != '(') return false;
                else if (s.charAt(i) == ']' && ch != '[') return false;
                else if (s.charAt(i) == '}' && ch != '{') return false;
            }

        }

        return stk.isEmpty();
    }
}