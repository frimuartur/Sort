package Sort;

import java.util.*;

public class QuickSort {
    /*
    Questa funzione prende l'ultimo elemento come pivot,
        piazza l'elemento di pivot nella sua posizione corretta
        nell'array ordinato. Inoltre piazza tutti gli elementi
        "più piccoli" del pivot a sinistra e tutti quelli
        "più grandi" alla destra del pivot.
    */
    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int index = (low - 1); // indice dell'elemento più piccolo. -1 all'inizio
        for (int j = low; j < high; j++) {
// se elemento corrente minore di pivot
            if (arr[j] < pivot) {
                index++;
// scambia arr[index] and arr[j]
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
            }
        }
// scambia arr[index+1] e arr[high] (o pivot)
        int temp = arr[index + 1];
        arr[index + 1] = arr[high];
        arr[high] = temp;
        return index + 1;
    }

    /* La funzione principale che implementa QuickSort()
    arr[] --> array da ordinare,
    low --> indice iniziale,
    high --> indice finale */
    public static int[] sort(int[] arr, int low, int high) {
        if (low < high) {
/* pi è l'indice di partizionamento, arr[pi] è ora al
               posto giusto */
            int pi = partition(arr, low, high);
// Ordina ricorsivamente gli elementi prima di
// partition e dopo partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
        return arr;
    }

    // Programma guida.
    public static void main(String args[]) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        QuickSort.sort(arr, 0, n - 1);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(arr));
    }
} 