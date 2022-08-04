public class Triangle extends Shape{
	private double height;
	private double base;
	
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
		chooseBasicShapes(Triangle);
	}
	
	public double getTriHeight() {
		return this.height;
	}
	
	public double getTriBase() {
		return this.base;
	}
	
	public double findArea() {
		return 0.5heightbase;
	}
}
