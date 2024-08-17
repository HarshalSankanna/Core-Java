public class NiceCar {
    private Engine engine;
    private Media musicPlayer = new CDPlayer();

    public NiceCar() {
        engine = new MotorEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void musicStart() {
        musicPlayer.start();
    }

    public void musicStop() {
        musicPlayer.stop();
    }

}
