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

}