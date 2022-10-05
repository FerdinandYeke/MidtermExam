import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of Rectangle cube: ");
		double length = scan.nextDouble();
		
		System.out.println("Enter the width of Rectangle cube: ");
		double width = scan.nextDouble();
		
		System.out.println("Enter the height of Rectangle cube: ");
		double height = scan.nextDouble();
		
		double Volume = length * width * height;
		
		System.out.println("The volume of the rectangular cuboid is: "+Volume);
		
		
	}

}
