// ********RoostGPT********
/*
Test generated by RoostGPT for test privateMethodsJava using AI Type Open AI and AI Model gpt-4

1. **Scenario:** Valid Hexadecimal String
   - **Description:** Test with a valid hexadecimal string that represents a color.
   - **Input:** "FFFFFF" (White)
   - **Expected Output:** A Color object representing white.

2. **Scenario:** Invalid Hexadecimal String
   - **Description:** Test with an invalid hexadecimal string that doesn't represent a color.
   - **Input:** "ZZZZZZ"
   - **Expected Output:** Null or Exception.

3. **Scenario:** Hexadecimal String Representing Black
   - **Description:** Test with a hexadecimal string representing black.
   - **Input:** "000000" (Black)
   - **Expected Output:** A Color object representing black.

4. **Scenario:** Hexadecimal String Representing Red
   - **Description:** Test with a hexadecimal string representing red.
   - **Input:** "FF0000" (Red)
   - **Expected Output:** A Color object representing red.

5. **Scenario:** Hexadecimal String Representing Green
   - **Description:** Test with a hexadecimal string representing green.
   - **Input:** "00FF00" (Green)
   - **Expected Output:** A Color object representing green.

6. **Scenario:** Hexadecimal String Representing Blue
   - **Description:** Test with a hexadecimal string representing blue.
   - **Input:** "0000FF" (Blue)
   - **Expected Output:** A Color object representing blue.

7. **Scenario:** Null Input
   - **Description:** Test with a null input.
   - **Input:** null
   - **Expected Output:** Null

8. **Scenario:** Empty String
   - **Description:** Test with an empty string.
   - **Input:** ""
   - **Expected Output:** Null or Exception.

9. **Scenario:** Hexadecimal String With Less Than 6 Characters
   - **Description:** Test with a hexadecimal string that has less than six characters.
   - **Input:** "12345"
   - **Expected Output:** Null or Exception.

10. **Scenario:** Hexadecimal String With More Than 6 Characters
    - **Description:** Test with a hexadecimal string that has more than six characters.
    - **Input:** "1234567"
    - **Expected Output:** Null or Exception or a Color object based on the first six characters.
*/

// ********RoostGPT********
package com.houarizegai.calculator.util;

import java.awt.*;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColorUtil_hex2Color_e227804b01_Test {

    @Test
    public void testHex2ColorWithValidHexadecimal() {
        String colorHex = "FFFFFF";
        Color expected = new Color(255, 255, 255);
        Color actual = ColorUtil.hex2Color(colorHex);
        assertEquals(expected, actual);
    }

    @Test
    public void testHex2ColorWithInvalidHexadecimal() {
        String colorHex = "ZZZZZZ";
        Color actual = ColorUtil.hex2Color(colorHex);
        assertNull(actual);
    }

    @Test
    public void testHex2ColorWithBlackHexadecimal() {
        String colorHex = "000000";
        Color expected = new Color(0, 0, 0);
        Color actual = ColorUtil.hex2Color(colorHex);
        assertEquals(expected, actual);
    }

    @Test
    public void testHex2ColorWithRedHexadecimal() {
        String colorHex = "FF0000";
        Color expected = new Color(255, 0, 0);
        Color actual = ColorUtil.hex2Color(colorHex);
        assertEquals(expected, actual);
    }

    @Test
    public void testHex2ColorWithGreenHexadecimal() {
        String colorHex = "00FF00";
        Color expected = new Color(0, 255, 0);
        Color actual = ColorUtil.hex2Color(colorHex);
        assertEquals(expected, actual);
    }

    @Test
    public void testHex2ColorWithBlueHexadecimal() {
        String colorHex = "0000FF";
        Color expected = new Color(0, 0, 255);
        Color actual = ColorUtil.hex2Color(colorHex);
        assertEquals(expected, actual);
    }

    @Test
    public void testHex2ColorWithNullInput() {
        String colorHex = null;
        Color actual = ColorUtil.hex2Color(colorHex);
        assertNull(actual);
    }

    @Test
    public void testHex2ColorWithEmptyString() {
        String colorHex = "";
        Color actual = ColorUtil.hex2Color(colorHex);
        assertNull(actual);
    }

    @Test
    public void testHex2ColorWithLessThanSixCharacters() {
        String colorHex = "12345";
        Color actual = ColorUtil.hex2Color(colorHex);
        assertNull(actual);
    }

    @Test
    public void testHex2ColorWithMoreThanSixCharacters() {
        String colorHex = "1234567";
        Color expected = new Color(18, 52, 86);
        Color actual = ColorUtil.hex2Color(colorHex);
        assertEquals(expected, actual);
    }
}
