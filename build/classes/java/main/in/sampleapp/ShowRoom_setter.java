package in.sampleapp;

public final class ShowRoom_setter {
  private ShowRoom_setter() {
  }

  public static void set(final ShowRoom showRoom, final ICar car) {
    showRoom.car = car;
  }
}
