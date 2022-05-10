package shape;

public class Circle extends Shape {
	private int r;
	
	public Circle(int r) {
		super();
		this.r = r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*r;
	}
	
}
