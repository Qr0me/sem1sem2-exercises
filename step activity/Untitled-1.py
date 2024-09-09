import csv
import statistics as st
import pygal
import matplotlib.pyplot as plt
import random

filename = "activity.csv"
with open(filename) as f:
    reader = csv.reader(f)
    headerRow = next(reader)
    dictDate = {}
    dictInterval = {}
    noOfNA = 0
    for row in reader:
        steps = row[0]
        interval = int(row[2])
        if steps != 'NA':
            date = row[1]
            dictDate.setdefault(str(date), [])
            dictDate[str(date)].append(int(steps))
            dictInterval.setdefault(interval, [])
            dictInterval[interval].append(int(steps))
        else:
            noOfNA += 1

print(f"Number of missing values: {noOfNA}")

listDate = []
listTotal = []

for i in dictDate.keys():
    listDate.append(i)
    listTotal.append(sum(dictDate.get(i)))

""" print(f'{listDate}:{listTotal}')
print(f'mean: {st.mean(listTotal)}')
q = sorted(listTotal)
print(f'median: {st.median(q)}') """

""" hist = pygal.Bar()
hist.title = "Total Steps per day"
hist.x_title = "Steps per day"
hist.y_title = "Frequency"
hist.x_labels = listDate
hist.add("Total number of steps", listTotal)
hist.render_to_file("StepsPerDay.svg") """

listAvePerInterval = []

for i in dictInterval.keys():
    listAvePerInterval.append(st.mean(dictInterval.get(i)))

n=0
maxNoOfSteps = max(listAvePerInterval)
indexMax = listAvePerInterval.index(maxNoOfSteps)

for i in dictInterval.keys():
    if n == indexMax:
        max = i
        break
    n+=1
print(f'day where maximum number of steps:', max)

plt.plot(list(dictInterval.keys()), listAvePerInterval)
plt.title("Average Daily Activity")
plt.xlabel("Time Interval")
plt.ylabel("Average number of steps taken")
plt.show()
