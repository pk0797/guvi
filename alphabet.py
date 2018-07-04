import re
d = input()
if re.match("^[a-zA-Z]*$", d):
	print ("yes")
else:
	print ("no")
