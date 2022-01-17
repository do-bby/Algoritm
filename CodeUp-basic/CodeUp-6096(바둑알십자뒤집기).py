d=[]
for i in range(20):
    d.append([])
    for j in range(20):
        d[i].append(0)
for i in range(19):
    a=input().split()
    for j in range(19):
        d[i+1][j+1]=int(a[j])

# 바둑알이 깔려 있는 상황이 19*19크기의 정수값으로 입력받는다.
        
n=int(input())
for i in range(n):
    x,y=input().split()
    x=int(x)
    y=int(y)
    for j in range(1,20):
        if d[j][y]==0:
            d[j][y]=1
        else:
            d[j][y]=0
        if d[x][j]==0:
            d[x][j]=1
        else:
            d[x][j]=0

#십자 뒤집기 횟수 n을 입력받고, 해당 위치의 십자 범위에 해당되는 값이 0이면 1로, 1이면 0으로 값 갱신

for i in range(1,20):
    for j in range(1,20):
        print(d[i][j], end=' ')
    print()

#전체 바둑판 출력
