n=int(input())
data=[]
rank=[]
for i in range(n):
    w,h = map(int, input().split())
    data.append((w,h))
    
for i in range(n):
    c=0
    for j in range(n):
        if (data[i][0]<data[j][0] and data[i][1]<data[j][1]):
            c+=1
    rank.append(c+1)
    
for z in rank:
    print(z,end=" ")