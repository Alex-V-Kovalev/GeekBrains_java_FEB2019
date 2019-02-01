package Lesson_01;

import java.util.GregorianCalendar;

public class Hello {

    //целочисленные
    byte aByte = 27;
    short aShort = 120;
    int anInt = 1000;
    long aLong = 100000000L;

    //дробные
    float aFloat = 123.05F;
    double aDouble = 321.99d;

    //символьные
    char aChar = 'a';

    //логический
    boolean aBoolean = true;

    //строковые
    String string = "Приветствую всех учеников java";


    public static void main(String[] args) {
//        System.out.println(args[0]);
        System.out.println(method3(3,2,4,6));
        System.out.println(isBetween10to20(5,9));
        pozitiveNegative(-7);
        System.out.println(isNegative(4));
        helloHuman("");
        System.out.println(method8(false, false));
        System.out.println("Упрощаем (!(a < b) && !(a > b)) -> a == b. \n" +
                "\tПотому, что оператор && (И) дает true, когда оба операнда true (т.е. true && true -> true).\n" +
                "\tВ нашем случае перед операндами стоит !(отрицание), таким образом получаем !false && !false -> true.\n" +
                "\tА такая ситуация возможна только когда a == b");
        System.out.println(isAModB(9, 3));
        System.out.println(isTriangelSide(3,5,7));
        isLeapYear(2200);
        System.out.println(rndMinMax(2, 6));
        diceShot();
        method15(15.0F);
        System.out.println(between2003_2006(6,21));
        rgbToCmyk(0, 0, 0);
        equals3(3, 3, 5);
        System.out.println(between0_1(0.3d, 1d));

    }

    public static double method3(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    public static boolean isBetween10to20(double a, double b) {
        if ((a + b >= 10) && (a + b <= 20))
            return true;
        else
            return false;
    }

    public static void pozitiveNegative(int number) {
        if (number < 0)
            System.out.println("Число " + number + " - отрицательное");
        else
            System.out.println("Число " + number + " - положительное");
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void helloHuman(String name) {
        System.out.println("Привет, " + (name.equals("") ? "безымянный человек" : name) + "!");
    }

    public static boolean method8(boolean a, boolean b) {
        return (!(a && b) && (a || b)) || ((a && b) || !(a || b));
    }

    public static boolean isAModB(int a, int b) {
        return a % b == 0;
    }

    public static boolean isTriangelSide(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void isLeapYear(int year) {
        boolean isLeap;
        if (year % 400 == 0)
            isLeap = true;
        else if (year % 100 == 0)
            isLeap = false;
        else if (year % 4 == 0)
            isLeap = true;
        else
            isLeap = false;

        System.out.println("" + year + " год - " + (isLeap ? "високосный" : "невисокосный") + ".");
    }

    public static int rndMinMax(int min, int max) {
        return min + (int) (Math.random() * (max - min) + 0.5);
    }

    public static void diceShot() {
        int first = rndMinMax(1,6);
        int second = rndMinMax(1,6);
        System.out.println("Первый кубик: " + first + " Второй кубик: " + second + " Сумма: " + (first + second));
    }

    public static void method15(double t) {
        double result = Math.sin(2 * t) + Math.sin(3 * t);
        System.out.println(result);
    }

    public static boolean between2003_2006(int m, int d) {
        GregorianCalendar start = new GregorianCalendar(2019, 2, 20);
        GregorianCalendar end = new GregorianCalendar(2019, 5, 20);
        GregorianCalendar calendar = new GregorianCalendar(2019, m - 1, d);

        return (calendar.after(start) || calendar.equals(start)) && (calendar.before(end) || calendar.equals(end));
    }

    public static void rgbToCmyk(int red, int green, int blue)
    {
        int cyan;
        int magenta;
        int yellow;
        int black = Math.min(Math.min(255 - red, 255 - green), 255 - blue);

        if (black != 255) {
            cyan = (255-red-black)/(255-black)*100;
            magenta = (255-green-black)/(255-black)*100;
            yellow = (255-blue-black)/(255-black)*100;
        } else {
            cyan = 0;
            magenta = 0;
            yellow = 0;
        }
        black = black / 255 * 100;

        System.out.println("RGB: " + red + ", " + green + ", " + blue);
        System.out.println("CMYK: " + cyan + ", " +  magenta + ", " + yellow + ", " + black + " Но, это не точно!");
    }

    public static void equals3(int a, int b, int c) {

        System.out.println("Все три числа " + ((a == b && a == c) ? "" : "не ") + "равны");
    }

    public static boolean between0_1(double x, double y) {
        return (x >= 0 && x <= 1 && y >= 0 && y <= 1);
    }
}
