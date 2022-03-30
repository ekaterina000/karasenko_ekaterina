import org.junit.Assert;
import org.junit.*;

public class Task3_Tests extends Assert {
    class TestComparator implements MyComparator<Integer> {
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }
    @Test
    public void quickSort_UnsortedArray_ArrayIsCorrect(){
        Integer[] arr = new Integer[]{9,2};
        QuickSort<Integer> sorter = new QuickSort();
        sorter.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{2, 9}, arr);
    }
}