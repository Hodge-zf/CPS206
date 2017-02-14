public class Dog{

  private String name;
  public Dog(String name){
    this.name=name;
  }
  public boolean equals(Object other){
    Dog dog = (Dog)other;
    return this.name.equals(dog.name);
  }
  public void bark(){
      System.out.println("woof");
  }
  public void bark(String woof){
    System.out.println(woof);
  }
}
