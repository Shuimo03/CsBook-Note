
interface Engine{
    public void turnOn();
}

class Car{

    private Engine engine;

    public Car(){}

    public void start(){
        engine.turnOn();
    }
}

public class Test {


    public static void main(String[]args){
        Car car = new Car(); //实例化

    }
}
