n=int(input())
w=[]
wb=[]
dp=[0 for i in range(n)]
for i in range(n):
    w.append(list(map(int, input().split())))
w.sort(key=lambda x:x[0])
for i in range(n):
    wb.append(w[i][1])
for i in range(n):
    for j in range(i):
        if wb[i]>wb[j] and dp[i]<dp[j]:
            dp[i]=dp[j]
    dp[i]+=1
print(n-max(dp))