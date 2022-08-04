public class Cylinder extends Rectangle{
	public Cylinder(double length, double width) {
		super(length, width);
		chooseBasicShapes("Cylinder");
	}
	
	public double findArea() {
		double length = super.getRectLength();
		double radius = super.getRectWidth()/2;
		return (2* Math.PI * radius * length) + (2*Math.PI*radius*radius);
	}


}
