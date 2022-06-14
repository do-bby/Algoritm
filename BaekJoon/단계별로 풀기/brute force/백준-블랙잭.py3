N,M=map(int,input().split())
A=list(map(int, input().split()))
result = 0
for i in range(N):
    for j in range(i+1,N):
        for z in range(j+1,N):
            if A[i]+A[j]+A[z] > M:
                continue
            else:
                result = max(result, A[i]+A[j]+A[z])
                
print(result)