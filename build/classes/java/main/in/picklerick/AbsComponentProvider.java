package in.picklerick;

import in.sampleapp.AlloyWheel;
import in.sampleapp.Car;
import in.sampleapp.DieselEngine;
import in.sampleapp.TestCar;
import in.sampleapp.TestEngine;
import in.sampleapp.TestWheel;
import java.lang.String;
import java.lang.UnsupportedOperationException;

public abstract class AbsComponentProvider {
  public synchronized DieselEngine provideDieselEngine() {
    throw new UnsupportedOperationException("in.sampleapp.DieselEngine cannot be provided in " + this.getSetupName());
  }

  public synchronized AlloyWheel provideAlloyWheel() {
    throw new UnsupportedOperationException("in.sampleapp.AlloyWheel cannot be provided in " + this.getSetupName());
  }

  public synchronized TestEngine provideTestEngine() {
    throw new UnsupportedOperationException("in.sampleapp.TestEngine cannot be provided in " + this.getSetupName());
  }

  public synchronized TestWheel provideTestWheel() {
    throw new UnsupportedOperationException("in.sampleapp.TestWheel cannot be provided in " + this.getSetupName());
  }

  public synchronized Car provideCar() {
    throw new UnsupportedOperationException("in.sampleapp.Car cannot be provided in " + this.getSetupName());
  }

  public synchronized TestCar provideTestCar() {
    throw new UnsupportedOperationException("in.sampleapp.TestCar cannot be provided in " + this.getSetupName());
  }

  public abstract String getSetupName();
}
