t=int(input())
o=[1,2,4]
for i in range(3,10):
    o.append(o[i-3]+o[i-2]+o[i-1])
for i in range(t):
    n=int(input())
    print(o[n-1])