import org.junit.*;
public class Task1_Tests extends Assert {

    @Test
    public void check_checkList_isEmpty() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void check_checkList_pushBack() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void getSize_sizeList_checkSize() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(0 == list.getSize());
    }

    @Test
    public void pushFront_pushFrontList_checkNumber() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(10);
        assertTrue(1 == list.getSize());
    }

    @Test
    public void getNumber_getNumberList_checkNumber() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(2);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertFalse(false);
        }
    }

    @Test
    public void getHead_headFromList_Head() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(5);
        list.pushFront(2);
        int y = ((Node<Integer>) list.getHead()).getData();
        assertEquals(5, y);
    }

    @Test
    public void getHead_headFromList_checkHead() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(6);
        list.pushBack(1);
        int y = ((Node<Integer>) list.getHead()).getData();
        assertEquals(1, y);
    }

    @Test
    public void getTail_tailFromList_Tail() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(3);
        list.pushFront(2);
        int t = ((Node<Integer>) list.getTail()).getData();
        assertEquals(2, t);
    }

    @Test
    public void getTail_tailFromList_checkTail() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        int t = ((Node<Integer>) list.getTail()).getData();
        assertEquals(1, t);
    }
}


