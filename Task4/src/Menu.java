import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        char choice;
       while(isRunning) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Choose what operation you want to perform :");
            System.out.println("\nA. Convert from any system to the decimal system");
            System.out.println("B. Convert from decimal system to another system");
            System.out.println("C. Summing up numbers from different systems");
            System.out.println("D. Subtracting numbers from different systems");
            System.out.println("E. Multiplying numbers from different systems");
            System.out.println("F. Dividing numbers from different systems");
            System.out.println("\nW. Exit the program");

            choice = scanner.nextLine().toUpperCase().charAt(0);

            switch (choice) {
                case 'A':
                    System.out.println("Enter the number to convert:");
                    String numberStr = scanner.nextLine();
                    System.out.println("Enter the base of the number:");
                    int base = Integer.parseInt(scanner.nextLine());
                    int decimal = convertToDecimal(numberStr, base);
                    System.out.println("Decimal equivalent: " + decimal);
                    break;
                case 'B':
                    System.out.println("Enter the decimal number to convert:");
                    int decimalNum = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the base to convert to:");
                    int baseToConvert = Integer.parseInt(scanner.nextLine());
                    String convertedNum = convertFromDecimal(decimalNum, baseToConvert);
                    System.out.println("Converted number: " + convertedNum);
                    break;
                case 'C':
                    System.out.println("Enter the first number:");
                    String num1Str = scanner.nextLine();
                    System.out.println("Enter the base of the first number:");
                    int num1Base = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the second number:");
                    String num2Str = scanner.nextLine();
                    System.out.println("Enter the base of the second number:");
                    int num2Base = Integer.parseInt(scanner.nextLine());
                    int sum = convertToDecimal(num1Str, num1Base) + convertToDecimal(num2Str, num2Base);
                    System.out.println("Sum: " + convertFromDecimal(sum, num1Base));
                    break;
                case 'D':
                    System.out.println("Enter the first number:");
                    String num3Str = scanner.nextLine();
                    System.out.println("Enter the base of the first number:");
                    int num3Base = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the second number:");
                    String num4Str = scanner.nextLine();
                    System.out.println("Enter the base of the second number:");
                    int num4Base = Integer.parseInt(scanner.nextLine());
                    int difference = convertToDecimal(num3Str, num3Base) - convertToDecimal(num4Str, num4Base);
                    System.out.println("Difference: " + convertFromDecimal(difference, num3Base));
                    break;
                case 'E':
                    System.out.print("Enter the first number: ");
                    String firstNumber = scanner.nextLine();
                    System.out.print("Enter the base of the first number: ");
                    int firstBase = scanner.nextInt();
                    scanner.nextLine(); // clear the input buffer
                    System.out.print("Enter the second number: ");
                    String secondNumber = scanner.nextLine();
                    System.out.print("Enter the base of the second number: ");
                    int secondBase = scanner.nextInt();
                    scanner.nextLine(); // clear the input buffer

                    int product = convertToDecimal(firstNumber, firstBase) * convertToDecimal(secondNumber, secondBase);
                    System.out.print("Enter the base to convert the result to: ");
                    int resultBase = scanner.nextInt();
                    scanner.nextLine(); // clear the input buffer

                    String result = convertFromDecimal(product, resultBase);
                    System.out.println("Result: " + result);
                    break;
                case 'F':
                    System.out.print("Enter the first number: ");
                    String first = scanner.nextLine();
                    System.out.print("Enter the base of the first number: ");
                    int base1 = scanner.nextInt();
                    scanner.nextLine(); // clear the input buffer
                    System.out.print("Enter the second number: ");
                    String second = scanner.nextLine();
                    System.out.print("Enter the base of the second number: ");
                    int base2 = scanner.nextInt();
                    scanner.nextLine(); // clear the input buffer

                    difference = convertToDecimal(first, base1) - convertToDecimal(second, base2);
                    System.out.print("Enter the base to convert the result to: ");
                    int resBase = scanner.nextInt();
                    scanner.nextLine(); // clear the input buffer

                    String subResult = convertFromDecimal(difference, resBase);
                    System.out.println("Result: " + subResult);
                    break;
                case 'W':
                   isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option selected. Please try again.");
            }
        }

        scanner.close();
    }

    private static int convertToDecimal(String number, int base) {
        return Integer.parseInt(number, base);
    }

    private static String convertFromDecimal(int number, int base) {
        return Integer.toString(number, base);
    }
}
