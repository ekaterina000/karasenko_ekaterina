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
}
