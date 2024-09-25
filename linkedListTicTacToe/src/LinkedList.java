
public class LinkedList {

    private Node head;  // Head of the linked list

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end
    public void insertAtEnd(String data, int position) {
        Node newNode = new Node(data, position);
        if(this.head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    // Method to update a specific position in the list
    public void updatePosition(int position, String data) {
        Node current = head;
        while (current.getPosition() != position) {
            current = current.getNext();
        }
        current.setData(data);
    }

    // Method to get the value at a specific position
    public String getPositionValue(int position) {
        Node current = head;
        while (current.getPosition() != position) {
            current = current.getNext();
        }
        return current.getData();
    }

    // Method to display the Tic Tac Toe board
    public void displayBoard() {
        Node current = head;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + current.getData() + "]" + " ");
                current = current.getNext();
            }
            System.out.println();
        }
    }

    // Method to check for a win
    public boolean checkWinCondition() {
        Node initial = head;
        Node current = head;
        String leftPosition = current.getData();
        String columnPosition = current.getData();
        String topLeft = current.getData();
        String topRight = current.getData();
        int tilesMatchedAcross = 1;
        int tilesMatchedVertical = 1;
        int tilesMatchedDiagonal = 1;
        //Checks win across rows
        while (current.getNext() != null){
            if (current.getPosition() == 1 || current.getPosition() == 4 || current.getPosition() == 7) {
                tilesMatchedAcross = 1;
                leftPosition = current.getData();
            }
            else {
                if (current.getData().equals(leftPosition) && !current.getData().isEmpty()) {
                    tilesMatchedAcross++;
                }
                else {
                    tilesMatchedAcross = 1;
                    leftPosition = current.getData();
                }
            }
            if (tilesMatchedAcross == 3) {
                return true;
            }
            current = current.getNext();
        }
        current = initial;
        //Checks win column 1 vertically
        while (current.getNext() != null) {
            if (current.getPosition() == 1) {
                tilesMatchedVertical = 1;
                columnPosition = current.getData();
            }
            else {
                if (current.getPosition() == 4) {
                    if (current.getData().equals(columnPosition) && !current.getData().isEmpty()) {
                        tilesMatchedVertical++;
                    }
                    else {
                        tilesMatchedVertical = 1;
                    }
                }
                if (current.getPosition() == 7) {
                    if (current.getData().equals(columnPosition) && !current.getData().isEmpty()) {
                        tilesMatchedVertical++;
                    }
                    else {
                        tilesMatchedVertical = 1;
                    }
                }
            }
            if (tilesMatchedVertical == 3) {
                return true;
            }
            current = current.getNext();
        }
        current = initial;
        //Checks win column 2 vertically
        while (current.getNext() != null) {
            if (current.getPosition() == 2) {
                tilesMatchedVertical = 1;
                columnPosition = current.getData();
            }
            else {
                if (current.getPosition() == 5) {
                    if (current.getData().equals(columnPosition) && !current.getData().isEmpty()) {
                        tilesMatchedVertical++;
                    }
                    else {
                        tilesMatchedVertical = 1;
                    }
                }
                if (current.getPosition() == 8) {
                    if (current.getData().equals(columnPosition) && !current.getData().isEmpty()) {
                        tilesMatchedVertical++;
                    }
                    else {
                        tilesMatchedVertical = 1;
                    }
                }
            }
            if (tilesMatchedVertical == 3) {
                return true;
            }
            current = current.getNext();
        }
        current = initial;
        //Checks win column 3 vertically
        while (current.getNext() != null) {
            if (current.getPosition() == 3) {
                tilesMatchedVertical = 1;
                columnPosition = current.getData();
            }
            else {
                if (current.getPosition() == 6) {
                    if (current.getData().equals(columnPosition) && !current.getData().isEmpty()) {
                        tilesMatchedVertical++;
                    }
                    else {
                        tilesMatchedVertical = 1;
                    }
                }
                if (current.getPosition() == 9) {
                    if (current.getData().equals(columnPosition) && !current.getData().isEmpty()) {
                        tilesMatchedVertical++;
                    }
                    else {
                        tilesMatchedVertical = 1;
                    }
                }
            }
            if (tilesMatchedVertical == 3) {
                return true;
            }
            current = current.getNext();
        }
        current = initial;
        //Checks diagonally top left to bottom right
        while (current.getNext() != null) {
            if (current.getPosition() == 1) {
                tilesMatchedDiagonal = 1;
                topLeft = current.getData();
            }
            else {
                if (current.getPosition() == 5) {
                    if (current.getData().equals(topLeft) && !current.getData().isEmpty()) {
                        tilesMatchedDiagonal++;
                    }
                    else {
                        tilesMatchedDiagonal = 1;
                    }
                }
                if (current.getPosition() == 9) {
                    if (current.getData().equals(topLeft) && !current.getData().isEmpty()) {
                        tilesMatchedDiagonal++;
                    }
                    else {
                        tilesMatchedDiagonal = 1;
                    }
                }
            }
            if (tilesMatchedDiagonal == 3) {
                return true;
            }
            current = current.getNext();
        }
        current = initial;
        //Checks diagonally top right to bottom left
        while (current.getNext() != null) {
            if (current.getPosition() == 3) {
                tilesMatchedDiagonal = 1;
                topRight = current.getData();
            }
            else {
                if (current.getPosition() == 5) {
                    if (current.getData().equals(topRight) && !current.getData().isEmpty()) {
                        tilesMatchedDiagonal++;
                    }
                    else {
                        tilesMatchedDiagonal = 1;
                    }
                }
                if (current.getPosition() == 7) {
                    if (current.getData().equals(topRight) && !current.getData().isEmpty()) {
                        tilesMatchedDiagonal++;
                    }
                    else {
                        tilesMatchedDiagonal = 1;
                    }
                }
            }
            if (tilesMatchedDiagonal == 3) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    // Method to check if the board is full (for draw condition)
    public boolean isBoardFull() {
        Node current = head;
        while (current.getNext() != null) {
            if (current.getData().isEmpty()) {
                return false;
            }
            current = current.getNext();
        }
        return true;
    }

    // Method to reset the board
    public void resetBoard() {
        Node current = head;
        while (current.getNext() != null) {
            current.setData("");
            current = current.getNext();
        }
    }
}
