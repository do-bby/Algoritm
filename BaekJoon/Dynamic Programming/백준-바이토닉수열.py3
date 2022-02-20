x=int(input())
c=list(map(int, input().split()))
incre=[1 for i in range(x)]
decre=[1 for i in range(x)]
for i in range(x):
    for j in range(i):
        if c[i]>c[j]:
            incre[i]=max(incre[i],incre[j]+1)
for i in range(x-1,-1,-1):
    for j in range(x-1,i,-1):
        if c[i]>c[j]:
            decre[i]=max(decre[i],decre[j]+1)
result = [0 for i in range(x)]
for i in range(x):
    result[i] = incre[i]+decre[i]-1
print(max(result))