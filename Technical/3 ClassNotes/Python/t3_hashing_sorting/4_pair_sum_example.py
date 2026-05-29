numbers=[2,7,11,15,5,8]

target=13

visited=set()

print("Pairs:")

for num in numbers:

    complement=target-num

    if complement in visited:
        print(complement,num)

    visited.add(num)