N,M=map(int, input().split())
original = []
count = []
for i in range(N):
    original.append(input())
    
for i in range(N-7):
    for j in range(M-7):
        idx1=0
        idx2=0
        for k in range(i, i+8):
            for z in range(j, j+8):
                if(k+z)%2==0:
                    if original[k][z] !='W':
                        idx1+=1
                    if original[k][z] !='B':
                        idx2+=1
                else:
                    if original[k][z] !='B':
                        idx1+=1
                    if original[k][z] !='W':
                        idx2+=1
        count.append(idx1)
        count.append(idx2)
print(min(count))