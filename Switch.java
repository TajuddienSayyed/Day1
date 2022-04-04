package Example;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a= s.nextInt();
		
		// TODO Auto-generated method stub
			  switch(a) {
			  case 1:
			   System.out.println("good");
			   break;
			  case 2:
			   System.out.println("better");
			   break;
			  case 3:
			   System.out.println("best");
			   break;
			  default:
			   System.out.println("invalid");
			   break;
			  }
	}


}
