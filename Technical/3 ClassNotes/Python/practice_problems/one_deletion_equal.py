def check(a, b, i, j):

    while i < len(a) and j < len(b):

        if a[i] != b[j]:
            return False

        i += 1
        j += 1

    return True


def can_become_equal(s1, s2):

    if abs(len(s1) - len(s2)) > 1:
        return False

    i = j = 0

    while i < len(s1) and j < len(s2):

        if s1[i] == s2[j]:
            i += 1
            j += 1

        else:
            return (
                check(s1, s2, i + 1, j)
                or
                check(s1, s2, i, j + 1)
            )

    return True


print(can_become_equal("abcd", "acd"))