n=int(input())
d=[]
for i in range(n):
    f,s=map(int,input().split())
    d.append([f,s])
d=sorted(d,key=lambda a:a[0])
d=sorted(d,key=lambda a:a[1])
l=0
cnt=0
for i,j in d:
    if i>=l:
        cnt+=1
        l=j
print(cnt)