from collections import Counter

# Count occurrence of each element

numbers = [1, 2, 3, 2, 4, 1, 2, 5, 3, 2]

frequency = Counter(numbers)

print("Frequency Count:")
print(frequency)

print("\nCount of 2:", frequency[2])

print("\nMost Common:")
print(frequency.most_common(2))