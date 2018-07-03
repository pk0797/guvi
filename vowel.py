import re
d = input()
vowel = ['a','e','i','o','u']
if re.match("^[a-zA-Z]*$", d):
	if d in vowel:
		print ('vowel')
	else:
		print ("constant")
	
else:
	print ("Invalid")
