package sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {
    @Test
    public void test1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Sum.fill(numbers);
        assertEquals(55, Sum.findSum(numbers));
    }

    @Test
    public void test2() {
        ArrayList<Integer> numbers = new ArrayList<>();
        assertEquals(0, Sum.findSum(numbers));
    }

    @Test
    public void test3() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        assertEquals(2, Sum.findSum(numbers));
    }

    @Test
    public void test4() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Sum.fill(numbers);
        assertEquals(55, Sum.findSum(numbers));
    }

    @Test
    public void test5() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(null);

    }
}