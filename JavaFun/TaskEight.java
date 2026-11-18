import java.util.Scanner;

	public class TaskEight{
		public static void main(String[] args){
			
			Scanner scanner = new Scanner(System.in);
			
		int sum =0;
		float average =0;
		int count =1;
			 
		for (; count <=10;){
			System.out.print("Enter Score: ");
			int number = scanner.nextInt();
			
			if(number >= 0 && number <= 100){
			
			sum = sum + number;
			count++;
			}
			
		}	
			
		
			
			System.out.print(sum);		
			 
					
			
			 
			
		}
		
	}