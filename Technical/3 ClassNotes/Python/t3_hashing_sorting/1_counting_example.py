from collections import Counter

votes = [
    "Alice",
    "Bob",
    "Alice",
    "David",
    "Bob",
    "Alice"
]

frequency = Counter(votes)

print("Vote Frequency:")
print(frequency)

print("\nMost Common Candidate:")
print(frequency.most_common(1))