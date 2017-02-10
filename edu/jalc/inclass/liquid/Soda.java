package edu.jalc.inclass.liquid;

public class Soda{

    private double volume;

    public Soda(double volume){
      setVolume(volume);
    }
    public Soda(){
      setVolume(0.0);
    }
    public Soda setVolume(double volume){
      this.volume = volume;
      return this;
    }
    public double getVolume(){
      return volume;
    }

}
