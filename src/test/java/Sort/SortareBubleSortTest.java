package Sort;

import PersonalUpdates.SortArray;

import static org.junit.jupiter.api.Assertions.*;

class SortareBubleSortTest {

    @org.junit.jupiter.api.Test
    void sortare() {
        General general = new General(100);
        //int [] arr2 = new int[]{3,5,3,2,5};
        int[] arr2 = new int[1000];
        general.creareArray(arr2,1000);
        for (int i = 0; i < 1000; i++) {
            assertArrayEquals(SortArray.sortareBS(arr2), SortArray.sortarePS(arr2));
            assertArrayEquals(SortArray.sortarePI(arr2), SortArray.sortarePS(arr2));
            assertArrayEquals(SortArray.sortareBS(arr2), SortArray.sortarePI(arr2));
            assertArrayEquals(QuickSort.sort(arr2, 0, arr2.length - 1), SortArray.sortarePI(arr2));
            assertArrayEquals(QuickSort.sort(arr2, 0, arr2.length - 1), SortArray.sortareBS(arr2));
            assertArrayEquals(QuickSort.sort(arr2, 0, arr2.length - 1), SortArray.sortarePS(arr2));
            assertArrayEquals(MergeSort.mergeSort(arr2), SortArray.sortarePS(arr2));
            assertArrayEquals(MergeSort.mergeSort(arr2), QuickSort.sort(arr2, 0, arr2.length - 1));

        }
    }
}