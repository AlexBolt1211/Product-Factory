package org.factory.product.impl;

import org.factory.product.BaseProduct;

public class Tank extends BaseProduct {

  private String model;

  public Tank(String model) {
    this.model = model;
  }

  @Override
  public String toString() {
    return "Tank{" + "model='" + model + '\'' + "} " + super.toString();
  }
}
