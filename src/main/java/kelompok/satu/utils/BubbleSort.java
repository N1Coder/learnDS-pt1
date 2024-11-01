package kelompok.satu.utils;

import java.util.ArrayList;

public class BubbleSort {
    public void sort(ArrayList<Integer> array) {
        for(int i = 0; i < array.size() - 1; i++) {

            for(int j = 0; j < array.size() - i - 1; j++) {

                if(array.get(j) > array.get(j + 1)) {

                    int temp = array.get(j);

                    array.set(j, array.get(j + 1));

                    array.set(j + 1, temp);
                }

            }

            System.out.println(i);
        }
    }

    public void displaySortProcess(ArrayList<Integer> array) {
        for(int i = 0; i < array.size(); i++) {
            for(int j = 0; j < array.size() - i - 1; j++) {

                if(array.get(j) > array.get(j + 1)) {

                    System.out.println("Swap " + array.get(j) + " and " + array.get(j + 1));

                    int temp = array.get(j);

                    array.set(j, array.get(j + 1));

                    array.set(j + 1, temp);

                    System.out.println(array.toString());
                }

            }

        }
    }
}
