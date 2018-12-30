package in.sampleapp;

import in.picklerick.Setup;

@Setup(name = "prod_setup", components = {Car.class, DieselEngine.class, AlloyWheel.class}, namedComponents = {}, subSetups = {})
public interface ProdSetup {
}
