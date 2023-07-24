package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow((x2 - x1), 2);
        double second = Math.pow((y2 - y1), 2);
        double rsl = Math.sqrt(first + second);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        double result2 = Point.distance(5, 8, 2, 6);
        System.out.println("result (5, 8) to (2, 6) " + result2);
        double result3 = Point.distance(8, 12, 22, 50);
        System.out.println("result (8, 12) to (22, 50) " + result3);
    }
}
