import os
"""locFile = os.getcwd()
myFile = open(locFile+"\\myX.txt", "r")

allLine = myFile.readlines()

i = 1

for x in allLine:
    print(f"{i} {x}", sep="", end="")
    i +=1"""

# --------------------------------------------------------------------------------------------------

"""
fileOut = open("myOut.txt", "w")

a = 1.0
b = "This"
c = [1,2]

#write function
#fileOut.write('{}\n{}\n{}'.format(a,b,c))

#print function

print(a,b,c,sep="\n",file=fileOut)
"""

fileIn = open("myX.txt", "r")
fileOut = open("myTest.txt", "w")
allLine= fileIn.readlines()
i = 1
for x in allLine:
    print(f"{i} {x}", file=fileOut, end="")
    i +=1