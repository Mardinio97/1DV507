package km222pw_assign3;
import java.util.Comparator;

public  class SortingAlgorithms {
    public static   void main(String[] args){
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        int[] int_array = { 11, 290, 3, 45, 35, 600, -7 };
        String[] string_array = {"S", "F", "A", "M", "Q", "B",
                "T"};
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
        sortingAlgorithms.insertionSort_INT(int_array);
        String[] com_array= sortingAlgorithms.insertionSort_String(string_array,comparator);


        for (int i = 0; i < com_array.length; i++) {
            System.out.print(com_array[i] + "\t");
        }
        System.out.println();


        for (int i = 0; i < int_array.length; i++) {
            if (i <6) {
                System.out.print(int_array[i] + " , ");
            }
            if (i ==6)
            {
                System.out.print(int_array[i] );
            }
        }

    }

    public  int[] insertionSort_INT(int[] in) {
        for (int i = 1; i < in.length; i++) {
            int curr = in[i];
            int j = i - 1;
            while (j >= 0 && curr < in[j]) {
                in[j + 1] = in[j];
                --j;
            }
            in[j + 1] = curr;
        }
        return in;
    }
    public  String[] insertionSort_String(String[] in, Comparator<String> c) {
        String[] array = in.clone();
        String curr;
        int i, j;
        for (j = 1; j < array.length; j++) {
            curr = array[j];
            i = j - 1;
            while (i >= 0) {
                if (c.compare(curr, array[i]) > 0) {
                    break;
                }
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = curr;
        }
        return array;
    }
}
