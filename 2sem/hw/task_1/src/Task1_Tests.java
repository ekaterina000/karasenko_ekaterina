import org.junit.*;
public class Task1_Tests extends Assert {

    @Test
    public void create_createEmptyList_IsEmptyTrue() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void check_checkList_isEmptyFalse() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        Node<Integer> elem = (Node<Integer>) list.pushBack(3);
        assertEquals(false, list.isEmpty());
    }

    @Test
    public void pushFront_pushToEmptyList_checkSize() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(5);
        assertEquals(1, list.getSize());
    }

    @Test
    public void pushFront_pushFrontItem_isCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(7);
        list.pushFront(2);
        assertEquals(2, ((Node<Integer>) list.getHead()).getData().intValue());
    }

    @Test
    public void getHead_getHeadFromList_getHeadIsCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(10);
        list.pushFront(8);
        assertEquals(8, ((Node<Integer>) list.getHead()).getData().intValue());
    }
    @Test
    public void getTail_getTailFromList_getTailIsCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(9);
        list.pushFront(20);
        assertEquals(20, ((Node<Integer>) list.getTail()).getData().intValue());
    }

}