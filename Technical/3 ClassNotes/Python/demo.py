#find max sum of size k

arr = [2, 1, 5, 1, 3, 2]
k = 3

window_sum = sum(arr[:k]) #[2 1 5]
max_sum = window_sum
max_subArray = arr[:k]

for i in range(k, len(arr)):

    window_sum = window_sum + arr[i] - arr[i-k]

    # max_sum = max(max_sum, window_sum)

    if window_sum > max_sum:
        max_sum = window_sum
        max_subArray = arr[i-k+1:i+1]
print(max_sum)
print(max_subArray)
