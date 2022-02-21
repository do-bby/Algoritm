city=int(input())
line=list(map(int, input().split()))
oil=list(map(int, input().split()))
moil=oil[0]
t=0
for i in range(len(line)):
    if oil[i]>=moil:
        t+=moil*line[i]
    elif oil[i] < moil:
        moil=oil[i]
        t+=moil*line[i]
        
print(t)