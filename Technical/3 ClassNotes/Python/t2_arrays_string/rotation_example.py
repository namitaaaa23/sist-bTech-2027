numbers=[10,20,30,40,50]

k=2

rotated=numbers[-k:]+numbers[:-k]

print("Original:")
print(numbers)

print("\nAfter Rotation:")
print(rotated)