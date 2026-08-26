package farm;

public class Sheep extends Animal implements ProductProducer {

  public Sheep(String name, int hunger) {
    super(name, hunger);
  }

  @Override
  public int produce() {
    return (int) (Math.random() * 20);
  }

}
