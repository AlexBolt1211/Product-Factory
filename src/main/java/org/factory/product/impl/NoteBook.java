package org.factory.product.impl;

import org.factory.product.BaseProduct;

public class NoteBook extends BaseProduct {

  private String model;

  public NoteBook(String model) {
    this.model = model;
  }

  @Override
  public String toString() {
    return "NoteBook{" + "model='" + model + '\'' + "} " + super.toString();
  }
}
