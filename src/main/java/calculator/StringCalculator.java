package calculator;

public class StringCalculator {
    private StringCalculator() {
    }

    public static int sum(int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        int s = 0;
        for (int i : numbers) {
            s += i;
        }
        return s;
    }
}
