import org.junit.*;

public class Task1_Tests extends Assert{
    @Test
    public void create_CreateList_EmptyTrue(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }
}