
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.lang.Math;

public class Calculator {

    private static final Logger LOGGER = LogManager.getLogger(Calculator.class);

    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            Scanner sc = new Scanner(System.in);
            String message = "Select the appropriate option from the following list: \n" +
                    "1. Square root\n" +
                    "2. Factorial\n" +
                    "3. Natural Logarithm\n" +
                    "4. Power\n" +
                    "5. Exit\n" +
                    "Enter you choice: ";
            System.out.print(message);
            sc.nextLine();
            int operation = sc.nextInt();
            while (operation != 5) {
                System.out.println("====================================================");
                switch (operation) {
                    case 1:
                        System.out.print("Enter the number: ");
                        double numberSq = sc.nextDouble();
                        System.out.println("Square root of " + numberSq + " is: " + calculator.squareRoot(numberSq));
                        break;
                    case 2:
                        System.out.print("Enter the number: ");
                        int numberFact = sc.nextInt();
                        System.out.println("Factorial of " + numberFact + " is: " + calculator.factorial(numberFact));
                        break;
                    case 3:
                        System.out.print("Enter the number: ");
                        double numberLog = sc.nextDouble();
                        System.out.println("Natural Logarithmic value of " + numberLog + " is: " + calculator.logarithm(numberLog));
                        break;
                    case 4:
                        System.out.print("Enter the base number: ");
                        double number = sc.nextDouble();
                        System.out.print("Enter the power: ");
                        double power = sc.nextDouble();
                        System.out.println("Power function: " + number + "^" + power + " = " + calculator.power(number, power));
                        break;
                    default:
                        System.out.println("Invalid choice !!! please provide proper input");
                }
                System.out.println("====================================================");
                System.out.print(message);
                operation = sc.nextInt();
            }
        } catch (Exception exception) {
            System.out.println("Invalid Input found !!! please restart the application and provide proper input.");
            LOGGER.error("Invalid Input found !!! please restart the application and provide proper input.");
        }
    }

    public double squareRoot(double number) {
        double result = Math.sqrt(number);
        LOGGER.info("SQUARE_ROOT - Input:" + number + " - Output:" + result);
        return result;
    }

    public long factorial(int number) {
        int i = 1;
        long factorial = 1;
        while (i <= number) {
            factorial = factorial * i++;
        }
        LOGGER.info("FACTORIAL - Input:" + number + " - Output:" + factorial);
        return factorial;
    }

    public double logarithm(double number) {
        double result = Math.log(number);
        LOGGER.info("LOGARITHM - Input:" + number + " - Output:" + result);
        return result;
    }

    public double power(double number, double power) {
        double result = Math.pow(number, power);
        LOGGER.info("POWER_FUNCTION - Input:" + number + "^" + power + " - Output:" + result);
        return result;
    }

}