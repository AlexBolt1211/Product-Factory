package org.factory.product.impl;

import org.factory.product.BaseProduct;

public class Glasses extends BaseProduct {

  private String name;

  public Glasses(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Glasses{" + "name='" + name + '\'' + "} " + super.toString();
  }
}
