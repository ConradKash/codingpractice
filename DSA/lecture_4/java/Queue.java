package lecture_4.java;

public class Queue {
    class ArrayQueue {
        private Object[] arr;
        private int front;
        private int rear;
        private int capacity;
        private int size;

        ArrayQueue(int size) {
            arr = new Object[size];
            capacity = size;
            front = 0;
            rear = -1;
            size = 0;
        }

        public void enqueue(Object data) {
            if (isFull()) {
                throw new RuntimeException("Queue is full");
            }
            rear = (rear + 1) % capacity;
            arr[rear] = data;
            size++;
        }

        public Object dequeue() {
            if (isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            Object data = arr[front];
            front = (front + 1) % capacity;
            size--;
            return data;
        }

        public Object peek() {
            if (isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            return arr[front];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
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

    class LinkedListQueue {
        private Node front;
        private Node rear;
        
        LinkedListQueue() {
            this.front = null;
            this.rear = null;
        }

        public void enqueue(Object data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        public Object dequeue() {
            if (isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            Object data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return data;
        }

        public Object peek() {
            if (isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            return front.data;
        }

        public boolean isEmpty() {
            return front == null;
        }
    }
}
