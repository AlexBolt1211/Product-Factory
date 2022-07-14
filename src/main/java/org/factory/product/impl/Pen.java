package org.factory.product.impl;

import org.factory.product.BaseProduct;

public class Pen extends BaseProduct {

  private String name;

  public Pen(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Pen{" + "name='" + name + '\'' + "} " + super.toString();
  }
}
