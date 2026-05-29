arr = [2,7,11,15]
target = 9

freq = {}

for i in arr:

    diff = target - i

    if diff in freq:

        print(
            "Pair Found:",
            diff,
            i
        )

        break

    freq[i] = 1