package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
	
    @Test
    public void testEquilateralTriangle() {
        TriangleClassifier.classifyTriangle(2, 2, 2);
        assertEquals(Triangle_Types.equilateral, TriangleClassifier.get_type());
    }

    @Test
    public void testIsoscelesTriangle() {
        TriangleClassifier.classifyTriangle(2, 2, 3);
        assertEquals(Triangle_Types.isosceles, TriangleClassifier.get_type());
    }

    @Test
    public void testScaleneTriangle() {
        TriangleClassifier.classifyTriangle(2, 3, 4);
        assertEquals(Triangle_Types.Scalene, TriangleClassifier.get_type());
    }

    @Test
    public void testNotATriangle() {
        TriangleClassifier.classifyTriangle(1, 2, 3);
        assertEquals(Triangle_Types.Nottriangle, TriangleClassifier.get_type());
    }
	 
}