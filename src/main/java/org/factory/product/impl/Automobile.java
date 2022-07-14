package org.factory.product.impl;

import org.factory.product.BaseProduct;

public class Automobile extends BaseProduct {

  private String brand;

  public Automobile(String brand) {
    this.brand = brand;
  }

  @Override
  public String toString() {
    return "Automobile{" + "brand='" + brand + '\'' + "} " + super.toString();
  }
}
