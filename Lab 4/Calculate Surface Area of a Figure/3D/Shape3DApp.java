import java.util.*;

public class Shape3DApp {
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
		
		System.out.println("1. Cuboid");
		System.out.println("2. Pyramid");
		System.out.println("3. Sphere");
		System.out.println("4. Cone");
		System.out.println("5. Cylinder");
		
		for(int i=0; i<num; i++) {
			System.out.println("Choose a shape:");
			shapeNo = sc.nextInt();
			switch(shapeNo)
			{
				case 1:
					System.out.println("Cuboid chosen");
					System.out.println("Enter the length of the Cuboid:");
					length = sc.nextDouble();
					System.out.println("Enter the breadth of the Cuboid:");
					width = sc.nextDouble();
					shapeList[i] = new Cuboid(length, width);
					System.out.println("Cuboid created");
					break;
				case 2:
					System.out.println("Pyramid chosen");
					System.out.println("Enter the height of the Pyramid:");
					height = sc.nextDouble();
					System.out.println("Enter the base of the Pyramid:");
					base = sc.nextDouble();
					shapeList[i] = new Pyramid(height, base);
					System.out.println("Pyramid created");
					break;
				case 3:
					System.out.println("Sphere chosen");
					System.out.println("Enter the radius of the Sphere:");
					shapeList[i] = new Sphere(sc.nextDouble());
					System.out.println("Sphere created");
					break;
				case 4:
					System.out.println("Cone chosen");
					System.out.println("Enter the height of the Cone:");
					height = sc.nextDouble();
					System.out.println("Enter the perimeter of the Cone:");
					base = sc.nextDouble();
					shapeList[i] = new Cone(height, base);
					System.out.println("Cone created");
					break;
				case 5:
					System.out.println("Cylinder chosen");
					System.out.println("Enter the height of the Cylinder:");
					length = sc.nextDouble();
					System.out.println("Enter the perimeter of the Cylinder:");
					width = sc.nextDouble();
					shapeList[i] = new Cylinder(length, width);
					System.out.println("Cylinder created");
					break;
			}
		}
		for(int i=0; i<num; i++)
		{
			if (shapeList[i].getBasicShapes() == "Cuboid") {
				Cuboid r = (Cuboid)shapeList[i];
				System.out.println(i + ". Print area of Cuboid of length and breadth: " +  r.getRectLength() + ", " + r.getRectWidth());
			}
			else if (shapeList[i].getBasicShapes() == "Pyramid") {
				Pyramid t = (Pyramid)shapeList[i];
				System.out.println(i + ". Print area of Pyramid of height and base: " +  t.getTriHeight() + ", " + t.getTriBase());
			}
			else if (shapeList[i].getBasicShapes() == "Sphere") {
				Sphere c = (Sphere)shapeList[i];
				System.out.println(i + ". Print area of Sphere of radius: " + c.getCircleRadius());
			}
			else if (shapeList[i].getBasicShapes() == "Cone") {
				Cone t1 = (Cone)shapeList[i];
				System.out.println(i + ". Print area of Pyramid of height and radius: " +  t1.getTriHeight() + ", " + t1.getTriBase()/2);
			}
			else if (shapeList[i].getBasicShapes() == "Cylinder") {
				Cylinder r1 = (Cylinder)shapeList[i];
				System.out.println(i + ". Print area of Cylinder of length and radius: " +  r1.getRectLength() + ", " + r1.getRectWidth()/2);
			}
	
		}
		double sum = 0;
		int j = 0, k = 0, l = 0, m = 0, n = 0;
		do
		{
			System.out.println("Input a choice:");
			int choice = sc.nextInt();
			
			if(choice == -1 && j == 1 && k == 1 && l == 1) {
				System.out.printf("Total area of 3D figure is: " + sum);
				break;
			}
			else if(choice == -1 && m == 1 && n == 1 && l == 1) {
				System.out.printf("Total area of new 3D figure is: " + sum);
				break;
			}
			else if (choice == -1) {
				break;
			}
			
			if(shapeList[choice] instanceof Cuboid)
			{
				Cuboid r1 = (Cuboid)shapeList[choice];
				
				System.out.printf(r1.getBasicShapes() + " of length %.2f and breadth %.2f area is %f\n", r1.getRectLength(), r1.getRectWidth(), r1.findArea());
				if (j == 0) {
					sum += r1.findArea();
					j = 1;
				}
			}
			else if(shapeList[choice] instanceof Pyramid)
			{
				Pyramid t1 = (Pyramid)shapeList[choice];
				
				System.out.printf(t1.getBasicShapes() + " of base %.2f and height %.2f area is %f\n", t1.getTriBase(), t1.getTriHeight(), t1.findArea());
				if (k == 0) {
					sum += t1.findArea() - 2*(t1.bottomArea());
					k = 1;
				}
			}
			else if(shapeList[choice] instanceof Sphere)
			{
				Sphere c1 = (Sphere)shapeList[choice];
				
				System.out.printf(c1.getBasicShapes() + " of radius %.2f area is %f\n", c1.getCircleRadius(), c1.findArea());
				if (l == 0) {
					sum += c1.findArea();
					l = 1;
				}
			}
			else if(shapeList[choice] instanceof Cone)
			{
				Cone t1 = (Cone)shapeList[choice];
				
				System.out.printf(t1.getBasicShapes() + " of radius %.2f and height %.2f area is %f\n", t1.getTriBase()/2, t1.getTriHeight(), t1.findArea());
				if (m == 0) {
					sum += t1.findArea() - 2*(t1.bottomArea());
					m = 1;
				}
			}
			if(shapeList[choice] instanceof Cylinder)
			{
				Cylinder r1 = (Cylinder)shapeList[choice];
				
				System.out.printf(r1.getBasicShapes() + " of height %.2f and radius %.2f area is %f\n", r1.getRectLength(), r1.getRectWidth()/2, r1.findArea());
				if (n == 0) {
					sum += r1.findArea();
					n = 1;
				}
			}
			
			
		}while(true);
		
		
		
		
	}

}