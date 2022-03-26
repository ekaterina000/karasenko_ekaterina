import org.junit.*;

public class Task1_Tests extends Assert {
    @Test
    public void createList_EmptyTrue(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }
}
