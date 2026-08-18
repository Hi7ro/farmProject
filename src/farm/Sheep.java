package src.farm;
public class Sheep extends Animal {

  public Sheep(String name, int hunger) {
    super(name, hunger);
  }

  @Override
  public String produce() {
    return "Wool";
  }
}