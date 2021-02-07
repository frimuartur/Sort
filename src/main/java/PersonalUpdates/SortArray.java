package PersonalUpdates;

public class SortArray {
    public int [] sortareBS(int[] array) {
        int temp = 0;
        int in = 0;
        int out = 0;
        for (out = array.length - 1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    temp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = temp;
                }
            }
        }
        return array;
    }


    // <-------------------------------------------------------------------------->
    // Sortare Prin Selectie //
// <-------------------------------------------------------------------------->
    public int [] sortarePS(int[] v) {
        boolean scambio;
        int j = v.length - 1;
        do {
            scambio = false;
            for (int i = 0; i < j; i++) {
                int temp;
                if (v[i] > v[i + 1]) {
                    temp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = temp;
                    scambio = true;
                }
            } // chiude il for
            j = j - 1;
        }
        while (scambio == true);
        return v;
    }

    // <-------------------------------------------------------------------------->
    // Sortare Prin Inserare //
// <-------------------------------------------------------------------------->

    public int[] sortarePI(int[] arr) {
        int in, out;
        for (out = 1; out < arr.length; out++) {
            double temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = (int) temp;
        }
        return arr;
    }

    public void afiseazaArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
