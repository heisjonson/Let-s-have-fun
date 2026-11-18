import java.util.Scanner;

	public class TaskTen{
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
			average = sum / count;
			count++;
			}
			
		}	
			
		
			
			System.out.print(average);		
			 
					
			
			 
			
		}
		
	}