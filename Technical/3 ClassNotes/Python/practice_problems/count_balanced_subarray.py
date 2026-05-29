from collections import defaultdict

def count_balanced_subarrays(arr):

    freq = defaultdict(int)
    freq[0] = 1

    prefix = 0
    count = 0

    for i in range(len(arr)):

        if i % 2 == 0:
            prefix += arr[i]
        else:
            prefix -= arr[i]

        count += freq[prefix]
        freq[prefix] += 1

    return count


arr = [2,1,1,2]
print(count_balanced_subarrays(arr))