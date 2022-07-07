interface Engine {
    void activate();
}
class CarEngine implements Engine {
    @Override
    public void activate() {
        System.out.println("Car engine is activated.");
    }
}
class MotorBikeEngine implements Engine {
    @Override
    public void activate() {
        System.out.println("Motor bike engine is activated.");
    }
}
abstract class EngineFactory {
    void newEngine() {
        Engine engine = createEngine();
        engine.activate();
    }
    abstract Engine createEngine();
}
class KiaEngine extends EngineFactory {
    @Override
    public Engine createEngine() {
        return new CarEngine();
    }
}
class YakuzaEngine extends EngineFactory {
    @Override
    public Engine createEngine() {
        return new MotorBikeEngine();
    }
}
public class FactoryPattern {
    public static EngineFactory engineFactory;
    public static void configure(String type) {
        if(type.equalsIgnoreCase("car"))
            engineFactory = new KiaEngine();
        if(type.equalsIgnoreCase("motorbike"))
            engineFactory = new YakuzaEngine();
    }
    public static void main(String[] args) {
        configure("Car");
        engineFactory.newEngine();
    }
}
