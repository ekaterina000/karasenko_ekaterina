import org.junit.Assert;
import org.junit.Test;

public class Task2_Tests extends Assert {
    static class TestComparator implements MyComparator<Integer> {
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    @Test
    public void BubbleSort_sortTheSameNumbers_IsCorrect() {
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] bubbleArray = {1, 1, 1};

        sorter.sort(bubbleArray, new TestComparator());

        assertArrayEquals(new Integer[]{1, 1, 1}, bubbleArray);
    }

    @Test
    public void BubbleSort_rightOrder_NumbersInRightOrder() {
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] bubbleArray = {2, 4, 6};

        sorter.sort(bubbleArray, new TestComparator());

        assertArrayEquals(new Integer[]{2, 4, 6}, bubbleArray);
    }
    @Test
    public void BubbleSort_SortData_DataIsCorrect() {
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] bubbleArray = {1, 5, 3};

        sorter.sort(bubbleArray, new TestComparator());

        assertArrayEquals(new Integer[]{1, 3, 5}, bubbleArray);
    }
}
