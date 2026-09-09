class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        String chars = "[({";
        boolean valid = true;
        for(int i = 0; i<s.length(); i++){
            if(chars.contains(String.valueOf(s.charAt(i)))){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()){
                    valid = false;
                    break;
                } 
                if(s.charAt(i) == ')'){
                    valid = st.pop() == '(';
                    if (!valid) break;
                }
                else if(s.charAt(i) == '}'){
                    valid = st.pop() == '{';
                    if (!valid) break;
                }
                else if(s.charAt(i) == ']'){
                    valid = st.pop() == '[';
                    if (!valid) break;
                }
            }
        }
        return valid && st.isEmpty();
    }
}
