public class SinglyLinkedList {
    public Node head;
    
    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
        }
        else {
            Node runner = this.head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        if (this.head == null || this.head.next == null) {
            this.head = null;
        }
        else {
            Node runner = this.head;
            while (runner.next.next != null) {
                runner = runner.next;
            }
            runner.next = null;
        }
    }

    public void printValues() {
        if (this.head == null) {
            System.out.println("List is empty");
        }
        else {
            Node runner = this.head;
            String output = "";
            output += runner.value;
            runner = runner.next;
            while (runner != null) {
                output += " -> ";
                output += runner.value;
                runner = runner.next;
            }
            System.out.println(output);
        }
    }

    public Node find(int value) {
        if (this.head == null) {
            System.out.println("List is empty");
            return null;
        }
        else {
            Node runner = this.head;
            while (runner != null) {
                if (runner.value == value) {
                    return runner;
                }
                runner = runner.next;
            }
            System.out.println("Value not found");
            return null;
        }
    }

    public void removeAt(int location) {
        if (this.head == null || location < 0) {
            System.out.println("Target out of range");
        }
        else {
            Node runner = this.head;
            Node prevNode = null;
            int currentNode = 0;
            while (runner != null) {
                if (currentNode == location) {
                    if (currentNode == 0) {
                        this.head = runner.next;
                    }
                    else {
                        prevNode.next = runner.next;
                    }
                    return;
                }
                currentNode++;
                prevNode = runner;
                runner = runner.next;
            }
            System.out.println("Target out of range");
        }
    }
}