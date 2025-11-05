package lecture_4.java;

public class Stack {
class ArrayStack {
    private Object[] arr;
    private int top;
    private int capacity;

    ArrayStack(int size) {
        arr = new Object[size];
        capacity = size;
        top = -1;
    }

    public void push(Object data) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        arr[++top] = data;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top--];
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}

class Node {
    Object data;
    Node next;
    Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListStack {
    private Node top;
    
    LinkedListStack() {
        this.top = null;
    }

    public void push(Object data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        Object data = top.data;
        top = top.next;
        return data;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

    
}
