 
 
sum = 0
average = 0 
count = 1

while count <=10:

	 score = int(input("Enter Score: "))
	
	 
	 if (score % 2 ==0):
	 	 sum = sum + score
	 average = sum / count
	 count+= 1
	 
print(average)
