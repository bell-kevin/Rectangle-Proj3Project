package rectangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoxTest {
    
    public BoxTest() {
    }
    
    @Test
    public void testPerimeter() {
        System.out.println("perimeter");
        assertEquals(16, new Box(2, 6, 5).perimeter()); //test case 1
        assertEquals(38, new Box(12, 7, 7).perimeter()); //test case 2
        assertEquals(18, new Box(1, 8, 9).perimeter()); //test case 3
        assertEquals(28, new Box(5, 9, 18).perimeter()); //test case 4
        assertEquals(46, new Box(8, 15, 8).perimeter()); //test case 5
        assertEquals(68, new Box(22, 12, 5).perimeter()); //test case 6
        assertEquals(38, new Box(10, 9, 8).perimeter()); //test case 7
        assertEquals(38, new Box(8, 11, 10).perimeter()); //test case 8
        assertEquals(8, new Box(1, 3, 5).perimeter()); //test case 9
        assertEquals(58, new Box(14, 15, 20).perimeter()); //test case 10
    }
    
    @Test
    public void testArea() {
        System.out.println("area");
        assertEquals(12, new Box(2, 6, 5).area()); //test case 1
        assertEquals(84, new Box(12, 7, 7).area()); //test case 2
        assertEquals(8, new Box(1, 8, 9).area()); //test case 3
        assertEquals(45, new Box(5, 9, 18).area()); //test case 4
        assertEquals(120, new Box(8, 15, 8).area()); //test case 5
        assertEquals(264, new Box(22, 12, 5).area()); //test case 6
        assertEquals(90, new Box(10, 9, 8).area()); //test case 7
        assertEquals(88, new Box(8, 11, 10).area()); //test case 8
        assertEquals(3, new Box(1, 3, 5).area()); //test case 9
        assertEquals(210, new Box(14, 15, 20).area()); //test case 10
    }
    
    @Test
    public void testVolume() {
        System.out.println("volume");
        assertEquals(60, new Box(2, 6, 5).volume()); //test case 1
        assertEquals(588, new Box(12, 7, 7).volume()); //test case 2
        assertEquals(72, new Box(1, 8, 9).volume()); //test case 3
        assertEquals(810, new Box(5, 9, 18).volume()); //test case 4
        assertEquals(960, new Box(8, 15, 8).volume()); //test case 5
        assertEquals(1320, new Box(22, 12, 5).volume()); //test case 6
        assertEquals(720, new Box(10, 9, 8).volume()); //test case 7
        assertEquals(880, new Box(8, 11, 10).volume()); //test case 8
        assertEquals(15, new Box(1, 3, 5).volume()); //test case 9
        assertEquals(4200, new Box(14, 15, 20).volume()); //test case 10
    }
    
} //end class BoxTest



