package racinggame;

import nextstep.utils.Console;
import racinggame.model.Player;
import racinggame.view.Message;

public class Application {
    public static void main(String[] args) {
        // TODO 자동차 경주 게임 구현
        Message.printMessage(Message.GET_CAR_NAME);
        String input = Console.readLine();
        Player player = new Player(input);

        Message.printMessage(Message.GET_TRIAL_COUNT);
        int trial = stringToInt(Console.readLine());

    }

    private static int stringToInt(String input){
        int val = 0;
        try {
            val = Integer.parseInt(input);
        } catch (NumberFormatException e){
            Message.printMessage(Message.ERROR + "숫자를 입력해주세요.");
        }

        return val;
    }
}
