package E4_4;

public class main {

	public static void main(String[] args) {
		IShape shape1 = new Square(new CartPt(5, 10), 2);
		System.out.print(shape1.distanceToO());
	}

}
