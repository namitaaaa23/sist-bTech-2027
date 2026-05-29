from collections import defaultdict

students = [
    ("CSE","John"),
    ("IT","Alice"),
    ("CSE","David"),
    ("ECE","Emma"),
    ("IT","Mike")
]

department = defaultdict(list)

for dept,name in students:
    department[dept].append(name)

print("Grouped Students:")

for key,value in department.items():
    print(key,":",value)