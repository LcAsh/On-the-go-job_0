public class Car {//Object
    String name;
    double tank;
    double oilConsumption;
    public Car()
    {

    }

    public Car(String name,double tank,double oilConsumption){
        this.name = name;
        this.tank = tank;
        this.oilConsumption = oilConsumption;
    }

    public void gas(double gas1){
        tank = tank + gas1;
    }

    public boolean run (){
        if(tank>0){
            return true;
        }return false;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", tank=" + tank + ", oilConsumption=" + oilConsumption + "]";
    }
}