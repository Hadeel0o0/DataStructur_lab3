public class Test {
    public static void main(String[] args) {
        DoublyLinkedList<String> l=new DoublyLinkedList<String>();
        System.out.println(l.isEmpty());
        System.out.println(l.size());
        l.addFirst("a");
        l.addLast("b");
        l.addLast("c");

        while (!l.isEmpty()){
            System.out.print(l.removeLast()+"\t");
        }
    }
}
