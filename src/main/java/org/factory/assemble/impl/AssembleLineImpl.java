package org.factory.assemble.impl;

import org.factory.assemble.IAssemblyLine;
import org.factory.assemble.ILineStep;
import org.factory.product.IProduct;

public class AssembleLineImpl implements IAssemblyLine {

  private ILineStep firstStep;
  private ILineStep secondStep;
  private ILineStep thirdStep;

  public AssembleLineImpl(ILineStep firstStep, ILineStep secondStep, ILineStep thirdStep) {
    this.firstStep = firstStep;
    this.secondStep = secondStep;
    this.thirdStep = thirdStep;
  }

  @Override
  public IProduct assemblyProduct(IProduct product) {
    product.installFirstPart(firstStep.buildProductPart());

    product.installSecondPart(secondStep.buildProductPart());

    product.installThirdPart(thirdStep.buildProductPart());

    return product;
  }
}
