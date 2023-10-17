package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when08to20then8dot24() {
        double expected = 8.24;
        Point a = new Point(0, 8);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when59to36then3dot61() {
        double expected = 3.61;
        Point a = new Point(5, 9);
        Point b = new Point(3, 6);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when72to67then5dot09() {
        double expected = 5.09;
        Point a = new Point(7, 2);
        Point b = new Point(6, 7);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }

}