package in.sampleapp;

import in.picklerick.AbsComponentProvider;
import java.lang.Override;
import java.lang.String;

public final class TestSetupProvider extends AbsComponentProvider {
  private TestEngine testEngineSingleInstance;

  private TestWheel testWheelSingleInstance;

  private TestCar testCarSingleInstance;

  @Override
  public final synchronized TestEngine provideTestEngine() {

    if(this.testEngineSingleInstance != null) {
      return this.testEngineSingleInstance;
    }
    else {
      TestEngine testEngine587823 = new TestEngine();
      this.testEngineSingleInstance = testEngine587823;
      return testEngine587823;
    }

  }

  @Override
  public final synchronized TestWheel provideTestWheel() {

    if(this.testWheelSingleInstance != null) {
      return this.testWheelSingleInstance;
    }
    else {
      TestWheel testWheel17231 = new TestWheel();
      this.testWheelSingleInstance = testWheel17231;
      return testWheel17231;
    }

  }

  @Override
  public final synchronized TestCar provideTestCar() {

    if(this.testCarSingleInstance != null) {
      return this.testCarSingleInstance;
    }
    else {
      TestWheel testWheel674839 = this.provideTestWheel();
      TestEngine testEngine741015 = this.provideTestEngine();
      TestCar testCar78136 = new TestCar(testWheel674839, testEngine741015);
      this.testCarSingleInstance = testCar78136;
      return testCar78136;
    }

  }

  @Override
  public final String getSetupName() {
    return "TestSetup(test_setup)";}
}
