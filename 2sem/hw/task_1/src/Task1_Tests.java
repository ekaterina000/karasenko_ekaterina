import org.junit.*;

public class Task1_Tests extends Assert{
    @Test
    public void getNext_getNextData_ListIsCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        Node<Integer> elem1 = list.pushFront(1);
        Node<Integer> elem3 = list.pushFront(3);
        Node<Integer> elem = new Node<Integer>(2, elem3, elem1);
        Node<Integer> next = (Node<Integer>) elem.getNext();
        Node<Integer> prev = (Node<Integer>) elem.getPrev();
        assertEquals(3, next.getData().intValue());
        assertEquals(1, prev.getData().intValue());
    }
}
