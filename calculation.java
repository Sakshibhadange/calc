import java.util.Scanner 
 public class numbers 
{
	pubic static void main(String[] args)
	{
		Scanner sc= new Scanner(SYstem.in)
			System.out.println("Enter two numbers");
		       int num1= sc.nextInt();
		       int num2= sc.nextInt();
                    int add= num1+num2;
		    System.out.println("addition of two numbers is "+add);
		    int sub = num1 - num2;  
		    System.out.println("Subtraction of two numbers is "+ sub);
		    int mul = num1 * num2;  
		    System.out.println("Multiplication of two numbers is "+ mul);

		    sc.close();
	}
}
