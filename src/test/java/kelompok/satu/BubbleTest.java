package kelompok.satu;
import kelompok.satu.utils.SaltSeeder;
import kelompok.satu.utils.BubbleSort;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleTest {
    @Test
    void testSaltIntArrayList() {
        BubbleSort bubbleSort = new BubbleSort();
        SaltSeeder saltSeeder = new SaltSeeder();
        Random randomSeeder = new Random();
        ArrayList<Integer> test = saltSeeder.getSaltNumber(randomSeeder, 10);

        System.out.println("=== Original Array ===");
        System.out.println(test.toString());

        bubbleSort.sort(test);
        System.out.println("=== Sorted Array ===");
        System.out.println(test.toString());
    }

    @Test
    void testSaltThousandIntArrayList() {
        BubbleSort bubbleSort = new BubbleSort();
        SaltSeeder saltSeeder = new SaltSeeder();
        Random randomSeeder = new Random();
        ArrayList<Integer> test = saltSeeder.getSaltNumber(randomSeeder, 1000);

        System.out.println("=== Original Array ===");
        System.out.println(test.toString());

        bubbleSort.sort(test);
        System.out.println("=== Sorted Array ===");
        System.out.println(test.toString());
    }

    @Test
    void testSaltQueue() throws Exception {
        BubbleSort bubbleSort = new BubbleSort();
        SaltSeeder saltSeeder = new SaltSeeder();
        Random randomSeeder = new Random();
        ArrayList<Integer> test = saltSeeder.getSaltNumber(randomSeeder, 1000);

        Queue<Integer> integerQueue = new Queue<>();

        for (int i = 0; i < test.size(); i++) {
            Integer s = test.get(i);
            integerQueue.offer(s);
        }

        bubbleSort.sort(test);
        String strTest = test.stream().map(String::valueOf).collect(Collectors.joining(" -> "));

        System.out.println("=== Nilai Awal Hasil Angka (Queue) ===");
        System.out.println(integerQueue.toString());

        System.out.println("=== Ekspetasi Hasil Angka ===");
        System.out.println(strTest);

        integerQueue.bubbleSort(integerQueue.getFirstNode());

        System.out.println("=== Nilai Aktual Hasil Angka (Queue) ===");
        System.out.println(integerQueue.toString());


        assertEquals(strTest, integerQueue.toString());
    }

    @Test
    void sortChallenge() {
        BubbleSort bubbleSort = new BubbleSort();
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(2);
        nums.add(6);
        nums.add(7);
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(8);
        nums.add(1);
        nums.add(9);
        nums.add(0);

        System.out.println(nums.toString());

//        bubbleSort.sort(nums);
        bubbleSort.displaySortProcess(nums);

//        System.out.println(nums.toString());

    }

    @Test
    void testSaltStack() throws Exception {
        BubbleSort bubbleSort = new BubbleSort();
        SaltSeeder saltSeeder = new SaltSeeder();
        Random randomSeeder = new Random();
        ArrayList<Integer> test = saltSeeder.getSaltNumber(randomSeeder, 1000);

        Stack<Integer> integerStack = new Stack<>();

        for (int i = 0; i < test.size(); i++) {
            Integer s = test.get(i);
            integerStack.add(s);
        }

        bubbleSort.sort(test);
        String strTest = test.stream().map(String::valueOf).collect(Collectors.joining(" -> "));

        System.out.println("=== Nilai Awal Hasil Angka (Stack) ===");
        System.out.println(integerStack.toString());

        System.out.println("=== Ekspetasi Hasil Angka ===");
        System.out.println(strTest);

        integerStack.bubbleSort(integerStack.getFirstNode());

        System.out.println("=== Nilai Aktual Hasil Angka (Stack) ===");
        System.out.println(integerStack.toString());


        assertEquals(strTest, integerStack.toString());
    }
}
