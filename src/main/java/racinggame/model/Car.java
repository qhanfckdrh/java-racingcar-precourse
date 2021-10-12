package racinggame.model;

public class Car {
    private String name;
    private int position;

    public void setName(String name){
        this.name = name;
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
