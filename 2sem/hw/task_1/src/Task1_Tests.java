import org.junit.*;

public class Task1_Tests extends Assert {
    @Test
    public void DoubleLinkedList_createEmpty() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }
}
