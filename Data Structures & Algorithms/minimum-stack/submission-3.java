class MinStack {

    private Stack<Integer> min;
    private Stack<Integer> st;

    public MinStack() {
        this.st = new Stack<Integer>();
        this.min = new Stack<Integer>();
        this.min.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        if(val<=min.peek()) min.push(val);
        this.st.push(val);
    }
    
    public void pop() {
        if(this.st.pop().equals(this.min.peek())) this.min.pop();
    }
    
    public int top() {
        return this.st.peek();
    }
    
    public int getMin() {
        return this.min.peek();
    }
}
