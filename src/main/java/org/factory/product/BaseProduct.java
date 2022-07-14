package org.factory.product;

import org.factory.part.IProductPart;

public abstract class BaseProduct implements IProduct {

  private IProductPart firstPart;
  private IProductPart secondPart;
  private IProductPart thirdPart;

  @Override
  public void installFirstPart(IProductPart part) {
    firstPart = part;
  }

  @Override
  public void installSecondPart(IProductPart part) {
    secondPart = part;
  }

  @Override
  public void installThirdPart(IProductPart part) {
    thirdPart = part;
  }

  @Override
  public String toString() {
    return "Parts {"
        + "firstPart="
        + firstPart
        + ", secondPart="
        + secondPart
        + ", thirdPart="
        + thirdPart
        + '}';
  }
}
