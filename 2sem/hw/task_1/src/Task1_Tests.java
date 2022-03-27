import org.junit.*;

public class Task1_Tests extends Assert {

    //DoubleLinkedList

    @Test
    public void create_createList_EmptyIsTrue() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void pushFront_pushFrontList_EmptyIsFalse() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void pushFront_PushFrontList_TryToGetError() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(1);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    @Test
    public void head_PushFrontList_GetHead() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int head = ((Node<Integer>) list.getHead()).getData();
        assertEquals(1, head);
    }

    @Test
    public void remove_PushFrontList_CheckSize() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(2, list.getSize());
    }

    @Test
    public void insert_insertListAfterFirst_SizeCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListAfter(list1.get(0), list2);
        assertEquals(6, list1.getSize());
    }

    @Test
    public void insert_insertListAfter_HeadCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(4);
        list1.pushFront(5);
        list1.pushFront(6);
        list1.insertListAfter(list.get(0), list1);
        int head = ((Node<Integer>) list.getHead()).getData();
        assertEquals(1, head);
    }

    @Test
    public void insert_insertListAfter_CheckValues() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(5);
        list.pushFront(6);

        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(2);
        list1.pushFront(3);
        list1.pushFront(4);
        list.insertListAfter(list.get(0), list1);

        int num1 = ((Node<Integer>) list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>) list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>) list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>) list.get(3)).getData();
        assertEquals(4, num1);
        num1 = ((Node<Integer>) list.get(4)).getData();
        assertEquals(5, num1);
        num1 = ((Node<Integer>) list.get(5)).getData();
        assertEquals(6, num1);
    }

    @Test
    public void insert_insertListBefore_SizeCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListBefore(list1.get(0), list2);
        assertEquals(6, list1.getSize());
    }

    @Test
    public void pushFront_PushFrontList_CheckValues() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);

        int num1 = ((Node<Integer>) list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>) list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>) list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>) list.get(3)).getData();
        assertEquals(4, num1);
    }

    @Test
    public void remove_RemoveElement_CheckValue() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        int num = ((Node<Integer>) list.get(0)).getData();
        assertEquals(2, num);
    }

    //DynamicArray

    @Test
    public void createArray_NewArray_CheckSize(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        assertEquals(5, array.getSize());
    }
    @Test
    public void createArray_CreateArray_CheckSize(){
        DynamicArray<Integer> array = new DynamicArray<>();
        assertEquals(1024, array.getSize());
    }
    @Test
    public void resize_ResizeArray_CheckSize(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.resize(10);
        assertEquals(10, array.getSize());
    }
    @Test
    public void index_GetIndex_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.get(7);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void index_GetIndexBorder_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.get(5);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void set_SetIndexBounds_CheckException() {
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.set(6, 10);
            fail();
        } catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
        public void set_SetIndexBorder_CheckException(){
            DynamicArray<Integer> array = new DynamicArray<>(5);
            try {
                array.set(5,10);
                fail();
            }
            catch (IndexOutOfBoundsException some) {
                assertEquals("Index out of bounds", some.getMessage());
            }
        }
    @Test
    public void insert_InsertBounds_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.insert(6,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void insert_InsertBorder_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.insert(5,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void set_SetNumbers_CheckValues(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(5, array.get(4).intValue());
    }
    @Test
    public void insert_InsertNumber_NewValueCheck(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        array.insert(4, 100);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(100, array.get(4).intValue());
    }
    @Test
    public void pushBack_PushBackNumbers_CheckValues(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        array.pushBack(6);
        array.pushBack(7);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(5, array.get(4).intValue());
        assertEquals(6, array.get(5).intValue());
        assertEquals(7, array.get(6).intValue());
    }
    @Test
    public void popBack_PopBackInArray_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(0);
        try {
            array.popBack();
            fail();
        }
        catch (Exception some) {
            assertEquals("Array is empty", some.getMessage());
        }
    }

}




