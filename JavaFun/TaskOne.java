import java.util.Scanner;

	public class TaskOne{
		public static void main(String[] args){
			
			Scanner scanner = new Scanner(System.in);
			
		int sum =0;
		int score =0;
			 
		for (int count =1; count <=10; count++){
			System.out.print("Enter Score: ");
			int number = scanner.nextInt();
			sum = sum + number;
		}	
			
		
			System.out.printf("The sum of is %d", sum);
			 
					
			
			 
			
		}
		
	}
  
  