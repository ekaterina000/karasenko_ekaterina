import org.junit.*;

public class Task1_Tests extends Assert {
    @Test
    public void create_createList_EmptyIsTrue() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void pushFront_pushFrontList_EmptyIsFalse() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        assertFalse(list.isEmpty());
    }
    @Test
    public void pushFront_PushFrontList_TryToGetError() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(1);
            fail();
        }
        catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }
    @Test
    public  void head_PushFrontList_GetHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }
    @Test
    public void remove_PushFrontList_CheckSize() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(2, list.getSize());
    }
}

