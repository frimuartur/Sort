package Sort;

import PersonalUpdates.SortArray;

public class TestSpeedSort {
    public static void test1(){
        int testLen = 30000000;

        int [] arr1 = new int[testLen];
        int [] arr2 = new int[testLen];
        int [] arr3 = new int[testLen];
        int [] arr4 = new int[testLen];
        int [] arr5 = new int[testLen];

        for(int i = 0; i < testLen; i++){
            arr2[i] = arr1[i] = arr3[i] = arr4[i] = arr5[i] = (int)Math.round(Math.random()* 10000);
        }
        long start = System.currentTimeMillis();
        MergeSort.mergeSort(arr2);
        long time = System.currentTimeMillis() - start;
        System.out.println("Merge Sort: "+ time + " ms");

        long start1 = System.currentTimeMillis();
        QuickSort.sort(arr1,0,testLen-1);
        long time1 = System.currentTimeMillis() - start1;
        System.out.println("Quick sort: "+ time1 + " ms");

        long start2 = System.currentTimeMillis();
        //SortArray.sortareBS(arr3);
        long time2 = System.currentTimeMillis() - start2 ;
        System.out.println("Bubble sort: "+ time2 + " ms");

        long start3 = System.currentTimeMillis();
       // SortArray.sortarePS(arr4);
        long time3 = System.currentTimeMillis() - start3;
        System.out.println("Selection sort: "+ time3 + " ms");

        long start4 = System.currentTimeMillis();
        //SortArray.sortarePI(arr5);
        long time4 = System.currentTimeMillis() - start4;
        System.out.println("Insertion sort: "+ time4 + " ms");
    }

    public static void main(String[] args) {
        test1();
    }
}


