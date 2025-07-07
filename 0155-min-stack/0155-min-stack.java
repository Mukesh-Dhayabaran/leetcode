class MinStack {
    Node top;
    // int min = Integer.MAX_VALUE;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public MinStack() {
        
    }
    
    public void push(int val) {
        Node newNode = new Node(val);
        // if(newNode.data<min) 
        // min = newNode.data;
        if(top == null)
        {
            top = newNode;
            return;
        }
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
        int min = Integer.MAX_VALUE;
        Node ptr = top;
        while(ptr!=null)
        {
            if(ptr.data<min)
            min = ptr.data;
            ptr = ptr.next;
        }
        return min;
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