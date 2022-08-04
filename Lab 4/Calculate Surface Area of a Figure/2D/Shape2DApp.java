import java.util.*;

public class Shape2DApp {
	public static void main(String[] args) {
		double length;
		double width;
		double height;
		double base;
		double radius;
		
		int num;
		int shapeNo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of shapes: ");
		num = sc.nextInt();
		
		Shape[] shapeList = new Shape[num];
		
		System.out.println("1. Square");
		System.out.println("2. Rectangle");
		System.out.println("3. Triangle");
		System.out.println("4. Circle");
		
		for(int i=0; i<num; i++) {
			System.out.println("Choose a shape:");
			shapeNo = sc.nextInt();
			switch(shapeNo)
			{
				case 1:
					System.out.println("Square chosen");
					System.out.println("Enter the length of the square:");
					shapeList[i] = new Square(sc.nextDouble());
					System.out.println("Square created");
					break;
				case 2:
					System.out.println("Rectangle chosen");
					System.out.println("Enter the length of the rectangle:");
					length = sc.nextDouble();
					System.out.println("Enter the breadth of the rectangle:");
					width = sc.nextDouble();
					shapeList[i] = new Rectangle(length, width);
					System.out.println("Rectangle created");
					break;
				case 3:
					System.out.println("Triangle chosen");
					System.out.println("Enter the height of the triangle:");
					height = sc.nextDouble();
					System.out.println("Enter the base of the triangle:");
					base = sc.nextDouble();
					shapeList[i] = new Triangle(height, base);
					System.out.println("Triangle created");
					break;
				case 4:
					System.out.println("Circle chosen");
					System.out.println("Enter the radius of the circle:");
					shapeList[i] = new Circle(sc.nextDouble());
					System.out.println("Circle created");
					break;
			}
		}
		for(int i=0; i<num; i++)
		{
			if (shapeList[i].getBasicShapes() == "Square") {
				Square s = (Square)shapeList[i];
				System.out.println(i + ". Print area of square of length: " +  s.getSquareLen());
			}
			else if (shapeList[i].getBasicShapes() == "Rectangle") {
				Rectangle r = (Rectangle)shapeList[i];
				System.out.println(i + ". Print area of rectangle of length and breadth: " +  r.getRectLength() + ", " + r.getRectWidth());
			}
			else if (shapeList[i].getBasicShapes() == "Triangle") {
				Triangle t = (Triangle)shapeList[i];
				System.out.println(i + ". Print area of triangle of height and base: " +  t.getTriHeight() + ", " + t.getTriBase());
			}
			else if (shapeList[i].getBasicShapes() == "Circle") {
				Circle c = (Circle)shapeList[i];
				System.out.println(i + ". Print area of circle of radius: " + c.getCircleRadius());
			}
	
		}
		double sum = 0;
		int i = 0, j = 0, k = 0, l = 0;
		do
		{
			System.out.println("Input a choice (-1 to terminate):");
			int choice = sc.nextInt();
			
			
			if(choice == -1 && j == 1 && k == 1 && l == 1) {
				System.out.printf("Total area of 2D figure is: " + sum);
				break;
			}
			else if (choice == -1) {
				break;
			}
			
			if(shapeList[choice] instanceof Square)
			{
				Square s1 = (Square)shapeList[choice];
				
				System.out.printf(s1.getBasicShapes() + " of length %.2f area is %f\n", s1.getSquareLen(), s1.findArea());
				if (i == 0) {
					sum += s1.findArea();
					i = 1;
				}
			}
			else if(shapeList[choice] instanceof Rectangle)
			{
				Rectangle r1 = (Rectangle)shapeList[choice];
				
				System.out.printf(r1.getBasicShapes() + " of length %.2f and breadth %.2f area is %f\n", r1.getRectLength(), r1.getRectWidth(), r1.findArea());
				if (j == 0) {
					sum += r1.findArea();
					j = 1;
				}
			}
			else if(shapeList[choice] instanceof Triangle)
			{
				Triangle t1 = (Triangle)shapeList[choice];
				
				System.out.printf(t1.getBasicShapes() + " of base %.2f and height %.2f area is %f\n", t1.getTriBase(), t1.getTriHeight(), t1.findArea());
				if (k == 0) {
					sum += t1.findArea();
					k = 1;
				}
			}
			else if(shapeList[choice] instanceof Circle)
			{
				Circle c1 = (Circle)shapeList[choice];
				
				System.out.printf(c1.getBasicShapes() + " of radius %.2f area is %f\n", c1.getCircleRadius(), c1.findArea());
				if (l == 0) {
					sum += c1.findArea();
					l = 1;
				}
			}
			
			
		}while(true);

		
	}
}

