public class Sphere extends Circle{
	public Sphere(double radius) {
		super(radius);
		chooseBasicShapes("Sphere");
	}
	
	public double findArea() {
		return 4 * Math.PI * super.getCircleRadius() * super.getCircleRadius();
	}
}
