"""words = input("Words: ")

list = words.split(" ")

print(sorted(list))"""

words = input("Words: ")
List = list()

for i in words:
    if i.isalnum():
        List.append(i)


res = []
for i in List:
    if i not in res:
        res.append(i)

print(sorted(res))
