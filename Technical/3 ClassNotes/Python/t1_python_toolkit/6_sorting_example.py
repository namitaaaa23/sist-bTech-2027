numbers=[45,12,78,5,22]

print("Ascending:")
print(sorted(numbers))

print("\nDescending:")
print(sorted(numbers,reverse=True))


students=[
    ("Dinesh",85),
    ("Darwin",95),
    ("Divya",90)
]

# Sort by marks

sorted_students=sorted(
    students,
    key=lambda x:x[1]
)

print("\nSorted by Marks:")
print(sorted_students)