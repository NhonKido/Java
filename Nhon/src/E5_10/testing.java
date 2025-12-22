package E5_10;

import org.junit.Assert;

import junit.framework.TestCase;

public class testing extends TestCase {
	public void testConstructor() {
		CartPT origin = new CartPT(0,0);
		CartPT p1 = new CartPT(300,400);
		CartPT p2 = new CartPT(100,300);
		CartPT p3 = new CartPT(100,150);
		CartPT p4 = new CartPT(500,600);
		Dot dot1 = new Dot(p1);
		Circle circle1 = new Circle(p2,200);
		Rectangle rectangle1 = new Rectangle(p3,50,100);
		Square square1 = new Square(p4,150);
		
		IShape shape1 = new CompositeShape(dot1, circle1);
		IShape shape2 = new CompositeShape(shape1, square1);
		IShape shape3 = new CompositeShape(shape2, rectangle1);
		IShape boss = shape3;
	}
	
	//test all methods in package E5_10
	public void testMethod() {
		CartPT origin = new CartPT(0,0);
		CartPT p1 = new CartPT(300,400);
		CartPT p2 = new CartPT(100,300);
		CartPT p3 = new CartPT(100,150);
		CartPT p4 = new CartPT(500,600);
		Dot dot1 = new Dot(p1);
		Circle circle1 = new Circle(p2,100);
		Rectangle rectangle1 = new Rectangle(p3,50,100);
		Square square1 = new Square(p4,150);
		
		IShape shape1 = new CompositeShape(dot1, circle1);
		IShape shape2 = new CompositeShape(shape1, square1);
		IShape shape3 = new CompositeShape(shape2, rectangle1);
		IShape boss = shape3;
		
		//test distanceTo0
		assertEquals(180.27, boss.distanceTo0(),0.01); //shape3 contains rectangle1 which is closest to origin
		//test area
		double circleArea = circle1.area();
		double rectangleArea = rectangle1.area();
		double squareArea = square1.area();
		double dotArea = -1; // dot has no area
		assertEquals(100*100*Math.PI, circleArea);
		assertEquals((double)(50*100), rectangleArea);
		assertEquals((double)(150*150), squareArea);
		assertFalse((0==dotArea));
		//test perimeter
		double circlePerimeter = circle1.perimeter();
		double rectanglePerimeter = rectangle1.perimeter();
		double squarePerimeter = square1.perimeter();
		double dotPerimeter = -1; // dot has no perimeter
		assertEquals(2*Math.PI*100, circlePerimeter);
		assertEquals((double)(2*(50+100)), rectanglePerimeter);
		assertEquals((double)(4*150), squarePerimeter);
		assertFalse((0==dotPerimeter));
		
		//test boundingBox	
		assertTrue(circle1.boundingBox().equals(new Rectangle(new CartPT(0,200),200,200)));
		assertTrue(rectangle1.boundingBox().equals(new Rectangle(new CartPT(100,150),50,100)));
		
		//test contain
		assertTrue(circle1.contain(new CartPT(150,300))); // inside circle
		assertFalse(circle1.contain(new CartPT(300,400))); // outside circle
		assertTrue(rectangle1.contain(new CartPT(120,180))); // inside rectangle
		assertFalse(rectangle1.contain(new CartPT(200,300))); // outside rectangle
		
		
		
		
	}
}
