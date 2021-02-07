package Sort;

public class SortarePrinSelectie extends General {
    SortarePrinSelectie(int max) {
        super(max);
    }

    void  sortarePS() {
        int out, in, min;
        for (out = 0; out < nrElements - 1; out++) {
            min = out;
            for (in = out + 1; in < nrElements; in++) {
                if (arr[in] < arr[min]) {
                    min = in;
                    inverseazaPozitii(out, min);
                }
            }
        }
    }
}
