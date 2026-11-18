 
sum = 0
average = 0 
count = 1

while count <=10:

	 score = int(input("Enter Score: "))
	
	 
	 if (score >= 0 and score <= 100):
	 	 sum = sum + score
	 	 average = sum / count
	 	 count+= 1
	 	 
	 

print(average)

