
public class Cuboid extends Rectangle{
	public Cuboid(double length, double width) {
		super(length, width);
		chooseBasicShapes("Cuboid");
	}
	
	public double findArea() {
		double length = super.getRectLength();
		double width = super.getRectWidth();
		return 4*(width * length) + 2*(width * width);
	}

}
