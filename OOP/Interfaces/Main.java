public class Main {
    public static void main(String[] args) {
        // Car car = new Car();
        // car.start();
        // car.stop();
        // car.brake();
        NiceCar car = new NiceCar(new ElectricEngine());
        car.start();
        car.musicStart();
        car.stop();
        car.musicStop();
        car.upgradeEngine(new MotorEngine());
        car.start();
    }
}