class SmartTrafficAnalysis:

    # Print Array
    def print_array(self, arr):

        for i in arr:
            print(i, end=" ")

        print()


    # Move Zeros
    def move_zeros(self, arr):

        left = 0

        for right in range(len(arr)):

            if arr[right] != 0:

                arr[left], arr[right] = \
                    arr[right], arr[left]

                left += 1


    # Pair Sum using HashMap(Dictionary)
    def pair_sum(self, arr, target):

        freq = {}

        for i in arr:

            diff = target - i

            if diff in freq:

                print(
                    "Pair Found:",
                    diff,
                    i
                )

                return

            freq[i] = 1

        print("No Pair Found")


    # Fixed Sliding Window
    def max_vehicles_in_window(
            self,
            arr,
            k):

        window_sum = sum(arr[:k])

        max_sum = window_sum

        for i in range(k, len(arr)):

            window_sum = \
                window_sum \
                - arr[i-k] \
                + arr[i]

            max_sum = max(
                max_sum,
                window_sum
            )

        return max_sum



# Driver Code

obj = SmartTrafficAnalysis()

traffic = [10,0,25,30,0,15,20,5]

print("Original Traffic Data:")

obj.print_array(traffic)


# Move Zeros
obj.move_zeros(traffic)

print("\nAfter Moving Zeros:")

obj.print_array(traffic)


# Pair Sum
target = 35

print("\nChecking Pair Sum:")

obj.pair_sum(traffic, target)


# Sliding Window
k = 3

max_traffic = \
    obj.max_vehicles_in_window(
        traffic,
        k
    )

print(
    "\nMaximum vehicles in",
    k,
    "consecutive minutes:",
    max_traffic
)