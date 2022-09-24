def mutate_string(string, position, character):
    #print(string[position])
    string = string[:position] + character + string[position+1:]  
    return string

