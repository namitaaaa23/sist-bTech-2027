def min_length(arr, k):

    left = 0
    current_sum = 0
    ans = float('inf')

    for right in range(len(arr)):

        current_sum += arr[right]

        while current_sum >= k:

            ans = min(ans,
                      right - left + 1)

            current_sum -= arr[left]
            left += 1

    return 0 if ans == float('inf') else ans


arr = [2,3,1,2,4,3]
print(min_length(arr, 7))