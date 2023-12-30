public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("LINKED LIST OPERATIONS");
        LinkedList<Integer> list=new LinkedList<>();

        list.addData(22);
        list.addData(35);
        list.addData(20);
        list.addData(15);
        list.addData(16);
        list.addData(33);
        list.addData(90);
        list.addData(56);

        System.out.println("Original list");
        list.displayList();
        System.out.println();

        System.out.println("Reverse list");
        list.reverseList();
        list.displayList();

    }
}