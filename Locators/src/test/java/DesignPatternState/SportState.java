package DesignPatternState;

public class SportState implements State{

    private int speed;

    @Override
    public int getMaxSpeed() {
        return 240;
    }

    @Override
    public void setSpeedtt(int num) {
        this.speed = num;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public double getFuelCons() {
        return 8+2/speed;
    }

    public String toString(){
        return "sporteve";
    }
}
