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

    @Test
    public void pushFront_pushFrontList_checkNumber(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        assertTrue(1 == list.getSize());
    }


    @Test
    public void getNumber_getNumberList_tryToGetAnotherNumber(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(2);
            fail();
        } catch (IndexOutOfBoundsException e){
            assertFalse(false);
        }
    }

    @Test
    public  void getHead_headFromList_Head(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }


    @Test
    public void getHead_headFromList_checkHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(2);
        list.pushBack(1);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }

    @Test
    public void getTail_tailFromList_Tail(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int tail = ((Node<Integer>)list.getTail()).getData();
        assertEquals(2, tail);
    }

    @Test
    public void getTail_tailFromList_checkTail(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        int tail = ((Node<Integer>)list.getTail()).getData();
        assertEquals(2, tail);
    }

    @Test
    public void get_PushFrontList_CheckFirst(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        int num = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num);
    }

    @Test
    public void get_PushBackList_CheckFirst(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(3);
        list.pushBack(2);
        list.pushBack(1);

        int num = ((Node<Integer>)list.get(0)).getData();
        assertEquals(2, num);
    }

    @Test
    public void remove_removeInList_removeElement(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(2, list.getSize());
    }

    @Test
    public void insertListAfter_CreateTwoListsAndUnite_CheckSize(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list.insertListAfter(list.get(0), list2);
        assertEquals(6, list.getSize());
    }

    @Test
    public void insertListAfter_CreateTwoListsAndUnite_CheckHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(4);
        list1.pushFront(5);
        list1.pushFront(6);
        list1.insertListAfter(list.get(0), list1);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }
    @Test
    public void insertListAfter_CreateTwoListsAndUnite_check(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(5);
        list.pushFront(6);

        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(2);
        list1.pushFront(3);
        list1.pushFront(4);
        list.insertListAfter(list.get(0), list1);

        int num1 = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>)list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>)list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>)list.get(3)).getData();
        assertEquals(4, num1);
        num1 = ((Node<Integer>)list.get(4)).getData();
        assertEquals(5, num1);
        num1 = ((Node<Integer>)list.get(5)).getData();
        assertEquals(6, num1);
    }
}
