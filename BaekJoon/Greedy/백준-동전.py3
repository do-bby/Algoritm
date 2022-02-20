n,k=map(int,input().split())
d=[]
for i in range(n):
    d.append(int(input()))
num = 0
for i in range(n-1,-1,-1):
    if k==0:
        break
    if k<d[i]:
        continue
    num+=k//d[i]
    k%=d[i]
print(num)