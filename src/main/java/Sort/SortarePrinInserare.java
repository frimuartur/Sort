package Sort;

public class SortarePrinInserare extends General {

    SortarePrinInserare(int max) {
        super(max);
    }

    void sortarePI(int[] array3) {
        int in, out;
        for (out = 1; out < nrElements; out++) {
            double temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = (int) temp;
        }
    }
}
