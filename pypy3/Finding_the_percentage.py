
from functools import reduce
def Average(lst):
    return reduce(lambda a, b: a + b, lst) / len(lst)

if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    
    query_name = input()
    i=0
    for key in student_marks:
        if query_name == key:
            average = Average(student_marks[key])
    print("{:.2f}".format(average))
