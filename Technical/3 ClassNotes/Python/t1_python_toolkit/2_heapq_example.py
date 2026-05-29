import heapq

numbers = [30,10,50,5,20,40]

heapq.heapify(numbers)

print("Heap:")
print(numbers)

smallest = heapq.heappop(numbers)

print("\nRemoved Smallest:")
print(smallest)

print("\nAfter Removal:")
print(numbers)

print("\nThree Largest:")
print(heapq.nlargest(3,numbers))