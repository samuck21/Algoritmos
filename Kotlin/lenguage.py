def translator(word):
    Alphabet=[["a","b","c","d","e"],["4","I3","[",")","3"]]
    traduction=""
    for i in range(0,len(word)):
        letter= word[i]
        for j in range(0, 5):
            com=letter.find(Alphabet[0][j])
            if com != -1:
                traduction+=Alphabet[1][j]
         



    return traduction


print(translator("abcd"))