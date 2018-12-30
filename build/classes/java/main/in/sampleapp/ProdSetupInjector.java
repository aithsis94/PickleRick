package in.sampleapp;

import in.picklerick.AbstractComponentInjector;
import java.lang.Override;

public final class ProdSetupInjector extends AbstractComponentInjector {
  public ProdSetupInjector() {
    super(new ProdSetupProvider());
  }

  @Override
  public void injectShowRoom(final ShowRoom showRoom) {

    ShowRoom_setter.set(showRoom, this.provider.provideCar());
  }
}
