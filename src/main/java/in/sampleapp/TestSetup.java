package in.sampleapp;

import in.picklerick.Setup;

@Setup(name = "test_setup", components = {TestWheel.class, TestEngine.class, TestCar.class}, namedComponents = {}, subSetups = {})
public interface TestSetup {
}
