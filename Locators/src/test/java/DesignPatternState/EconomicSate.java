package DesignPatternState;

public class EconomicSate implements State {

    private int speed ;


    @Override
    public int getMaxSpeed() {
        return 90;
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
        return 8/8 + getMaxSpeed();
    }

    public String toString(){
        return "econm";
    }
}
