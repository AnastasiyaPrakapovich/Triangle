
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.io.IOException;

import static org.junit.Assert.*;

public class TriangleTest {

    // private Triangle tr;

// @Test
// public void isoscelsTriangle() throws Exception {
//     assertEquals("Isosceles Triangle", tr.getTriangle(4,2,4));
// }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getTriangleIsosceles() throws Exception {
        Triangle tr = new Triangle();
        String actual = tr.getTriangle(4,2,4);
        String expected = "Isosceles Triangle";
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getTriangleScalene() throws Exception {
        Triangle tr = new Triangle();
        String actual2 = tr.getTriangle(4,5,2);
        String expected2 = "Scalene Triangle";
        assertEquals(expected2, actual2);
    }

    @org.junit.Test
    public void getTriangleEquilateral() throws Exception {
        Triangle tr = new Triangle();
        String actual3 = tr.getTriangle(3,3,3);
        String expected3 = "Equilateral Triangle";
        assertEquals(expected3, actual3);
    }


    @org.junit.Test (expected = IOException.class)
    public void testTriangle() throws IOException {
        Triangle tr = new Triangle();
        String actual4 = tr.getTriangle(-1,-2,0);
        String expected4 = "Not a Triangle";
        assertEquals(expected4, actual4);
        Assert.fail("Submit new data");

    }

}