package Sort;

import PersonalUpdates.SortArray;

public class Main {
    public static void main(String[] args) {
        SortareBubleSort sortare = new SortareBubleSort(100);
        //SortarePrinSelectie sortare = new SortarePrinSelectie(100);
        //SortarePrinInserare sortare = new SortarePrinInserare(100);
        SortArray sort = new SortArray();

        int a = (int) (Math.random() * 1000);
        int b = (int) (Math.random() * 1000);
        int c = (int) (Math.random() * 1000);
        int d = (int) (Math.random() * 1000);
        int e = (int) (Math.random() * 1000);
        int f = (int) (Math.random() * 1000);
        int g = (int) (Math.random() * 1000);
        int h = (int) (Math.random() * 1000);

        int[] arr = new int[]{a, b, c, d, e, f, g, h};
        int[] arr1 = new int[]{a, b, c, d, e, f, g, h};
        int[] arr2 = new int[]{3,2,4,1};
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

    }
}
