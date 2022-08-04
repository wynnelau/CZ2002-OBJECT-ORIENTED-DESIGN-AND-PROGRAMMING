public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
		chooseBasicShapes("Circle");
	}
	
	public double getCircleRadius() {
		return this.radius;
	}
	
	public double findArea() {
		return Math.PI * radius * radius;
	}
}
