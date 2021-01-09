package Basic_Scripts;

public class Patterns {

	public static void main(String[] args) {
// Left angled numbers
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
//Left angled *'s
		
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
			}
//Star triangle
		for(int i=0; i<5; i++) {
			for(int j=(5-i); j>0; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
//Right angled Triangle
		for(int i=0; i<5; i++) {
			for(int j=2*(5-i); j>0; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}