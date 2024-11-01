package kelompok.satu.utils;

import java.util.ArrayList;

public class ShellSort {
    public void sort(ArrayList<Integer> array, int arrSize) {
        for (int interval = arrSize / 2; interval > 0; interval /= 2) {

            for (int i = interval; i < arrSize; i++) {
                int temp = array.get(i);
                int j;

                for (j = i; j >= interval && array.get(j - interval) > temp; j -= interval) {
                    array.set(j, array.get(j - interval));
                }

                array.set(j, temp);
            }
        }
    }
}
