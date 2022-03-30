import org.junit.*;
public class Task1_Tests extends Assert {

    @Test
    public void create_createEmptyList_IsEmptyTrue() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }
}