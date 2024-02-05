package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	

	@Test
    public void testAAtLowerBoundaryMinusOne() {
        Roots.calculate_roots(-1, 10, 10);
        assertEquals(Root_Types.ERROR, Roots.root_types());
    }

    @Test
    public void testAAtLowerBoundary() {
        Roots.calculate_roots(0, 10, 10);
        assertEquals(Root_Types.Two_roots, Roots.root_types());
    }

    @Test
    public void testAAtLowerBoundaryPlusOne() {
        Roots.calculate_roots(1, 10, 10);
        assertEquals(Root_Types.Equal_roots, Roots.root_types());
    }

    @Test
    public void testAAtUpperBoundaryMinusOne() {
        Roots.calculate_roots(49, 10, 10);
        assertEquals(Root_Types.Equal_roots, Roots.root_types());
    }

    @Test
    public void testAAtUpperBoundary() {
        Roots.calculate_roots(50, 10, 10);
        assertEquals(Root_Types.Equal_roots, Roots.root_types());
    }

    @Test
    public void testAAtUpperBoundaryPlusOne() {
        Roots.calculate_roots(51, 10, 10);
        assertEquals(Root_Types.ERROR, Roots.root_types());
    }

	////////////////////////////////////////////////////////////
	
	@Test
    public void testBAtLowerBoundaryMinusOne() {
        Roots.calculate_roots(10, -1, 10);
        assertEquals(Root_Types.ERROR, Roots.root_types());
    }

    @Test
    public void testBAtLowerBoundary() {
        Roots.calculate_roots(10, 0, 10);
        assertEquals(Root_Types.Two_roots, Roots.root_types());
    }

    @Test
    public void testBAtLowerBoundaryPlusOne() {
        Roots.calculate_roots(10, 1, 10);
        assertEquals(Root_Types.Equal_roots, Roots.root_types());
    }

    @Test
    public void testBAtUpperBoundaryMinusOne() {
        Roots.calculate_roots(10, 49, 10);
        assertEquals(Root_Types.Equal_roots, Roots.root_types());
    }

    @Test
    public void testBAtUpperBoundary() {
        Roots.calculate_roots(10, 50, 10);
        assertEquals(Root_Types.Equal_roots, Roots.root_types());
    }

    @Test
    public void testBAtUpperBoundaryPlusOne() {
        Roots.calculate_roots(10, 51, 10);
        assertEquals(Root_Types.ERROR, Roots.root_types());
    }

	////////////////////////////////////////////////////////////
	
	@Test
    public void testCAtLowerBoundaryMinusOne() {
        Roots.calculate_roots(10, 10, -1);
        assertEquals(Root_Types.ERROR, Roots.root_types());
    }

    @Test
    public void testCAtLowerBoundary() {
        Roots.calculate_roots(10, 10, 0);
        assertEquals(Root_Types.Two_roots, Roots.root_types());
    }

    @Test
    public void testCAtLowerBoundaryPlusOne() {
        Roots.calculate_roots(10, 10, 1);
        assertEquals(Root_Types.Equal_roots, Roots.root_types());
    }

    @Test
    public void testCAtUpperBoundaryMinusOne() {
        Roots.calculate_roots(10, 10, 49);
        assertEquals(Root_Types.Equal_roots, Roots.root_types());
    }

    @Test
    public void testCAtUpperBoundary() {
        Roots.calculate_roots(10, 10, 50);
        assertEquals(Root_Types.Equal_roots, Roots.root_types());
    }

    @Test
    public void testCAtUpperBoundaryPlusOne() {
        Roots.calculate_roots(10, 10, 51);
        assertEquals(Root_Types.ERROR, Roots.root_types());
    }

	////////////////////////////////////////////////////////////
	
	
	
	}
