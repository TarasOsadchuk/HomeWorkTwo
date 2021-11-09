
public class HomeWorkTwo {
    public static void main(String[] args) {

        twoNum(8,5); // solution of the first problem
        whichNumOne(0); // solution of the 2nd problem
        whichNumTwo(-2); // solution of the 3rd problem
        numberOfTime("Hello GeekBrains", 5); // solution of the 4th problem
        leapYear(2021); // last task 5

    }

    public static void twoNum(int numOne, int numTwo) {

        int sum = numOne + numTwo;

        if (sum >= 10 && sum <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    } // N1

    public static void whichNumOne(int num) {

        if (num < 0) {
            System.out.println(num + " - Отрицательный");
        } else {
            System.out.println(num + " - Положительное");
        }
    } // N2

    public static void whichNumTwo(int num) {

        if (num < 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    } // N3

    public static void numberOfTime(String line, int num) {

        for (int i = 0; num > i; i++) {
            System.out.println(line);
        }
    } // N4

    public static void leapYear(int year) {

        if ((year % 400) == 0) {
            System.out.println(true);
        } else if ((year % 100) == 0) {
            System.out.println(false);
        } else if ((year % 4) == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    } //N5
}
