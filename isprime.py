a=int(input("enter a value above 1 "))

for i in range (2,a):
	if ((a%i)==0):
		print("Not a prime number")
		break
	else:
		print ("its prime number")
		break
