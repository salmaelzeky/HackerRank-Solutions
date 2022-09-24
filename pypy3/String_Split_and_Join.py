

def split_and_join(line):
    # write your code here
    first_list = line.split(" ")
    s = ""
    for i in range(len(first_list)):
        if i == (len(first_list) - 1) :
            s = s + first_list[i]
        else:
            s = s + first_list[i] + "-"
    
    return s
    

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)
    
    
    
