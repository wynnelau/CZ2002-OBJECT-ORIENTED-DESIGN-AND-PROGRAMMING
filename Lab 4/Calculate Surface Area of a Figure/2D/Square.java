public class Square extends Shape{
	private double length;
	
	public Square(double length) {
		this.length = length;
		chooseBasicShapes("Square");
	}
	
	public double getSquareLen() {
		return this.length;
	}
	
	public double findArea() {
		return length*length;
	}
}
