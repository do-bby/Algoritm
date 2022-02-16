n=int(input())
m=[1,1,1,2,2]
for i in range(5,100):
    m.append(m[i-1]+m[i-5])
    
for i in range(n):
    t=int(input())
    print(m[t-1])