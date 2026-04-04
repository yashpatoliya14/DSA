public class SquareRootBinarySearch {
    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        long left = 1;
        long right = x / 2;
        long ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                ans = mid; // mid is a potential answer
                left = mid + 1; // search the right half
            } else {
                right = mid - 1; // search the left half
            }
        }

        return (int) ans;
    }
}
