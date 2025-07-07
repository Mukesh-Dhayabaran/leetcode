class MinStack {
    Node top;
    class Node
    {
        int data,min;
        Node next;
        Node(int d,int m)
        {
            data = d;
            min = m;
            next = null;
        }
    }
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(top == null)
        {
            Node newNode = new Node(val,val);
            top = newNode;
            return;
        }
        Node newNode = new Node(val,top.min > val ? val : top.min);
        newNode.next = top;
        top = newNode;
    }
    
    public void pop() {
        top = top.next;
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */