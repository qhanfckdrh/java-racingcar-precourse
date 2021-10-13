package racinggame.model;

import racinggame.view.Message;

public class Car {
    private String name;
    private int position;

    public void setName(String name){
        validateName(name);
        this.name = name;
    }

    private void validateName(String name){
        if (name.length() > 5){
            Message.printMessage(Message.ERROR + "자동차 이름은 5자 이하만 가능합니다.");
        }
    }

    public void setPosition(int value){
        this.position += value;
    }

    public String getName(){
        return this.name;
    }

    public int getPosition(){
        return this.position;
    }
}
