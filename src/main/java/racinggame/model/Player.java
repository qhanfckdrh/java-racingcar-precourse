package racinggame.model;

import racinggame.view.Message;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Car> players;

    public Player(String players) {
        this.players = new ArrayList<>();

        String[] splited = players.split(",");
        for (int i=0; i<splited.length; i++){
            Car newCar = new Car();
            newCar.setName(splited[i]);
            newCar.setPosition(0);
            this.players.add(newCar);
        }
    }

    public void updatePosition(int index, int val){
        Car cur = this.players.get(index);
        cur.setPosition(val);
    }

    public int count(){
        return this.players.size();
    }

    public void print(){
        for (Car car:this.players){
            Message.printMessage(car.getName() + " : " +  positionToString(car.getPosition()));
        }
        Message.printMessage("");
    }

    private String positionToString(int val){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<val; i++){
            sb.append("-");
        }

        return sb.toString();
    }

    public String winner(){
        int max = 0;
        for (Car car:this.players) {
            max = Math.max(car.getPosition(), max);
        }

        StringBuilder sb = new StringBuilder();
        for (Car car:this.players) {
            compareAndAdd(max, car, sb);
        }
        sb.setLength(sb.length() - 1);

        return sb.toString();
    }

    private void compareAndAdd(int max, Car cur, StringBuilder sb){
        if (max == cur.getPosition()) {
            sb.append(cur.getName());
            sb.append(",");
        }
    }


}
