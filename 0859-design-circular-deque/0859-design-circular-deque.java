class MyCircularDeque {

    int size,rear;
    int queue[];
    public MyCircularDeque(int k) {
        size = k;
        queue = new int[k];
        rear = -1;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        for(int i=rear+1;i>0;i--)
        queue[i] = queue[i-1];
        queue[0] = value;
        rear++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        queue[++rear] = value;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        for(int i=1;i<=rear;i++)
        queue[i-1] = queue[i];
        rear--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        rear--;
        return true;
    }
    
    public int getFront() {
        return isEmpty() ? -1 : queue[0];
    }
    
    public int getRear() {
        return isEmpty() ? -1 : queue[rear];   
    }
    
    public boolean isEmpty() {
        return rear == -1;
    }
    
    public boolean isFull() {
        return rear == size-1;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */