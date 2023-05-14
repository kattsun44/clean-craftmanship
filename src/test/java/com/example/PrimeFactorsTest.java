package com.example;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrimeFactorsTest {
    @Test
    public void factors() throws Exception {
        assertThat(factorsOf(1), is(empty()));
    }

    private List<Integer> factorsOf(int n) {
        return new ArrayList<>();
    }
}
