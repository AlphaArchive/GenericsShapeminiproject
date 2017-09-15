import java.util.Scanner;

public class ShapeTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("          ShapeTester Class           ");
		
		Shape R = null;
		boolean created = false;
		while (true) {
			System.out.println("Chose what shape to build");
			System.out.println(" 1. Rectangle \n 2. Triangle \n 3. Circle \n 4. Exit");
			int choice = scan.nextInt();
			if(choice==1 ) {
				System.out.println("Please enter height:");
				double height = scan.nextDouble();
				System.out.println("Please enter width:");
				double width = scan.nextDouble();
				R = new Rectangle(height,width);
				created= true;
				
			}else if(choice ==2) {
				System.out.println("Please enter height:");
				double height = scan.nextDouble();
				System.out.println("Please enter base");
				double base = scan.nextDouble();
				R = new Triangle(height,base);
				created = true;
				
			}else if(choice ==3) {
				System.out.println("Please enter radius");
				double radius = scan.nextDouble();
				R = new Circle(radius);
				created = true;
				
			}else if(choice == 4) {
				System.exit(0);
			}else {
				
			}
			System.out.println();
			if(created) {
				while(true) {
					System.out.println("What do you wish to do with this shape?");
					System.out.println(" 1. Get area \n 2. Get perimeter \n 3. Scale \n 4. Exit");
					System.out.println();
					int choice1 = scan.nextInt();
					if(choice1 ==1) {
						System.out.println("Area:"+R.getArea());
						System.out.println();
					}else if(choice1 ==2) {
						System.out.println("Perimeter:"+R.getPerimeter());
						System.out.println();
					}else if(choice1 ==3) {
						System.out.println("Enter the number to scale:");
						double scaler = scan.nextDouble();
						System.out.println();
						System.out.println("original scale:");
						R.printData();
						System.out.println();
						R.scale(scaler);
						System.out.println("modified scale:");
						R.printData();
					}else if(choice1 ==4) {
						break;
					}else {
						
					}
					
				}
				created = false;
			}
				
		}
	}
}
