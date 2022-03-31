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
    @Test
    public void pushFront_pushFrontToEmptyList_getSize(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(10);
        assertEquals(1, list.getSize());
    }
    @Test
    public void pushFront_pushFrontToEmptyList_ListIsCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(10);
        Node<Integer> head = (Node<Integer>) list.getHead();
        Node<Integer> tail = (Node<Integer>) list.getTail();
        assertEquals(10, head.getData().intValue());
        assertEquals(10, tail.getData().intValue());
        assertEquals(head, tail);
    }
    @Test
    public void pushFront_pushFrontTwoElem_EqualsTwo(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(20);
        list.pushFront(10);
        assertEquals(2, list.getSize());
    }
    @Test
    public void pushFront_pushFrontThreeElem_ListIsCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(20);
        list.pushFront(10);
        list.pushFront(30);
        Node<Integer> head = (Node<Integer>) list.getHead();
        Node<Integer> tail = (Node<Integer>) list.getTail();
        assertEquals(30, head.getData().intValue());
        assertEquals(10, tail.getData().intValue());
    }
    @Test
    public void pushBack_pushBackToEmptyList_ListIsCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(10);
        assertEquals(1, list.getSize());
    }

}
