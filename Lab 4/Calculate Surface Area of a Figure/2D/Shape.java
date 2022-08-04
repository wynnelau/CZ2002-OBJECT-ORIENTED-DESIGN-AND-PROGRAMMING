
public abstract class Shape {
	private String basicShapes;
	
	public void chooseBasicShapes() {
		this.basicShapes = "NULL";
	}
	
	public void chooseBasicShapes(String basicShapes) {
		this.basicShapes = basicShapes;
	}
	
	public String getBasicShapes() {
		return this.basicShapes;
	}
	
	public abstract double findArea();
	
}
