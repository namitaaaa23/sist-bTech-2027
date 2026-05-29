package practiceProblems;

public class OneDeletionEqual {

    private static boolean check(String a,
                                 String b,
                                 int i,
                                 int j) {

        while(i < a.length()
                && j < b.length()) {

            if(a.charAt(i)
                    != b.charAt(j))
                return false;

            i++;
            j++;
        }

        return true;
    }

    public static boolean canBecomeEqual(
            String s1,
            String s2) {

        int n1 = s1.length();
        int n2 = s2.length();

        if(Math.abs(n1 - n2) > 1)
            return false;

        int i = 0;
        int j = 0;

        while(i < n1 && j < n2) {

            if(s1.charAt(i)
                    == s2.charAt(j)) {

                i++;
                j++;
            }
            else {

                return check(s1, s2, i + 1, j)
                        || check(s1, s2, i, j + 1);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(
            canBecomeEqual("abcd", "acd")
        );
    }
}
