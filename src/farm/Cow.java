package src.farm;
public class Cow extends Animal {

  public Cow(String name, int hunger) {
    super(name, hunger);
  }

  @Override
  public String produce() {
    return "Milk";
  }

}
