package calculator;

public final class StringCalculator {
    private StringCalculator() {
    }

    public static int sum(int[] numbers) {
        int s = 0;
        for (int i : numbers) {
            s += i;
        }
        return s;
    }
}
