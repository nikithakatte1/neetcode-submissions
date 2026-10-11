class Node {
    int value;
    Node prev;
    Node next;

    public Node(int value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}

class Deque {
    Node dummyHead;
    Node dummyTail;

    public Deque() {
        this.dummyHead = new Node(0);
        this.dummyTail = new Node(0);

        this.dummyHead.next = this.dummyTail;
        this.dummyTail.prev = this.dummyHead;
    }

    public boolean isEmpty() {
        return this.dummyHead.next == this.dummyTail;

    }

    public void append(int value) {
       Node newNode = new Node(value);
       newNode.prev = this.dummyTail.prev;
       newNode.next = this.dummyTail;
       this.dummyTail.prev.next = newNode;
       this.dummyTail.prev = newNode;
    }

    public void appendleft(int value) {
        Node newNode = new Node(value);
        newNode.prev = this.dummyHead;
        newNode.next = this.dummyHead.next;
        this.dummyHead.next.prev = newNode;
        this.dummyHead.next = newNode;

    }

    public int pop() {
        if(isEmpty()){
            return -1;
        }
        Node targetNode = this.dummyTail.prev;
        Node prevNode = targetNode.prev;
        int value = targetNode.value;
        this.dummyTail.prev = prevNode;
        prevNode.next = this.dummyTail;
        return value; 
        
    }

    public int popleft() {
        if(isEmpty()){
            return -1;
        }
        Node targetNode = this.dummyHead.next;
        Node nextNode = targetNode.next;
        int value = targetNode.value;
        this.dummyHead.next = nextNode;
        nextNode.prev = this.dummyHead;
        return value;
    }
}

