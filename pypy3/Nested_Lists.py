if __name__ == '__main__':
    name_list=[]
    score_list=[]
    score_list2=[]
    for _ in range(int(input())):
        name = input()
        score = float(input())
        name_list.append(name)
        score_list.append(score)
        score_list2.append(score)
    score_list2 = [*set(score_list2)]
    score_list2.sort()
    min_score1 = min(score_list2)
    min_score = score_list2[score_list2.index(min_score1)+1] 
    i=0
    index_list=[]
    final_names=[]
    for i in range(len(score_list)):
        if min_score == score_list[i]:
            index_list.append(i)
            final_names.append(name_list[i])
    j=0
    final_names2=sorted(final_names)
    for j in range(len(final_names2)):
        print(final_names2[j])
            
        
