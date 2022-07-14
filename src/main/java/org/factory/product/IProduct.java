package org.factory.product;

import org.factory.part.IProductPart;

public interface IProduct {

  void installFirstPart(IProductPart part);

  void installSecondPart(IProductPart part);

  void installThirdPart(IProductPart part);
}
