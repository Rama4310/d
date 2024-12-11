import java.util.Scanner;
public class PositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array");

		int[] int1 = new int[scan.nextInt()];
		int x = 0;
		for (int i = x; i < int1.length; i++) {
			int1[i] = scan.nextInt();
		}

		System.out.print("This are positive Number: ");
		for (int y = 0; y < int1.length; y++) {
			if (int1[y] >= 0) {
				
				System.err.print(int1[y] + ",");
			}
		}

	}

}
