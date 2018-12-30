package in.picklerick;

public abstract class AbstractComponentInjector implements IComponentInjector {
  protected final AbsComponentProvider provider;

  protected AbstractComponentInjector(final AbsComponentProvider provider) {
    this.provider = provider;
  }
}
