package br.pucrs.ap3.Graph;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AbstractGraphTest {

	@Test
	public void testBreadth() {
		AbstractGraph g = new Graph(4);
		g.addEdge(1, 2);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		List l  = new ArrayList<>();
		l = g.breadth(4);
		
		fail("Not yet implemented");
	}

}
