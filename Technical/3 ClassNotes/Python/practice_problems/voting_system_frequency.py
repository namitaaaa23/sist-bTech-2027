from collections import Counter
from collections import defaultdict

votes = [
    ("CSE","Alice"),
    ("IT","Bob"),
    ("CSE","Alice"),
    ("ECE","David"),
    ("IT","Bob"),
    ("CSE","Alice"),
    ("ECE","Emma"),
    ("IT","Bob"),
    ("ECE","David")
]


# Extract candidate names

candidateVotes = [
    candidate
    for dept,candidate in votes
]


# Count frequency

frequency = Counter(candidateVotes)

print("Vote Count")

for candidate,count in frequency.items():
    print(candidate,":",count)


# Department-wise grouping

departmentVotes = defaultdict(list)

for dept,candidate in votes:
    departmentVotes[dept].append(candidate)

print("\nDepartment Votes")

for dept,names in departmentVotes.items():
    print(dept,":",names)


# Sort candidates based on vote count

sortedCandidates = sorted(
    frequency.items(),
    key=lambda x:x[1],
    reverse=True
)

print("\nRank List")

for candidate,count in sortedCandidates:
    print(candidate,count)


winner = sortedCandidates[0]

print("\nWinner:")
print(winner)