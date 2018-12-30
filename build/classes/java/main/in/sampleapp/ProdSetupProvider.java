package in.sampleapp;

import in.picklerick.AbsComponentProvider;
import java.lang.Override;
import java.lang.String;

public final class ProdSetupProvider extends AbsComponentProvider {
  private DieselEngine dieselEngineSingleInstance;

  private AlloyWheel alloyWheelSingleInstance;

  private Car carSingleInstance;

  @Override
  public final synchronized DieselEngine provideDieselEngine() {

    if(this.dieselEngineSingleInstance != null) {
      return this.dieselEngineSingleInstance;
    }
    else {
      DieselEngine dieselEngine662589 = new DieselEngine();
      this.dieselEngineSingleInstance = dieselEngine662589;
      return dieselEngine662589;
    }

  }

  @Override
  public final synchronized AlloyWheel provideAlloyWheel() {

    if(this.alloyWheelSingleInstance != null) {
      return this.alloyWheelSingleInstance;
    }
    else {
      AlloyWheel alloyWheel336223 = new AlloyWheel();
      this.alloyWheelSingleInstance = alloyWheel336223;
      return alloyWheel336223;
    }

  }

  @Override
  public final synchronized Car provideCar() {

    if(this.carSingleInstance != null) {
      return this.carSingleInstance;
    }
    else {
      AlloyWheel alloyWheel803406 = this.provideAlloyWheel();
      DieselEngine dieselEngine652762 = this.provideDieselEngine();
      Car car208594 = new Car(alloyWheel803406, dieselEngine652762);
      this.carSingleInstance = car208594;
      return car208594;
    }

  }

  @Override
  public final String getSetupName() {
    return "ProdSetup(prod_setup)";}
}
