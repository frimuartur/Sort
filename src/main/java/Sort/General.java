package Sort;

public class General {
    public int[] arr;
    public int nrElements;

    General(int max) {
        arr = new int[max];
        nrElements = 0;
    }

    public void introduElement(int element) {
        arr[nrElements] = element;
        nrElements++;
    }

    public void afiseaza() {
        System.out.print("[ ");
        for (int i = 0; i < nrElements; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public void inverseazaPozitii(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
    public void creareArray(int [] arr, int size){
        for(int i = 0; i < size; i ++){
            int a = (int) (Math.random() * 100);
            arr[i] = a;
        }
    }
}

