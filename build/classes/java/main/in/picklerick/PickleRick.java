package in.picklerick;

import in.sampleapp.ProdSetupInjector;
import in.sampleapp.ShowRoom;
import in.sampleapp.TestSetupInjector;
import java.lang.Object;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import java.util.HashMap;
import java.util.Map;

public final class PickleRick {
  private static Map<String, Object> setupMap;

  private static IComponentInjector selectedSetup;

  static {
    setupMap = new HashMap<>();
    initAllSetups();
  }

  public static final void inject(final ShowRoom showRoom) {
    if(isSetupSelected()) {
      selectedSetup.injectShowRoom(showRoom);
    }
    else {
      throw new UnsupportedOperationException("Setup is not selected");
    }
  }

  private static void initAllSetups() {
    setupMap.put("prod_setup", new ProdSetupInjector());
    setupMap.put("test_setup", new TestSetupInjector());
  }

  private static boolean isSetupSelected() {
    return selectedSetup != null;
  }

  public static void loadSetup(String setupName) {
    if(isSetupSelected()) {
      throw new UnsupportedOperationException("Setup is already selected");
    }
    if(setupMap.containsKey(setupName)) {
      selectedSetup = (IComponentInjector)setupMap.get(setupName);
    }
    else {
      throw new UnsupportedOperationException("attempt to select unknown setup");
    }
  }
}
