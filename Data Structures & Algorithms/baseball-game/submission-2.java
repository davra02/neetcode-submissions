class Solution {
    public int calPoints(String[] operations) {
    
        Stack<Integer> stack = new Stack<Integer>();
        for(String current: operations){
            switch(current){
                case "+":
                    int aux = stack.pop();
                    int n = stack.peek();
                    stack.push(aux);
                    stack.push(aux + n);
                    break;
                case "D":
                    stack.push(stack.peek()*2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(current)); 
                    break;
            }
        }
        

        int result = 0;
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
}