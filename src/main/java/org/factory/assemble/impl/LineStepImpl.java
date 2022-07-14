package org.factory.assemble.impl;

import org.factory.assemble.ILineStep;
import org.factory.part.IProductPart;
import org.factory.part.impl.ProductPartImpl;

public class LineStepImpl implements ILineStep {

  private String partName;

  public LineStepImpl(String partName) {
    this.partName = partName;
  }

  @Override
  public IProductPart buildProductPart() {
    return new ProductPartImpl(partName);
  }
}
