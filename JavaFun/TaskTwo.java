import java.util.Scanner;

	public class TaskTwo{
		public static void main(String[] args){
			
			Scanner scanner = new Scanner(System.in);
			
		int sum =0;
		float average =0;
		
			 
		for (int count =1; count <=10; count++){
			System.out.print("Enter Score: ");
			int number = scanner.nextInt();
			sum = sum + number;
			
			
		}	
			average = sum /10;
		
			System.out.print(average);
			 
					
			
			 
			
		}
		
	}
  
  