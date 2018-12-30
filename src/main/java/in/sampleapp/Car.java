package in.sampleapp;

import in.picklerick.Component;
import in.picklerick.Inject;

@Component
public final class Car implements ICar {

    private IWheel wheel;

    private IEngine engine;

    @Inject
    public Car(IWheel wheel, IEngine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel=" + wheel +
                ", engine=" + engine +
                '}';
    }
}
