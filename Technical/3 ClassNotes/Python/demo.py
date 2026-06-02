arr = [1, 2, 3, 4]
target = 8
n = len(arr)
min_length = float('inf')
for start in range(n):

    for end in range(start+1, n+1):

        # iterate from start to end
        subarray = arr[start:end]
        s = sum(subarray)
        if(s >= target):
            # print(subarray, s)
            #minLength
            min_length = min(min_length, len(subarray))

print(min_length)
