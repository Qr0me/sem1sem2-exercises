f = open("info.txt", "r")
num_words = 0
d = dict()
for lines in f: 
    lines = lines.strip()

    words = lines.split(" ")  # create a list for every line
    num_words += len(words)  # count how many elements in the list

    for word in words: 
        if word in d: 
            d[word] += 1
        else: 
            d[word] = 1

    print(lines)

print(f"Number of words: {num_words}")

for key in list(d.keys()):
    print(f"{key}: {d[key]}")
f.close()

f = open("info.txt", "w")
f.write("week 9 - file handling input output")
f.close()