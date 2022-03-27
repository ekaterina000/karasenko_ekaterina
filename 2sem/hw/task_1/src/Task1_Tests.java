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

}

