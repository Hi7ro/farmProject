package farm;

public class Chicken extends Animal implements ProductProducer {

  public Chicken(String name, int hunger) {
    super(name, hunger);
  }

  @Override
  public int produce() {
    return (int) (Math.random() * 5);
  }

}
