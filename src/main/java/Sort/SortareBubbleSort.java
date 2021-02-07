package Sort;

class SortareBubleSort extends General {
    SortareBubleSort(int max) {
        super(max);
    }

    public void sortareBS() {
        int in, out = 0, temp;
        for (out = nrElements - 1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    temp = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = temp;
                }
            }
        }
    }
}

