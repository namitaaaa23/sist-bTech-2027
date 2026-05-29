def get_range_sum(prefix, L, R):
    if L == 0:
        return prefix[R]
    return prefix[R] - prefix[L - 1]

arr = [2, 4, 6, 8, 10]
prefix = [0] * len(arr)
prefix[0] = arr[0]

for i in range(1, len(arr)):
    prefix[i] = prefix[i - 1] + arr[i]

print(get_range_sum(prefix, 1, 3))  # Output: 18