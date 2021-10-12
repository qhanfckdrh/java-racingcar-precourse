package racinggame.model;

import racinggame.view.Message;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Car> players;

    public Player(String players) {
        this.players = new ArrayList<>();
        checkIfNull(players);

        String[] splited = players.split(",");
        for (int i=0; i<splited.length; i++){
            Car newCar = new Car();
            newCar.setName(splited[i]);
            newCar.setPosition(0);
            this.players.add(newCar);
        }
    }

    private void checkIfNull(String input){
        if (input.isEmpty()){
            Message.printMessage(Message.ERROR + "입력값이 없습니다.");
            throw new NullPointerException("입력값이 없습니다.");
        }
    }
}
