package org.factory;

import org.factory.assemble.impl.AssembleLineImpl;
import org.factory.assemble.impl.LineStepImpl;
import org.factory.product.IProduct;
import org.factory.product.impl.Automobile;
import org.factory.product.impl.Glasses;
import org.factory.product.impl.NoteBook;
import org.factory.product.impl.Pen;
import org.factory.product.impl.Tank;

public class Main {

  public static void main(String[] args) {

    construct("Car Case", "Car engine", "Chassis", new Automobile("Audi"));

    construct("Case", "lenses", "frame", new Glasses("Sun glasses"));

    construct("Case", "Motherboard", "Display", new NoteBook("Apple"));

    construct("Case", "Spring", "Pen Stem", new Pen("My Pen"));

    construct("Tank Case", "Tank Engine", "Tank Tower", new Tank("T-72"));
  }

  private static void construct(
      String stepFirst, String stepSecond, String stepThird, IProduct product) {

    var assemblyPenLine =
        new AssembleLineImpl(
            new LineStepImpl(stepFirst), new LineStepImpl(stepSecond), new LineStepImpl(stepThird));

    printProductAssembleResult(assemblyPenLine.assemblyProduct(product));
  }

  private static void printProductAssembleResult(IProduct product) {
    System.out.print("Product Assemble Result: ");
    System.out.println(product.toString());
  }
}
