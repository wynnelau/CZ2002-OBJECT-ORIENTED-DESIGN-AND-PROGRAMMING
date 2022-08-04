public class Cone extends Triangle{
	public Cone(double height, double base) {
		super(height, base);
		chooseBasicShapes("Cone");
	}
	public double findArea() {
		double height = super.getTriHeight();
		double radius = super.getTriBase()/2;
		return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2)+Math.pow(radius, 2)));
	}
	
	public double bottomArea() {
		double base = super.getTriBase()/2;
		return Math.PI *(base * base);
	}
}
