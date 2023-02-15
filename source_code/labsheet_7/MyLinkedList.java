package source_code.labsheet_7;

public class MyLinkedList implements MyLinkedListInterface {
    private Node head;
    private int size;

    class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public MyLinkedList() {
        this.size = 0;
    }

    public MyLinkedList(Node head) {
        this.head = head;
        this.size = 1;
    }

    public MyLinkedList(Object headData) {
        this.head = new Node(headData);
        this.size = 1;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    @Override
    public void addBeginning(Object data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }

    @Override
    public void addEnding(Object data) {
        if (head == null) {
            addBeginning(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        size++;
    }

    @Override
    public void addIndex(int index, Object data) {
        if (checkElementIndex(index) == -1)
            return;
        if (index == 0)
            addBeginning(data);
        else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++)
                temp = temp.next;
            temp.next = new Node(data, temp.next);
        }
        size++;
    }

    @Override
    public Object getElement(int index) {
        if (checkElementIndex(index) == -1)
            return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    @Override
    public Object removeBeginning() {
        if (size == 0)
            return null;
        Object data = head.data;
        head = head.next;
        size--;
        return data;
    }

    @Override
    public Object removeEnding() {
        if (size <= 0)
            return removeBeginning();
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        Object data = temp.next.data;
        temp.next = null;
        size--;
        return data;
    }

    @Override
    public Object removeIndex(int index) {
        if (checkElementIndex(index) == -1)
            return null;
        if (index == 0)
            return removeBeginning();

        Node temp = head;
        for (int i = 0; i < index - 1; i++)
            temp = temp.next;
        Node nextNode = temp.next.next;
        Object data = temp.next.data;
        temp.next = nextNode;
        size--;
        return data;
    }

    @Override
    public Object setElement(int index, Object newData) {
        if (checkElementIndex(index) == -1)
            return null;
        Node temp = head;
        for (int i = 0; i < index; i++)
            temp = temp.next;
        Object oldData = temp.data;
        temp.data = newData;
        return oldData;
    }

    @Override
    public int indexOf(Object data) {
        Node temp = head;
        for (int i = 0; i < size; i++, temp = temp.next) {
            if (temp.data.equals(data)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object data) {
        int lastOccurrence = -1;
        Node temp = head;
        for (int i = 0; i < size; i++, temp = temp.next) {
            if (temp.data.equals(data))
                lastOccurrence = i;
        }
        return lastOccurrence;
    }

    @Override
    public boolean contains(Object data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(data))
                return true;
            temp = temp.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int checkElementIndex(int index) {
        if (index < 0 || index >= size)
            return -1;
        return 1;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "Empty Linked List.";
        }
        StringBuilder linkedList = new StringBuilder();
        linkedList.append("Size of linked list: " + getSize() + "\n" + "Nodes:\n");
        Node temp = head;

        while (temp != null) {
            linkedList.append("\tData: " + temp.data + "\n");
            temp = temp.next;
        }
        linkedList.append("\n");
        return linkedList.toString();
    }
}
