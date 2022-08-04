
public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		chooseBasicShapes("Rectangle");
	}
	
	public double getRectLength() {
		return this.length;
	}
	
	public double getRectWidth() {
		return this.width;
	}
	
	public double findArea() {
		return length*width;
	}
	
	public double findOneSide() {
		return width * width;
	}
}
