import org.junit.*;

public class Task1_Tests extends Assert {

    @Test
    public void create_createList_EmptyIsTrue(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void create_createList_EmptyIsFalse(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void getSize_getSizeFromList_sizeIsCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(0 == list.getSize());
    }
}
