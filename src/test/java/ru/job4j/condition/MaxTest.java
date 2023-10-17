package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {
    @Test
    void whenMax3To2Then3() {
        int first = 3;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int first = 2;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2To4Then4() {
        int first = 3;
        int second = 2;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To5Then5() {
        int first = 1;
        int second = 2;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2To2Then2() {
        int first = 2;
        int second = 2;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To5To6Then6() {
        int first = 1;
        int second = 2;
        int third = 5;
        int fourth = 6;
        int result = Max.max(first, second, third, fourth);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2To2To2Then2() {
        int first = 2;
        int second = 2;
        int third = 2;
        int fourth = 2;
        int result = Max.max(first, second, third, fourth);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}