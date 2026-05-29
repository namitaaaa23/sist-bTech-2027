employees=[
    ("John",35000),
    ("Alice",45000),
    ("David",30000),
    ("Emma",50000),
    ("Mike",40000)
]

print("Employee Details")

for name,salary in employees:
    print(name,salary)


# Extract salary list

salaries=[salary for name,salary in employees]

print("\nSalary List:")
print(salaries)


# Average salary

average=sum(salaries)/len(salaries)

print("\nAverage Salary:")
print(average)


# Highest salary

highest=max(salaries)

print("\nHighest Salary:")
print(highest)


# Lowest salary

lowest=min(salaries)

print("\nLowest Salary:")
print(lowest)


# Sort employees by salary

sortedEmployees=sorted(
    employees,
    key=lambda x:x[1]
)

print("\nSorted Employees")

for name,salary in sortedEmployees:
    print(name,salary)


# Top 3 salaries

print("\nTop 3 Salaries:")

for employee in sortedEmployees[::-1][:3]:
    print(employee)