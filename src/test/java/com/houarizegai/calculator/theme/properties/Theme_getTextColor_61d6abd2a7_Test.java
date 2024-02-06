// ********RoostGPT********
/*
Test generated by RoostGPT for test privateMethodsJava using AI Type Open AI and AI Model gpt-4

1. Scenario: Test when textColor is null.
   Description: This scenario is to test the getTextColor function when the textColor is null. In this case, the function should return null.

2. Scenario: Test when textColor is an empty string.
   Description: This scenario is to test the getTextColor function when the textColor is an empty string. In this case, the function should return an empty string.

3. Scenario: Test when textColor is a valid color code.
   Description: This scenario is to test the getTextColor function when the textColor is a valid color code. In this case, the function should return the same color code.

4. Scenario: Test when textColor is a valid color name.
   Description: This scenario is to test the getTextColor function when the textColor is a valid color name. In this case, the function should return the same color name.

5. Scenario: Test when textColor is an invalid color code.
   Description: This scenario is to test the getTextColor function when the textColor is an invalid color code. In this case, the function should return the invalid color code as it's just a getter method.

6. Scenario: Test when textColor is an invalid color name.
   Description: This scenario is to test the getTextColor function when the textColor is an invalid color name. In this case, the function should return the invalid color name as it's just a getter method.

7. Scenario: Test when textColor contains special characters.
   Description: This scenario is to test the getTextColor function when the textColor contains special characters. In this case, the function should return the string with special characters as it's just a getter method. 

8. Scenario: Test when textColor contains numeric values.
   Description: This scenario is to test the getTextColor function when the textColor contains numeric values. In this case, the function should return the string with numeric values as it's just a getter method.
*/

// ********RoostGPT********
package com.houarizegai.calculator.theme.properties;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Theme_getTextColor_61d6abd2a7_Test {

    @Test
    public void testGetTextColorWhenNull() {
        Theme theme = new Theme();
        theme.setTextColor(null);
        assertNull(theme.getTextColor());
    }

    @Test
    public void testGetTextColorWhenEmptyString() {
        Theme theme = new Theme();
        theme.setTextColor("");
        assertEquals("", theme.getTextColor());
    }

    @Test
    public void testGetTextColorWhenValidColorCode() {
        Theme theme = new Theme();
        theme.setTextColor("#FFFFFF");
        assertEquals("#FFFFFF", theme.getTextColor());
    }

    @Test
    public void testGetTextColorWhenValidColorName() {
        Theme theme = new Theme();
        theme.setTextColor("white");
        assertEquals("white", theme.getTextColor());
    }

    @Test
    public void testGetTextColorWhenInvalidColorCode() {
        Theme theme = new Theme();
        theme.setTextColor("#ZZZZZZ");
        assertEquals("#ZZZZZZ", theme.getTextColor());
    }

    @Test
    public void testGetTextColorWhenInvalidColorName() {
        Theme theme = new Theme();
        theme.setTextColor("invalidColor");
        assertEquals("invalidColor", theme.getTextColor());
    }

    @Test
    public void testGetTextColorWhenSpecialCharacters() {
        Theme theme = new Theme();
        theme.setTextColor("@#$%^&*");
        assertEquals("@#$%^&*", theme.getTextColor());
    }

    @Test
    public void testGetTextColorWhenNumericValues() {
        Theme theme = new Theme();
        theme.setTextColor("123456");
        assertEquals("123456", theme.getTextColor());
    }
}
