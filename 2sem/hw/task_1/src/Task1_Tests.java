import org.junit.*;
public class Task1_Tests extends Assert {

    @Test
    public void create_createEmptyList_IsEmptyTrue() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }
    @Test
    public void check_checkList_isEmptyFalse(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        Node<Integer> elem = (Node<Integer>) list.pushBack(3);
        assertEquals(false, list.isEmpty());
    }
}