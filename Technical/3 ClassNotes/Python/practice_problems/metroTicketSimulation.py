class MetroTicketSimulation:


    # Matrix Traversal
    def print_matrix(self, arr):

        for row in arr:

            for val in row:
                print(val, end=" ")

            print()


    # Total Tickets
    def total_tickets(self, arr):

        total = 0

        for row in arr:
            total += row[2]

        return total


    # Station with Maximum Tickets
    def max_ticket_station(
            self,
            arr):

        freq = {}

        for row in arr:

            station = row[1]
            tickets = row[2]

            freq[station] = \
                freq.get(station,0) \
                + tickets

        max_station = max(
            freq,
            key=freq.get
        )

        return max_station


    # String Compression
    def compress(self, s):

        result = ""

        count = 1

        for i in range(len(s)-1):

            if s[i] == s[i+1]:

                count += 1

            else:

                result += s[i] \
                        + str(count)

                count = 1

        result += s[-1] + str(count)

        return result


    # Parsing
    def parse_log(self, log):

        parts = log.split("-")

        print("\nParsed Log:")

        print("Passenger ID:",
              parts[0])

        print("City:",
              parts[1])

        print("Tickets:",
              parts[2])



# Driver Code

obj = MetroTicketSimulation()

tickets = [

    [101,1,5],
    [102,2,3],
    [103,1,4],
    [104,3,7],
    [105,2,2]

]

print("Metro Ticket Records:")

obj.print_matrix(tickets)


total = obj.total_tickets(tickets)

print("\nTotal Tickets Sold:",
      total)


station = obj.max_ticket_station(
            tickets)

print(
    "Station with Maximum Tickets:",
    station
)


stations = "AAABBBCCDAA"

print(
    "\nCompressed Stations:",
    obj.compress(stations)
)


log = "101-Chennai-5"

obj.parse_log(log)