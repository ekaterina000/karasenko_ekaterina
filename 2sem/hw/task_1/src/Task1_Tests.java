import org.junit.*;
public class Task1_Tests extends Assert {
    @Test
    public void DoubleLinkedList_CheckIsEmpty() {
        DoubleLinkedList<Integer> List = new DoubleLinkedList<>();
        assertTrue(List.isEmpty());
    }

    @Test
    public void DoubleLinkedList_CrateNewDoubleLinkedList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void DoubleLinkedList_PushFrontToEmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void DoubleLinkedList_checkGetSize() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(0 == list.getSize());
    }
}


