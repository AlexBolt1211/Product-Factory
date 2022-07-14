package org.factory.assemble;

import org.factory.product.IProduct;

public interface IAssemblyLine {

  IProduct assemblyProduct(IProduct product);
}
