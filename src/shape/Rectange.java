package shape;

public class Rectange extends Shape {
	private int x;
	private int y;
	
	public Rectange(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return x*2 + y*2;
	}
	
}
