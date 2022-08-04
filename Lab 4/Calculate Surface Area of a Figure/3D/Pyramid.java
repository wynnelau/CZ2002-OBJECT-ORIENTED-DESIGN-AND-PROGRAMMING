
public class Pyramid extends Triangle{
	public Pyramid(double height, double base) {
		super(height, base);
		chooseBasicShapes("Pyramid");
	}
	
	public double findArea() {
		double height = super.getTriHeight();
		double base = super.getTriBase();
		return (base * base) + (2*(base * Math.sqrt(Math.pow(base/2, 2) + Math.pow(height, 2))));
	}

	public double bottomArea() {
		double base = super.getTriBase();
		return (base * base);
	}
}
