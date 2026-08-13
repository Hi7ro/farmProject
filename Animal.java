package farm;

public class Animal {
  private String name;
  private int hunger;

  public Animal(String name, int hunger) {
    this.name = name;
    this.hunger = hunger;
  }

  public void increaseHunger() {
    this.hunger = Math.max(0, this.hunger - 20);
  }

  public void feed() {
    this.hunger = Math.min(100, this.hunger + 30);
  }

  public int getHunger() {
    return hunger;
  }

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
