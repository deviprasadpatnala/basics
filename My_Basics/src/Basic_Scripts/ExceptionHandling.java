package Basic_Scripts;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int i = 100/0;
		}
		catch(ArithmeticException e) {
			
		
		System.out.println(e);
		}
		System.out.println("code exec. continues");
	}

}
