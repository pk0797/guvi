r = int(input())
r1 = int(input())


for n in range(r,r1):
   
  for i in range(2,n):
       if (n % i) == 0:
           break
  else:
          print(n)
