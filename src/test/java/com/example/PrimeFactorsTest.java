package com.example;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrimeFactorsTest {
    @Test
    public void factors() throws Exception {
        assertThat(factorsOf(1), is(empty()));
        assertThat(factorsOf(2), contains(2));
        assertThat(factorsOf(3), contains(3));
        assertThat(factorsOf(4), contains(2, 2));
        assertThat(factorsOf(5), contains(5));
        assertThat(factorsOf(6), contains(2, 3));
        assertThat(factorsOf(7), contains(7));
        assertThat(factorsOf(8), contains(2, 2, 2));
        assertThat(factorsOf(9), contains(3, 3));
        assertThat(factorsOf(10), contains(2, 5));
    }

    private List<Integer> factorsOf(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int divisor = 2; n > 1; divisor++)
            for (; n % divisor == 0; n /= divisor)
                factors.add(divisor);

        return factors;
    }
}
