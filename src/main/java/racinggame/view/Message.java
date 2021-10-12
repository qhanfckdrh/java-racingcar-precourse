package racinggame.view;

public class Message {
    public static final String GET_CAR_NAME = "경주할 자동차 이름을 입력하세요. (이름은쉼표(,) 기준으로 구분)";
    public static final String GET_TRIAL_COUNT = "시도할 횟수는 몇 회 인가요?";
    public static final String ERROR = "[ERROR]";

    public static void printMessage(String msg){
        System.out.println(msg);
    }
}
