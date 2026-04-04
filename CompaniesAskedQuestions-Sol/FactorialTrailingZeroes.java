import java.util.*;
public FactorialTrailingZeroes
{
	public static int trailingZeroes(int n) {
    int count = 0;
    while(n > 0) {
        n /= 5;
        count += n;
    }
    return count;
	}
	public static void main(String[] args) {
		trailingZeroes(5);
	}
}