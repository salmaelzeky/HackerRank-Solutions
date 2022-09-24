# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import deque
if __name__ == '__main__':
    N = int(input())
    d = deque()
    i=0
    for i in range(N):
        cmd, *values = input().split()
        getattr(d, cmd)(*values)
    print(*d)
        
