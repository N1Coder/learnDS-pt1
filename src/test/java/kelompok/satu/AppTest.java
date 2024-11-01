package kelompok.satu;

import kelompok.satu.utils.SaltSeeder;
import kelompok.satu.utils.SwapperString;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for Queue and Stack data structures.
 */
public class AppTest {
    /**
     * Happy Testing :-)
     */
    @Test
    void testPopEmptyStack() {
        Stack<String> stringStack = new Stack<>();

        assertThrows(Exception.class, stringStack::pop);
        System.out.println("Tidak bisa melakukan pop pada stack kosong!");
    }

    @Test
    void testPopEmptyQueue() {
        Queue<Integer> integerQueue = new Queue<>();

        assertThrows(Exception.class, integerQueue::pop);
        System.out.println("Tidak bisa melakukan pop pada queue kosong!");
    }

    @Test
    void testAlpha() {
        String testAlpha = "ABCDE";

        Stack<String> stringStack = new Stack<>();

        String[] testString = testAlpha.split("");

        for (int i = 0; i < testString.length; i++) {
            stringStack.add(testString[i]);
        }

        System.out.println(testAlpha);
        System.out.println(stringStack.toString());

        try {
            stringStack.swap(0, testAlpha.length() - 1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(stringStack);
    }

    @Test
    void addElementIntoStack() {
//        For comparing only
        SaltSeeder saltSeeder = new SaltSeeder();
        Random randomSeeder = new Random();
        String test = saltSeeder.getSaltString(randomSeeder, 5);
        StringBuffer testExpectedResult = new StringBuffer(test);
        testExpectedResult.reverse();

        Stack<String> stringStack = new Stack<>();

        String[] testString = test.split("");
        for (int i = 0; i < testString.length; i++) {
            String s = testString[i];
            stringStack.add(s);
        }
        assertEquals(testExpectedResult.toString(), stringStack.toString());

        System.out.println("=== Nilai Awal String ===");
        System.out.println(test);

        System.out.println("=== Ekspetasi Hasil String ===");
        System.out.println(testExpectedResult);

        System.out.println("=== Nilai Aktual Hasil String ===");
        System.out.println(stringStack.toString());
    }

    @Test
    void addElementIntoQueue() {
        SaltSeeder saltSeeder = new SaltSeeder();
        Random randomSeeder = new Random();
        String test = saltSeeder.getSaltString(randomSeeder, 5);
        StringBuffer testExpectedResult = new StringBuffer(test);

        Queue<String> stringQueue = new Queue<>();

        String[] testString = test.split(" ");
        for (int i = 0; i < testString.length; i++) {
            String s = testString[i];
            stringQueue.offer(s);
        }

        assertEquals(testExpectedResult.toString(), stringQueue.toString());

        System.out.println("=== Nilai Awal String ===");
        System.out.println(test);

        System.out.println("=== Ekspetasi Hasil String ===");
        System.out.println(testExpectedResult);

        System.out.println("=== Nilai Aktual Hasil String ===");
        System.out.println(stringQueue.toString());
    }

    @Test
    void popElementFromStack() {
        SaltSeeder saltSeeder = new SaltSeeder();
        Random randomSeeder = new Random();
        String test = saltSeeder.getSaltString(randomSeeder, 10);
        StringBuffer testExpectedResult = new StringBuffer(test);
        testExpectedResult.reverse();
        testExpectedResult.deleteCharAt(0);

        Stack<String> stringStack = new Stack<>();

        String[] testString = test.split("");
        for (int i = 0; i < testString.length; i++) {
            String s = testString[i];
            stringStack.add(s);
        }

        try {
            stringStack.pop();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        assertEquals(testExpectedResult.toString(), stringStack.toString());

        System.out.println("=== Nilai Awal String ===");
        System.out.println(test);

        System.out.println("=== Ekspetasi Hasil String ===");
        System.out.println(testExpectedResult.toString());

        System.out.println("=== Nilai Aktual Hasil String ===");
        System.out.println(stringStack);
    }

    @Test
    void popElementFromQueue() {
        SaltSeeder saltSeeder = new SaltSeeder();
        Random randomSeeder = new Random();
        String test = saltSeeder.getSaltString(randomSeeder, 5);
        StringBuffer testExpectedResult = new StringBuffer(test);
        testExpectedResult.deleteCharAt(0);

        Queue<String> stringQueue = new Queue<>();

        String[] testString = test.split("");
        for (int i = 0; i < testString.length; i++) {
            String s = testString[i];
            stringQueue.offer(s);
        }

        try {
            stringQueue.pop();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        assertEquals(testExpectedResult.toString(), stringQueue.toString());

        System.out.println("=== Nilai Awal String ===");
        System.out.println(test);

        System.out.println("=== Ekspetasi Hasil String ===");
        System.out.println(testExpectedResult.toString());

        System.out.println("=== Nilai Aktual Hasil String ===");
        System.out.println(stringQueue.toString());
    }

    @Test
    void swapElementFromStack() {
        int firstIndex = 1, secondIndex = 2;

        SaltSeeder saltSeeder = new SaltSeeder();
        SwapperString swapperString = new SwapperString();
        Random randomSeeder = new Random();

        String test = saltSeeder.getSaltString(randomSeeder, 5);
        StringBuffer testExpectedResult = new StringBuffer(test);
        testExpectedResult.reverse();
        String testSwapString = swapperString.swapChars(testExpectedResult.toString(), firstIndex, secondIndex);

        Stack<String> stringStack = new Stack<>();

        String[] testString = test.split("");
        for (int i = 0; i < testString.length; i++) {
            String s = testString[i];
            stringStack.add(s);
        }

        try {
            stringStack.swap(firstIndex, secondIndex);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        assertEquals(testSwapString, stringStack.toString());

        System.out.println("=== Nilai Awal String ===");
        System.out.println(test);

        System.out.println("=== Ekspetasi Hasil String ===");
        System.out.println(testSwapString);

        System.out.println("=== Nilai Aktual Hasil String ===");
        System.out.println(stringStack.toString());
    }

    @Test
    void swapElementFromQueue() {
        int firstIndex = 1, secondIndex = 3;

        SaltSeeder saltSeeder = new SaltSeeder();
        SwapperString swapperString = new SwapperString();
        Random randomSeeder = new Random();

        String test = saltSeeder.getSaltString(randomSeeder, 5);
        StringBuffer testExpectedResult = new StringBuffer(test);
        String testSwapString = swapperString.swapChars(testExpectedResult.toString(), firstIndex, secondIndex);

        Queue<String> stringQueue = new Queue<>();

        String[] testString = test.split("");
        for (int i = 0; i < testString.length; i++) {
            String s = testString[i];
            stringQueue.offer(s);
        }

        try {
            stringQueue.swap(firstIndex, secondIndex);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        assertEquals(testSwapString, stringQueue.toString());

        System.out.println("=== Nilai Awal String ===");
        System.out.println(test);

        System.out.println("=== Ekspetasi Hasil String ===");
        System.out.println(testSwapString);

        System.out.println("=== Nilai Aktual Hasil String ===");
        System.out.println(stringQueue.toString());
    }
}
