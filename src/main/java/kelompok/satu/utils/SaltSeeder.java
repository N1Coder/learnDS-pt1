package kelompok.satu.utils;

import java.util.ArrayList;
import java.util.Random;

public class SaltSeeder {
    public SaltSeeder() {
    }

    public String getSaltString(Random randomSeeder, int stringLength) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();

        while (salt.length() < stringLength) { // length of the random string.
            int index = (int) (randomSeeder.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
    public ArrayList<Integer> getSaltNumber(Random randomSeeder, int numberLength) {
        int minVal = 1;
        int range = numberLength - minVal + 1;
        ArrayList<Integer> saltNumbers = new ArrayList<>(numberLength);

        for (int i = 0; i < numberLength; i++) {
            int randomNum = randomSeeder.nextInt(range) + minVal;
            saltNumbers.add(randomNum);
        }

        return saltNumbers;
    }
}