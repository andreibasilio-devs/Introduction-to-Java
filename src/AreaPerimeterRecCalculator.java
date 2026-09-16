// Basilio, Andrei Kyle I.
// 2nd year BSIT majoring in Web Technology
// Sept 16, 2026
// Area and Perimeter of a Rectangular Garden Calculator

public class AreaPerimeterRecCalculator {
    public static void main(String[] args) {
        // This is my program showcasing the application of datatypes, variables, and basic arithmetic calculations.
        System.out.println("\nYou are task with helping a construction company estimate the materials needed to build a rectangular garden.\nThe company needs to know the area and perimater of the garden based on its fixed dimensions."); // Scenario given.
        int width = 36; // Given values stored in a variable for computation.
        int length = 52;

        int area = length * width; // Formula for area.
        int perimeter = 2 * (length + width); // Formular for perimeter.
        System.out.println("The width of the garden is " + width); // It prints the given values and the result of calculations using the given formula.
        System.out.println("The length of the garden is " + length);
        System.out.println("The area of the garden is " + area);
        System.out.println("The perimeter of the garden is " + perimeter);
    }
}
