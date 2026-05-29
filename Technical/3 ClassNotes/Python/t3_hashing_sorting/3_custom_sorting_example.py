students = [
    ("John",85),
    ("Alice",95),
    ("David",78),
    ("Emma",91)
]

# Sort by marks

sortedStudents = sorted(
    students,
    key=lambda x:x[1]
)

print("Ascending Order:")
print(sortedStudents)


# Descending order

sortedStudentsDesc = sorted(
    students,
    key=lambda x:x[1],
    reverse=True
)

print("\nDescending Order:")
print(sortedStudentsDesc)