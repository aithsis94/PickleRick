package in.sampleapp;

import in.picklerick.AbstractComponentInjector;
import java.lang.Override;

public final class TestSetupInjector extends AbstractComponentInjector {
  public TestSetupInjector() {
    super(new TestSetupProvider());
  }

  @Override
  public void injectShowRoom(final ShowRoom showRoom) {

    ShowRoom_setter.set(showRoom, this.provider.provideTestCar());
  }
}
