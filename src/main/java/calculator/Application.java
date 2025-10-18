package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String rawInput = Console.readLine();
        int[] sumTarget = Parser.parseAndConvertToInts(rawInput);
        int result = StringCalculator.sum(sumTarget);
        System.out.println("결과: " + result);
    }
}
