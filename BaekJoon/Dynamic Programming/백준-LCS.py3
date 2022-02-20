m=list(input())
n=list(input())
mlen=len(m)
nlen=len(n)
dp=[[0]*(nlen+1)for i in range(mlen+1)]
for i in range(mlen):
    for j in range(nlen):
        if m[i]==n[j]:
            dp[i+1][j+1]=dp[i][j]+1
        else:
            dp[i+1][j+1]=max(dp[i][j+1],dp[i+1][j])
print(dp[mlen][nlen])