package Sort;

import PersonalUpdates.SortArray;

import static org.junit.jupiter.api.Assertions.*;

class SortareBubleSortTest {

    @org.junit.jupiter.api.Test
    void sortareBS() {
        SortArray sortArray = new SortArray();
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        int d = (int) (Math.random() * 100);
        int e = (int) (Math.random() * 100);
        int f = (int) (Math.random() * 100);
        int g = (int) (Math.random() * 100);
        int h = (int) (Math.random() * 100);
        int j = (int) (Math.random() * 100);
        int k = (int) (Math.random() * 100);
        int l = (int) (Math.random() * 100);
        int q = (int) (Math.random() * 100);
        int[] arr2 = new int[]{a,b,c,d,e,f,g,h,j,k,l,q};
        for (int i = 0; i < 100000; i++) {
            assertArrayEquals(sortArray.sortareBS(arr2), sortArray.sortarePS(arr2));
            assertArrayEquals(sortArray.sortarePI(arr2), sortArray.sortarePS(arr2));
            assertArrayEquals(sortArray.sortareBS(arr2), sortArray.sortarePI(arr2));
        }
    }
}