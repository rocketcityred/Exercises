package org.rocketcity.puzzles;

import org.testng.annotations.Test;

public class RomansToIntTest {

    @Test
    void testRomansToInt() {
        RomansToInt romanToInt = new RomansToInt();
        int value = romanToInt.romanToInt("MCMXCIV");
        System.out.println(value);
    }
}
