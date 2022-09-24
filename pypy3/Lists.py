if __name__ == '__main__':
    N = int(input())
    l = []
    i=0
    for i in range(N):
        cmd, *values = input().split()
        vl = list(map(int, values))
        if cmd == "insert":
            l.insert(vl[0], vl[1])
        elif cmd == "append":
            l.append(vl[0])
        elif cmd == "print":
            print(l)
        elif cmd == "remove":
            l.remove(vl[0])
        elif cmd == "sort":
            l.sort()
        elif cmd == "pop":
            l.pop()
        elif cmd == "reverse":
            l.reverse()
