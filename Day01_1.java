import java.util.Scanner;

public class Day01_1 {

	public static void main(String[] args) {
		int a;
		
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j = a-1; j>i; j--) {
			System.out.print(" ");
			}
			for(int j = 0; j < i*2+1; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		for(int i=a-1; i>0; i--) { //4
			for(int j = i; j<a; j++) { //1
			System.out.print(" ");
			}
			for(int j = 0; j < i*2-1; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
