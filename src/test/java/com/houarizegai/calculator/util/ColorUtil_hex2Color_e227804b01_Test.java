// ********RoostGPT********
/*
Test generated by RoostGPT for test privateMethodsJava using AI Type Open AI and AI Model gpt-4

1. **Scenario:** Test when the `colorHex` string is null.
    - **Expected Result:** The function should return null.

2. **Scenario:** Test when the `colorHex` string is empty.
    - **Expected Result:** The function should throw a `StringIndexOutOfBoundsException`.

3. **Scenario:** Test when the `colorHex` string is less than 6 characters long.
    - **Expected Result:** The function should throw a `StringIndexOutOfBoundsException`.

4. **Scenario:** Test when the `colorHex` string is 6 characters long and contains valid hexadecimal values.
    - **Input:** `FF0000`
    - **Expected Result:** The function should return a `Color` object with RGB values (255, 0, 0).

5. **Scenario:** Test when the `colorHex` string is more than 6 characters long.
    - **Input:** `FF0000FF`
    - **Expected Result:** The function should return a `Color` object with RGB values (255, 0, 0). The additional characters after the first 6 should be ignored.

6. **Scenario:** Test when the `colorHex` string contains non-hexadecimal characters.
    - **Input:** `ZZ0000`
    - **Expected Result:** The function should throw a `NumberFormatException`.

7. **Scenario:** Test when the `colorHex` string contains lowercase hexadecimal characters.
    - **Input:** `ff0000`
    - **Expected Result:** The function should return a `Color` object with RGB values (255, 0, 0). The function should be case-insensitive.

8. **Scenario:** Test when the `colorHex` string represents a non-red color.
    - **Input:** `00FF00`
    - **Expected Result:** The function should return a `Color` object with RGB values (0, 255, 0). 

9. **Scenario:** Test when the `colorHex` string represents a color with all RGB values.
    - **Input:** `FFFFFF`
    - **Expected Result:** The function should return a `Color` object with RGB values (255, 255, 255). 

10. **Scenario:** Test when the `colorHex` string represents a color with no RGB values.
    - **Input:** `000000`
    - **Expected Result:** The function should return a `Color` object with RGB values (0, 0, 0).
*/

// ********RoostGPT********
package com.houarizegai.calculator.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;

public class ColorUtil_hex2Color_e227804b01_Test {

    @Test
    public void testHex2ColorWhenColorHexIsNull() {
        assertNull(ColorUtil.hex2Color(null));
    }

    @Test
    public void testHex2ColorWhenColorHexIsEmpty() {
        assertThrows(StringIndexOutOfBoundsException.class, () -> ColorUtil.hex2Color(""));
    }

    @Test
    public void testHex2ColorWhenColorHexIsLessThanSixCharacters() {
        assertThrows(StringIndexOutOfBoundsException.class, () -> ColorUtil.hex2Color("FF00"));
    }

    @Test
    public void testHex2ColorWhenColorHexIsSixCharacters() {
        assertEquals(new Color(255, 0, 0), ColorUtil.hex2Color("FF0000"));
    }

    @Test
    public void testHex2ColorWhenColorHexIsMoreThanSixCharacters() {
        assertEquals(new Color(255, 0, 0), ColorUtil.hex2Color("FF0000FF"));
    }

    @Test
    public void testHex2ColorWhenColorHexContainsInvalidHexadecimalCharacters() {
        assertThrows(NumberFormatException.class, () -> ColorUtil.hex2Color("ZZ0000"));
    }

    @Test
    public void testHex2ColorWhenColorHexContainsLowercaseHexadecimalCharacters() {
        assertEquals(new Color(255, 0, 0), ColorUtil.hex2Color("ff0000"));
    }

    @Test
    public void testHex2ColorWhenColorHexRepresentsNonRedColor() {
        assertEquals(new Color(0, 255, 0), ColorUtil.hex2Color("00FF00"));
    }

    @Test
    public void testHex2ColorWhenColorHexRepresentsColorWithAllRGBValues() {
        assertEquals(new Color(255, 255, 255), ColorUtil.hex2Color("FFFFFF"));
    }

    @Test
    public void testHex2ColorWhenColorHexRepresentsColorWithNoRGBValues() {
        assertEquals(new Color(0, 0, 0), ColorUtil.hex2Color("000000"));
    }
}
