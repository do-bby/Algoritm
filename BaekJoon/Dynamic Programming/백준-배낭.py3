n,m=map(int, input().split())
t=[[0,0]]
k=[[0 for i in range(m+1)] for i in range(n+1)]
for i in range(n):
    t.append(list(map(int, input().split())))
for i in range(n+1):
    for j in range(m+1):
        w=t[i][0]
        v=t[i][1]
        if j<w:
            k[i][j]=k[i-1][j]
        else:
            k[i][j]=max(k[i-1][j-w]+v,k[i-1][j])
print(k[n][m])