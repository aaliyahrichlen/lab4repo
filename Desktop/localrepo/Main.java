import java.util.Scanner;

public class Main {

    public static int theValue(int name) {
        switch (name) {
            case 'A':
                name = 10;
                break;
            case 'B':
                name = 11;
                break;
            case 'C':
                name = 12;
                break;
            case 'D':
                name = 13;
                break;
            case 'E':
                name = 14;
                break;
            case 'F':
                name = 15;
                break;
            case 'x':
                name = 0;
                break;
            case '0':
                name = 0;
                break;
            default:
                name = Character.getNumericValue(name);
                break;
        }
        return name;
    }
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String userInput = scnr.next();
        //userInput = String.toUpperCase();
        int stringLength = userInput.length();
        long decimalNumber = 0;
        long number0;
        long number1;
        long number2;
        long number3;
        long number4;
        long number5;
        long number6;
        long number7;
        long number8;
        long number9;

        if (stringLength == 1)  {
            char let0 = userInput.charAt(0);
            number0 = theValue(let0);
            decimalNumber = number0;
        }
        if (stringLength == 2) {
            char let1 = userInput.charAt(0);
            number1 = theValue(let1);
            char let0 = userInput.charAt(1);
            number0 = theValue(let0);
            decimalNumber = number0 + number1 * 16;
        }
        if (stringLength == 3) {
            char let2 = userInput.charAt(0);
            number2 = theValue(let2);
            char let1 = userInput.charAt(1);
            number1 = theValue(let1);
            char let0 = userInput.charAt(2);
            number0 = theValue(let0);
            decimalNumber = number0 + number1 * 16 + number2 * (int)Math.pow(16,2);
        }
        if (stringLength == 4) {
            char let3 = userInput.charAt(0);
            number3 = theValue(let3);
            char let2 = userInput.charAt(1);
            number2 = theValue(let2);
            char let1 = userInput.charAt(2);
            number1 = theValue(let1);
            char let0 = userInput.charAt(3);
            number0 = theValue(let0);
            decimalNumber = number0 + number1 * 16 + number2 * (int)Math.pow(16,2) + number3 * (int)Math.pow(16,3);
        }
        if (stringLength == 5) {
            char let4 = userInput.charAt(0);
            number4 = theValue(let4);
            char let3 = userInput.charAt(1);
            number3 = theValue(let3);
            char let2 = userInput.charAt(2);
            number2 = theValue(let2);
            char let1 = userInput.charAt(3);
            number1 = theValue(let1);
            char let0 = userInput.charAt(4);
            number0 = theValue(let0);
            decimalNumber = number0 + number1 * 16 + number2 * (int)Math.pow(16,2) + number3 * (int)Math.pow(16,3) + number4 * (int)Math.pow(16,4);
        }
        if (stringLength == 6) {
            char let5 = userInput.charAt(0);
            number5 = theValue(let5);
            char let4 = userInput.charAt(1);
            number4 = theValue(let4);
            char let3 = userInput.charAt(2);
            number3 = theValue(let3);
            char let2 = userInput.charAt(3);
            number2 = theValue(let2);
            char let1 = userInput.charAt(4);
            number1 = theValue(let1);
            char let0 = userInput.charAt(5);
            number0 = theValue(let0);
            decimalNumber = number0 + number1 * 16 + number2 * (int)Math.pow(16,2) + number3 * (int)Math.pow(16,3) + number4 * (int)Math.pow(16,4) + number5 * (int)Math.pow(16,5);
        }
        if (stringLength == 7) {
            char let6 = userInput.charAt(0);
            number6 = theValue(let6);
            char let5 = userInput.charAt(1);
            number5 = theValue(let5);
            char let4 = userInput.charAt(2);
            number4 = theValue(let4);
            char let3 = userInput.charAt(3);
            number3 = theValue(let3);
            char let2 = userInput.charAt(4);
            number2 = theValue(let2);
            char let1 = userInput.charAt(5);
            number1 = theValue(let1);
            char let0 = userInput.charAt(6);
            number0 = theValue(let0);
            decimalNumber = number0 + number1 * 16 + number2 * (int)Math.pow(16,2) + number3 * (int)Math.pow(16,3) + number4 * (int)Math.pow(16,4) + number5 * (int)Math.pow(16,5) + number6 * (int)Math.pow(16,6);
        }
        if (stringLength == 8) {
            char let7 = userInput.charAt(0);
            number7 = theValue(let7);
            char let6 = userInput.charAt(1);
            number6 = theValue(let6);
            char let5 = userInput.charAt(2);
            number5 = theValue(let5);
            char let4 = userInput.charAt(3);
            number4 = theValue(let4);
            char let3 = userInput.charAt(4);
            number3 = theValue(let3);
            char let2 = userInput.charAt(5);
            number2 = theValue(let2);
            char let1 = userInput.charAt(6);
            number1 = theValue(let1);
            char let0 = userInput.charAt(7);
            number0 = theValue(let0);
            decimalNumber = number0 + number1 * 16 + number2 * (int)Math.pow(16,2) + number3 * (int)Math.pow(16,3) + number4 * (int)Math.pow(16,4) + number5 * (int)Math.pow(16,5) + number6 * (int)Math.pow(16,6) + number7 * (int)Math.pow(16,7);
        }
        if (stringLength == 9) {
            char let8 = userInput.charAt(0);
            number8 = theValue(let8);
            char let7 = userInput.charAt(1);
            number7 = theValue(let7);
            char let6 = userInput.charAt(2);
            number6 = theValue(let6);
            char let5 = userInput.charAt(3);
            number5 = theValue(let5);
            char let4 = userInput.charAt(4);
            number4 = theValue(let4);
            char let3 = userInput.charAt(5);
            number3 = theValue(let3);
            char let2 = userInput.charAt(6);
            number2 = theValue(let2);
            char let1 = userInput.charAt(7);
            number1 = theValue(let1);
            char let0 = userInput.charAt(8);
            number0 = theValue(let0);
            decimalNumber = number0 + number1 * 16 + number2 * (int)Math.pow(16,2) + number3 * (int)Math.pow(16,3) + number4 * (int)Math.pow(16,4) + number5 * (int)Math.pow(16,5) + number6 * (int)Math.pow(16,6) + number7 * (int)Math.pow(16,7) + number8 * (int)Math.pow(16,8);
        }
        if (stringLength == 10) {
            char let9 = userInput.charAt(0);
            number9 = theValue(let9);
            char let8 = userInput.charAt(1);
            number8 = theValue(let8);
            char let7 = userInput.charAt(2);
            number7 = theValue(let7);
            char let6 = userInput.charAt(3);
            number6 = theValue(let6);
            char let5 = userInput.charAt(4);
            number5 = theValue(let5);
            char let4 = userInput.charAt(5);
            number4 = theValue(let4);
            char let3 = userInput.charAt(6);
            number3 = theValue(let3);
            char let2 = userInput.charAt(7);
            number2 = theValue(let2);
            char let1 = userInput.charAt(8);
            number1 = theValue(let1);
            char let0 = userInput.charAt(9);
            number0 = theValue(let0);
            decimalNumber = number0 + number1 * 16 + number2 * (int)Math.pow(16,2) + number3 * (int)Math.pow(16,3) + number4 * (int)Math.pow(16,4) + number5 * (int)Math.pow(16,5) + number6 * (int)Math.pow(16,6) + number7 * (int)Math.pow(16,7) + number8 * (int)Math.pow(16,8) + number9 * (int)Math.pow(16,9);

        }
        System.out.print("Your number is " + decimalNumber + " in decimal");



        /* let0 = Character.toUpperCase(let0);
        let1 = Character.toUpperCase(let1);
        let2 = Character.toUpperCase(let2);
        let3 = Character.toUpperCase(let3);
        let4 = Character.toUpperCase(let4);
        let5 = Character.toUpperCase(let5);
        let6 = Character.toUpperCase(let6);
        let7 = Character.toUpperCase(let7);
        let8 = Character.toUpperCase(let8);
        let9 = Character.toUpperCase(let9); */



        //System.out.println(let0);

    }
    //System.out.println("Your number is " + + );
}
