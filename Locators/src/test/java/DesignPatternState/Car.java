package DesignPatternState;

public class Car {
    private String model;
    private State state;

    public Car(String model,State st){
        this.state = st;
        this.model = model;
    }

    public void setState(State stat)
    {
        stat.setSpeedtt(this.state.getSpeed());
        this.state=stat;
    }

    public void setSpeed(int num){
        state.setSpeedtt(num);
    }
    @Override
    public String toString(){
        return "[model= " +model+",spped = "+state.getSpeed()+", +state = "+state+"]";
    }

    public int getSpeed()
    {
        return state.getSpeed();
    }
}
