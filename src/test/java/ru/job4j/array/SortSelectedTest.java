package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5To10() {
        int[] data = new int[] {10, 5, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 8, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort1To20() {
        int[] data = new int[] {20, 15, 1, 18, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 7, 15, 18, 20};
        assertThat(result).containsExactly(expected);
    }
}