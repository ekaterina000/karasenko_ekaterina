import org.junit.*;
public class Task1_Tests extends Assert {
    @Test
    public void DoubleLinkedList_checkIsEmpty() {
        DoubleLinkedList<Integer> List = new DoubleLinkedList<>();
        assertTrue(List.isEmpty());
    }

}


