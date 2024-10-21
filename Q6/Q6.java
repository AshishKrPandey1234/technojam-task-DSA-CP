public class Q6 {
    public static long number_spiral(long y, long x) {
        if (y >= x) {
            // Row-major
            if (y % 2 == 1) {
                return y * y - (x - 1);
            } else {
                return (y - 1) * (y - 1) + x;
            }
        } else {
            // Column-major
            if (x % 2 == 1) {
                return x * x - (y - 1);
            } else {
                return (x - 1) * (x - 1) + y;
            }
        }
    }

    public static void main(String[] args) {
        // Default Test Cases
        long[][] test_cases = {
            {2, 3},  // Output: 8
            {1, 1},  // Output: 1
            {4, 2}   // Output: 15
        };

        // Run Test Cases
        for (long[] test_case : test_cases) {
            System.out.println(number_spiral(test_case[0], test_case[1]));
        }
    }
}
