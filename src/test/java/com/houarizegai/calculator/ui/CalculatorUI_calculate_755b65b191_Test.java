// ********RoostGPT********
/*
Test generated by RoostGPT for test privateMethodsJava using AI Type Open AI and AI Model gpt-4

Here are some test scenarios for the function calculate:

1. Test Scenario: Addition of two positive numbers
   - Input: firstNumber = 4, secondNumber = 5, operator = '+'
   - Expected Output: 9.0

2. Test Scenario: Subtraction of two positive numbers where the first number is greater than the second
   - Input: firstNumber = 10, secondNumber = 5, operator = '-'
   - Expected Output: 5.0

3. Test Scenario: Subtraction of two positive numbers where the second number is greater than the first
   - Input: firstNumber = 2, secondNumber = 5, operator = '-'
   - Expected Output: -3.0

4. Test Scenario: Multiplication of two positive numbers
   - Input: firstNumber = 3, secondNumber = 5, operator = '*'
   - Expected Output: 15.0

5. Test Scenario: Division of two positive numbers where the first number is greater than the second
   - Input: firstNumber = 10, secondNumber = 5, operator = '/'
   - Expected Output: 2.0

6. Test Scenario: Division of two positive numbers where the second number is greater than the first
   - Input: firstNumber = 5, secondNumber = 10, operator = '/'
   - Expected Output: 0.5

7. Test Scenario: Division by zero
   - Input: firstNumber = 5, secondNumber = 0, operator = '/'
   - Expected Output: Infinity (or throw an exception based on your design)

8. Test Scenario: Modulo operation of two positive numbers where the first number is greater than the second
   - Input: firstNumber = 10, secondNumber = 3, operator = '%'
   - Expected Output: 1.0

9. Test Scenario: Power operation where the base and exponent are positive numbers
   - Input: firstNumber = 2, secondNumber = 3, operator = '^'
   - Expected Output: 8.0

10. Test Scenario: Power operation where the base is a positive number and the exponent is zero
    - Input: firstNumber = 2, secondNumber = 0, operator = '^'
    - Expected Output: 1.0

11. Test Scenario: Invalid operator
    - Input: firstNumber = 2, secondNumber = 3, operator = 'a'
    - Expected Output: 3.0 (returns secondNumber as per default case in switch statement)
*/

// ********RoostGPT********
package com.houarizegai.calculator.ui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorUI_calculate_755b65b191_Test {

    private CalculatorUI calculatorUI = new CalculatorUI();

    @Test
    public void testCalculate() {
        // Test Scenario 1: Addition of two positive numbers
        assertEquals(9.0, calculatorUI.calculate(4, 5, '+'));

        // Test Scenario 2: Subtraction of two positive numbers where the first number is greater than the second
        assertEquals(5.0, calculatorUI.calculate(10, 5, '-'));

        // Test Scenario 3: Subtraction of two positive numbers where the second number is greater than the first
        assertEquals(-3.0, calculatorUI.calculate(2, 5, '-'));

        // Test Scenario 4: Multiplication of two positive numbers
        assertEquals(15.0, calculatorUI.calculate(3, 5, '*'));

        // Test Scenario 5: Division of two positive numbers where the first number is greater than the second
        assertEquals(2.0, calculatorUI.calculate(10, 5, '/'));

        // Test Scenario 6: Division of two positive numbers where the second number is greater than the first
        assertEquals(0.5, calculatorUI.calculate(5, 10, '/'));

        // Test Scenario 7: Division by zero
        assertEquals(Double.POSITIVE_INFINITY, calculatorUI.calculate(5, 0, '/'));

        // Test Scenario 8: Modulo operation of two positive numbers where the first number is greater than the second
        assertEquals(1.0, calculatorUI.calculate(10, 3, '%'));

        // Test Scenario 9: Power operation where the base and exponent are positive numbers
        assertEquals(8.0, calculatorUI.calculate(2, 3, '^'));

        // Test Scenario 10: Power operation where the base is a positive number and the exponent is zero
        assertEquals(1.0, calculatorUI.calculate(2, 0, '^'));

        // Test Scenario 11: Invalid operator
        assertEquals(3.0, calculatorUI.calculate(2, 3, 'a'));
    }
}
