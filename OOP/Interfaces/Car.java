public class Car implements Engine, Brake, Media {

    @Override
    public void start() {
        System.out.println("I start as a car");
    }

    @Override
    public void stop() {
        System.out.println("I stop as a car");
    }

    @Override
    public void brake() {
        System.out.println("I brake as a car");
    }

}
