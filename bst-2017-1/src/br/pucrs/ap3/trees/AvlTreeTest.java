/**
 *
 */
package br.pucrs.ap3.trees;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author robsonsantos
 */
public class AvlTreeTest {
    private AvlTree avl;

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * Test method for {@link br.pucrs.ap3.trees.AvlTree#AvlTree()}.
     */
    @Test
    public void testAvlTree() {
        avl = new AvlTree();

        fail("Not yet implemented");
    }

    /**
     * Test method for {@link br.pucrs.ap3.trees.AvlTree#add(int)}.
     */
    @Test
    public void testAdd() {
        avl.add(10);
        assertTrue(avl.contains(10));
    }

    /**
     * Test method for {@link br.pucrs.ap3.trees.AvlTree#contains(int)}.
     */
    @Test
    public void testContains() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link br.pucrs.ap3.trees.AvlTree#size()}.
     */
    @Test
    public void testSize() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link br.pucrs.ap3.trees.AvlTree#toString()}.
     */
    @Test
    public void testToString() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link br.pucrs.ap3.trees.AvlTree#reportLevel()}.
     */
    @Test
    public void testReportLevel() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link br.pucrs.ap3.trees.AvlTree#reportHeight()}.
     */
    @Test
    public void testReportHeight() {
        fail("Not yet implemented");
    }

}
