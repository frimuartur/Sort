package Sort;

import PersonalUpdates.SortArray;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        General general = new General(100);
        int [] array = new int[50];
        //int [] arraySorted = new int[]{1,2,3,4,5,6,7,8,9,10};
        general.creareArray(array,50);

        int [] array1 = array;
        int [] array2 = array;
        int [] array3 = array;
        int [] array4 = array;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));


        QuickSort.sort(array, 0, array.length - 1);
        System.out.println("sorted array with Quick Sort");
        System.out.println(Arrays.toString(array));

        MergeSort.mergeSort(array4);
        System.out.println("sorted array with Merge Sort");
        System.out.println(Arrays.toString(array4));

        SortArray.sortareBS(array1);
        System.out.println("sorted array with Bubble Sort");
        System.out.println(Arrays.toString(array1));

        SortArray.sortarePS(array2);
        System.out.println("sorted array with selectie");
        System.out.println(Arrays.toString(array2));

        SortArray.sortarePI(array3);
        System.out.println("sorted array with inserare");
        System.out.println(Arrays.toString(array3));

        TestSpeedSort.test1();
    }

}

/*
        sortare.introduElement(3);
        sortare.introduElement(2);
        sortare.introduElement(4);
        sortare.introduElement(1);
        sortare.introduElement(6);

        //sortare.afiseaza();
        //sortare.sortareBS();
        //sortare.afiseaza();



        sort.afiseazaArray(arr);
        System.out.println(" ");
        System.out.println("Sortare Buble Sort");
        sort.sortareBS(arr);
        sort.afiseazaArray(arr);
        System.out.println(" ");

        sort.afiseazaArray(arr1);
        System.out.println(" ");
        System.out.println("Sortare prin selectie");
        sort.sortarePS(arr1);
        sort.afiseazaArray(arr1);
        System.out.println(" ");

        */


      /*  // _________________________________

        int maxSize = 100;
        CreareLista array = new CreareLista(maxSize);
        array.inserarePersoana("Arapu", "Ion", 15);
        array.inserarePersoana("Frimu", "Daniel", 15);
        array.inserarePersoana("Zestrea", "Nadejda", 21);
        array.inserarePersoana("Stamate", "Iana", 24);
        array.inserarePersoana("Lazari", "Livia", 59);

        System.out.println("Inainte de sortare:");
        array.afisare();
        array.Sortare();
        System.out.println("Dupa sortare:");
        array.afisare();
*/
