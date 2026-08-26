package farm;

public class Cow extends Animal implements ProductProducer {

  public Cow(String name, int hunger) {
    super(name, hunger);
  }

  @Override
  public int produce() {
    return (int) (Math.random() * 10);
  }

}
