public class ElectricEngine implements Engine, Brake {
    @Override
    public void start() {
        System.out.println("Electric engine started");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stopped");
    }

    @Override
    public void brake() {
        System.out.println("Brake applied on electric engine");
    }
}
