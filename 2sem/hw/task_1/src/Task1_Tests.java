import org.junit.*;

public class Task1_Tests extends Assert {
    @Test
    public void create_createList_EmptyIsTrue() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }
}

