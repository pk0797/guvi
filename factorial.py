
p = 1
i = int(input())
if (i > 20):
    print("error")
    exit()
for t in range(p, i):
    p = p * i
    i = i - 1
print (p)
