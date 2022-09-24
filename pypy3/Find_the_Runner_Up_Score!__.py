if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    res = [*set(arr)]
    res.sort()
    print(res[len(res)-2])
    
