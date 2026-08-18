package src.farm;

public class Chicken extends Animal implements ProductProducer {

  public Chicken(String name, int hunger) {
    super(name, hunger);
  }

  @Override
  public String produce() {
    return "Eggs";
  }
}