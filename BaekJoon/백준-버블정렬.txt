n=int(input())
m=[]
for i in range(n):
    m.append(int(input()))
    
for i in range(n):
    for j in range(n):
        if m[i]<m[j]:
            m[i],m[j]=m[j],m[i]
            
for i in m:
    print(i)
