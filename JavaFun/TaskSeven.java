import java.util.Scanner;

	public class TaskSeven{
		public static void main(String[] args){
			
			Scanner scanner = new Scanner(System.in);
			
		int sum =0;
		float average =0;
		
			 
		for (int count =1; count <=10;count++){
			System.out.print("Enter Score: ");
			int number = scanner.nextInt();
			
			if (number % 2 == 0){
			
			sum = sum + number;
			
			}
			average = sum / count;
		}	
			
		
			System.out.println(sum);
			System.out.println(average);
		
			 
					
			
			 
			
		}
		
	}
  
  