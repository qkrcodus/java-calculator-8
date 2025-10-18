package calculator;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String rawInput= Console.readLine();
        int result= StringCalculator.sum(Parser.toInts(rawInput));
        System.out.println("결과: "+ result);
    }
}
