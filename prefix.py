import os
r = int(input())
a=list()
for i in range(0, r):
    a.append(input())

print(os.path.commonprefix(a))
