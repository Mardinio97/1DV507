package km222pw_assign3;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgorithmsTest  {
    SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
    @Test
    void testInsertionSort_INT() {
        int[] arr = new int[6];
        arr[0] = 2;
        arr[1] = 200;
        arr[2] = 236;
        arr[3] = 589;
        arr[4] = 1;
        arr[5] = 150;
        System.out.println("Array before insertion sort: " + Arrays.toString(arr) + "\n");
        sortingAlgorithms.insertionSort_INT(arr);
        System.out.println("Array after insertion sort: " + Arrays.toString(arr));
        assertAll("Integers",
                () -> assertEquals(arr[0], 1),
                () -> assertEquals(arr[1], 2),
                () -> assertEquals(arr[2], 150),
                () -> assertEquals(arr[3], 200),
                () -> assertEquals(arr[4], 236),
                () -> assertEquals(arr[5], 589)
        );
    }
    @Test
    void testInsertionSort_String() {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        String[] arr = {"S", "F", "A", "M", "Q", "World",
                "Hello"};
        String[] sortedArr = sortingAlgorithms.insertionSort_String(arr, stringComparator);
        System.out.println("Original Array: "+Arrays.toString(arr));
        System.out.println("Array after insertion sort: " +Arrays.toString(sortedArr));
        assertAll("String",
                () -> assertEquals(sortedArr[0], "A"),
                () -> assertEquals(sortedArr[1], "F"),
                () -> assertEquals(sortedArr[2], "Hello"),
                () -> assertEquals(sortedArr[3], "M"),
                () -> assertEquals(sortedArr[4], "Q"),
                () -> assertEquals(sortedArr[5], "S"),
                () -> assertEquals(sortedArr[6], "World")
        );
        assertEquals(arr.length, sortedArr.length);
    }
}