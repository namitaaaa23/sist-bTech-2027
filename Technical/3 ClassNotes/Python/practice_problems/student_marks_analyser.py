from collections import Counter

students = [
    ("John",85),
    ("Alice",91),
    ("David",78),
    ("Emma",91),
    ("Mike",65),
    ("Sara",85)
]


# Extract marks

marks=[mark for name,mark in students]

print("Marks:")
print(marks)


# Frequency of marks

freq=Counter(marks)

print("\nFrequency:")
print(freq)


# Sort based on marks

sorted_students=sorted(
    students,
    key=lambda x:x[1],
    reverse=True
)

print("\nSorted Students:")
for name,mark in sorted_students:
    print(name,mark)


# Top 3 students

print("\nTop 3 Students:")

for student in sorted_students[:3]:
    print(student)


# Average mark

average=sum(marks)/len(marks)

print("\nAverage:",average)