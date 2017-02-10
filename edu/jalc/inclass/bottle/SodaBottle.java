package edu.jalc.inclass.bottle;
import edu.jalc.inclass.liquid.Soda;

public class SodaBottle{

  private final double capacity;
  private Soda soda;

  SodaBottle(double capacity, Soda soda){
    this.capacity = capacity;
    this.setSoda(soda);
  }

  public double getCapacity(){
    return capacity;
    }
  Soda getSoda(){
    return soda;
  }
  SodaBottle setSoda(Soda soda){
    this.soda = soda;
    return this;
  }
}
