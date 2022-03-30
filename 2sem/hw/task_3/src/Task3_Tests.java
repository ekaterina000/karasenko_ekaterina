import org.junit.Assert;
import org.junit.*;

public class Task3_Tests extends Assert {
    class TestComparator implements MyComparator<Integer> {
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

   /////////////QuickSort

    @Test
    public void quickSort_UnsortedArray_ArrayIsCorrect(){
        Integer[] arr = new Integer[]{9,2};
        QuickSort<Integer> sorter = new QuickSort();
        sorter.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{2, 9}, arr);
    }
    @Test
    public void quickSort_UnsortedArray_ArrayWithTwoSameElementsIsCorrect(){
        Integer[] arr = new Integer[]{3,9,3};
        QuickSort<Integer> sorter = new QuickSort();
        sorter.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{3,3,9}, arr);
    }
    @Test
    public void quickSort_UnsortedArray_ArrayIsCorrect2(){
        Integer[] arr = new Integer[]{2,4,2,3,4};
        QuickSort<Integer> sorter = new QuickSort();
        sorter.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{2,2,3,4,4}, arr);
    }

    /////////////HeapSort

    @Test
    public void heapSort_UnsortedArray_ArrayIsCorrect(){
        Integer[] arr = new Integer[]{4,2};
        HeapSort<Integer> sorter = new HeapSort();
        sorter.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{2, 4}, arr);
    }
    @Test
    public void heapSort_SortedArray_ArrayWithoutChanges(){
        Integer[] arr = new Integer[]{1,5};
        HeapSort<Integer> sorter = new HeapSort();
        sorter.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{1, 5}, arr);
    }
    @Test
    public void heapSort_UnsortedArray3_ArrayIsCorrect(){
        Integer[] arr = new Integer[]{5,2,7};
        HeapSort<Integer> sorter = new HeapSort();
        sorter.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{2,5,7}, arr);
    }
    @Test
    public void heapSort_UnsortedArray_ArrayIsCorrect2(){
        Integer[] arr = new Integer[]{9,4,1,4,4,1};
        HeapSort<Integer> sorter = new HeapSort();
        sorter.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{1,1,4,4,4,9}, arr);
    }
    @Test
    public void heapSort_UnsortedArray_ArrayIsCorrect3(){
        Integer[] arr = new Integer[]{7,1,2,3,1,7,7,2};
        HeapSort<Integer> sorter = new HeapSort();
        sorter.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{1,1,2,2,3,7,7,7}, arr);
    }

    //////////////MergeSort
    @Test
    public void mergeSort_UnsortedArray_ArrayIsCorrect(){
        Integer[] arr = new Integer[]{7,2};
        MergeSort<Integer> sorter = new MergeSort();
        sorter.sort(arr, new TestComparator());
        assertArrayEquals(new Integer[]{2, 7}, arr);
    }

}