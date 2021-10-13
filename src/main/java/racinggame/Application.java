package racinggame;

import nextstep.utils.Console;
import nextstep.utils.Randoms;
import racinggame.model.Player;
import racinggame.view.Message;

import java.io.IOException;

public class Application {
    private static final int TIMEOUT_SECOND = 3000;

    public static void main(String[] args) {
        Message.printMessage(Message.GET_CAR_NAME);
        Player player = new Player(readAndValidate());

        Message.printMessage(Message.GET_TRIAL_COUNT);
        int trial = stringToInt(readAndValidate());

        Message.printMessage("");
        Message.printMessage(Message.RESULT);

        while (trial > 0){
            play(player);
            trial--;
        }

        Message.printMessage(Message.WINNER_PREFIX + player.winner() + Message.WINNER_SUFFIX);
    }

    private static String readAndValidate(){
        String input;

        try {
            Thread.sleep(TIMEOUT_SECOND);
            if (System.in.available() == 0){
                Message.printMessage(Message.ERROR + "값을 빨리 입력 해주세요.");
            }
            input = Console.readLine();
        } catch (IOException | InterruptedException e){
            Message.printMessage(Message.ERROR + "입력 에러 발생");
            return null;
        }
        checkIfNull(input);
        return input;
    }

    private static void checkIfNull(String input){
        if (input.isEmpty()){
            Message.printMessage(Message.ERROR + "입력값이 없습니다.");
        }
    }

    private static void play(Player player){
        int size = player.count();
        for (int i=0; i<size; i++){
            player.updatePosition(i, move());
        }
        player.print();
    }

    private static int move(){
        int val = Randoms.pickNumberInRange(0, 9);
        if (val >= 4){
            return 1;
        }

        return 0;
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
