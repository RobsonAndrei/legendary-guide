package br.pucrs.ap3.Heap;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeapSortTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /***
     * Test driver - TDD
     */
    @Test
    public void testNoMaxHeap() {
        // 15 60 72 70 56 32 62 92 45 30 65
        // false
        int[] v = {15, 60, 72, 70, 56, 32, 62, 92, 45, 30, 65};
        boolean expected = false;
        boolean actual = HeapSort.isMaxHeap(v);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxHeap() {
        // 85 70 80 50 40 75 30 20 10 35 15 62 58
        // true
        int[] v = {85, 70, 80, 50, 40, 75, 30, 20, 10, 35, 15, 62, 58};
        boolean expected = true;
        boolean actual = HeapSort.isMaxHeap(v);
        assertEquals(expected, actual);
    }
    //Realizar mais testes...


    @Test(expected = IllegalArgumentException.class)
    public void testInvalidArgument() {
        HeapSort.isMaxHeap(null);

    }

}
