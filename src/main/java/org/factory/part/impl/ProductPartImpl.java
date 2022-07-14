package org.factory.part.impl;

import org.factory.part.IProductPart;

public class ProductPartImpl implements IProductPart {

  private String name;

  public ProductPartImpl(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "ProductPart{" + "name='" + name + '\'' + '}';
  }
}
