package in.sampleapp;

import in.picklerick.Component;
import in.picklerick.Inject;

@Component
public final class TestCar implements ICar {

    private IWheel wheel;

    private IEngine engine;

    @Inject
    public TestCar(IWheel wheel, IEngine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "TestCar{" +
                "wheel=" + wheel +
                ", engine=" + engine +
                '}';
    }
}
