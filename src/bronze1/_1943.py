n = (int)(input())
for qwe in range (n):
    answer = 1
    a, b = map(int,input().split())
    for i in range(min(a,b), 0, -1):
        if a % i == 0 and b % i == 0:
            answer = answer * i * (a//i) * (b//i)
            break
    print(answer)