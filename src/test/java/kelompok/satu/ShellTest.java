package kelompok.satu;

import kelompok.satu.utils.SaltSeeder;
import kelompok.satu.utils.ShellSort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

public class ShellTest {
    @Test
    void testSaltIntArrayList() {
        ShellSort shellSort = new ShellSort();
        SaltSeeder saltSeeder = new SaltSeeder();
        Random randomSeeder = new Random();
        ArrayList<Integer> test = saltSeeder.getSaltNumber(randomSeeder, 10);

        System.out.println("=== Original Array ===");
        System.out.println(test.toString());

        double startTime = System.nanoTime();
        shellSort.sort(test, test.size());
        double endTime = System.nanoTime();
        double executionTime = (endTime - startTime) / 1000_000;
        double executionTimeNano = (endTime - startTime);

        System.out.println("=== Sorted Array ===");
        System.out.println(test.toString());
        System.out.println("Waktu yang dibutuhkan: " + executionTimeNano + "ns");
        System.out.println("Waktu yang dibutuhkan: " + executionTime + "ms");
    }

    @Test
    void testSaltIntArrayListThousands() {
        ShellSort shellSort = new ShellSort();
        SaltSeeder saltSeeder = new SaltSeeder();
        Random randomSeeder = new Random();
        ArrayList<Integer> test = saltSeeder.getSaltNumber(randomSeeder, 10000);

        System.out.println("=== Original Array ===");
        System.out.println(test.toString());

        double startTime = System.nanoTime();
        shellSort.sort(test, test.size());
        double endTime = System.nanoTime();
        double executionTime = (endTime - startTime) / 1000_000;
        double executionTimeNano = (endTime - startTime);

        System.out.println("=== Sorted Array ===");
        System.out.println(test.toString());
        System.out.println("Waktu yang dibutuhkan: " + executionTimeNano + "ns");
        System.out.println("Waktu yang dibutuhkan: " + executionTime + "ms");
    }

    @Test
    void testSaltIntArrayListChallenge() {
        ShellSort shellSort = new ShellSort();
        ArrayList<Integer> test = new ArrayList<>();
        test.add(9);
        test.add(8);
        test.add(7);
        test.add(6);
        test.add(5);
        test.add(4);
        test.add(3);
        test.add(2);
        test.add(1);
        test.add(0);

        System.out.println("=== Original Array ===");
        System.out.println(test.toString());

        double startTime = System.nanoTime();
        shellSort.sort(test, test.size());
        double endTime = System.nanoTime();
        double executionTime = (endTime - startTime) / 1000_000;
        double executionTimeNano = (endTime - startTime);

        System.out.println("=== Sorted Array ===");
        System.out.println(test.toString());
        System.out.println("Waktu yang dibutuhkan: " + executionTimeNano + "ns");
        System.out.println("Waktu yang dibutuhkan: " + executionTime + "ms");
    }
}
