
public class Node {
    String data;  // Could be 'X', 'O', or empty
    Node next;
    int position;

    // Constructor for a new node
    public Node(String data, int number) {
        this.data = data;
        this.next = null;
        this.position = number;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public String getData() {
        return data;
    }

    public int getPosition() {
        return position;
    }
}
