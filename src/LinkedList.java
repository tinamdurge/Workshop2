public class LinkedList<T extends Comparable<T>> {
    Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void addData(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }
//DISPLAYING
    public void displayList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
    }
    //REVERSING
    public void reverseList(){
        Node<T> prev=null;
        Node<T> curr=head;
        Node<T> nextNode;

        while(curr!=null){
            nextNode=curr.next;

            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        head=prev;
    }
}