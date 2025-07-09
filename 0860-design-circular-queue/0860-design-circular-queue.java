class MyCircularQueue {
    int size,rear;
    int queue[];
    public MyCircularQueue(int k) {
        size = k;
        queue = new int[k];
        rear = -1;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        queue[++rear] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        for(int i=1;i<=rear;i++)
        queue[i-1] = queue[i];
        rear--;
        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 : queue[0];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : queue[rear];
    }
    
    public boolean isEmpty() {
        return rear==-1;
    }
    
    public boolean isFull() {
        return rear == size-1;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */