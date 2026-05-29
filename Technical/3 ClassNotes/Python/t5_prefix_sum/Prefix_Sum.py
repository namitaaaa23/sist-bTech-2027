arr = [2, 4, 6, 8, 10]
n = len(arr)

prefix = [0] * n
prefix[0] = arr[0]

for i in range(1, n):
    prefix[i] = prefix[i - 1] + arr[i]

print(prefix)