import org.junit.*;
public class Task1_Tests extends Assert {
    @Test
    public void DoubleLinkedList_CheckIsEmpty(){
        DoubleLinkedList<Integer> List = new DoubleLinkedList<>();
        assertTrue(List.isEmpty());
    }
    @Test
    public void CrateNewDoubleLinkedList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }
}

