arr = [1, 2, 3]
n = len(arr)

prefix = [0] * n
prefix[0] = arr[0]

for i in range(1, n):
    prefix[i] = prefix[i - 1] + arr[i]

for start in range(n):
    for end in range(start, n):

        if start == 0:
            subarray_sum = prefix[end]
        else:
            subarray_sum = prefix[end] - prefix[start - 1]

        print(f"Subarray ({start},{end}) Sum = {subarray_sum}")