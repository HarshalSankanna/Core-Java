public class MotorEngine implements Engine, Brake {
    @Override
    public void start() {
        System.out.println("Motor engine started");
    }

    @Override
    public void stop() {
        System.out.println("Motor engine stopped");
    }

    @Override
    public void brake() {
        System.out.println("Brake applied on motor engine");
    }
}
