package E4_4;

import junit.framework.TestCase;

public class test extends TestCase {
    
    private CartPt p1, p2;
    private IShape dot, square, circle, rect;

    protected void setUp() {
        p1 = new CartPt(3, 4);
        p2 = new CartPt(0, 0);

        dot = new Dot(p1);
        
        square = new Square(p1, 10);
        circle = new Circle(p2, 5);
        rect = new Rectangle(p1, 10, 20); // Test thêm hình chữ nhật
    }

    public void testArea() {
        assertEquals(0.0, dot.area(), 0.001);
        assertEquals(100.0, square.area(), 0.001);
        assertEquals(Math.PI * 25, circle.area(), 0.001);
        assertEquals(200.0, rect.area(), 0.001);
    }

    public void testDistanceToO() {
        assertEquals(5.0, dot.distanceToO(), 0.001);
        assertEquals(5.0, square.distanceToO(), 0.001);
        assertEquals(0.0, circle.distanceToO(), 0.001);
    }

    public void testContains() {
        assertTrue(dot.contains(new CartPt(3, 4)));
        assertTrue(square.contains(new CartPt(5, 5)));
        assertTrue(circle.contains(new CartPt(3, 4)));
        assertTrue(rect.contains(new CartPt(5, 5)));
    }

    public void testBoundingBox() {
        // Kiểm tra kiểu trả về là Rectangle
        Rectangle bDot = dot.boundingBox();
        assertEquals(0.0, bDot.area(), 0.001);

        Rectangle bSquare = square.boundingBox();
        assertEquals(100.0, bSquare.area(), 0.001);

        Rectangle bCircle = circle.boundingBox();
        // Hình tròn bán kính 5 -> Vuông ngoại tiếp cạnh 10 -> Diện tích 100
        assertEquals(100.0, bCircle.area(), 0.001);
    }

    public void testPerimeter() {
        assertEquals(0.0, dot.perimeter(), 0.001);
        assertEquals(40.0, square.perimeter(), 0.001);
        assertEquals(2 * Math.PI * 5, circle.perimeter(), 0.001);
        assertEquals(60.0, rect.perimeter(), 0.001);
    }
}