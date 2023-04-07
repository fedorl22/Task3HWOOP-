public class Main {
    public static void main(String[] args) {

        ElementList<Integer> list = new ElementList<>();
        // list.removeLast();
        list.addLast(22);
        list.addLast(7);
        list.addLast(11);
        list.addLast(5);
        list.addLast(9);
        list.addLast(8);
        list.addLast(3);
        list.addLast(100);

        list.printList();

        System.out.println();              
        list.removeLast();
        list.removeLast();
        list.printList();

    }
}
