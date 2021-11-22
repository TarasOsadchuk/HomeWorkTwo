
public class HomeWorkTwo {
    public static void main(String[] args) {

        System.out.println(twoNum(8, 5)); // solution of the first problem
        whichNumOne(0); // solution of the 2nd problem
        System.out.println(whichNumTwo(-2)); // solution of the 3rd problem
        numberOfTime("Hello GeekBrains", 5); // solution of the 4th problem
        System.out.println(leapYear(2021)); // last task 5

    }

    public static boolean twoNum(int numOne, int numTwo) {

        int sum = numOne + numTwo;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    } // N1

    public static void whichNumOne(int num) {

        if (num < 0) {
            System.out.println(num + " - Отрицательный");
        } else {
            System.out.println(num + " - Положительное");
        }
    } // N2

    public static boolean whichNumTwo(int num) {

        if (num < 0) {
            return true;
        } else {
            return false;
        }
    } // N3

    public static void numberOfTime(String line, int num) {

        for (int i = 0; num > i; i++) {
            System.out.println(line);
        }
    } // N4

    public static boolean leapYear(int year) {

        if ((year % 400) == 0) {
            return true;
        } else if ((year % 100) == 0) {
            return false;
        } else if ((year % 4) == 0) {
            return true;
        } else {
            return false;
        }

    } //N5
}