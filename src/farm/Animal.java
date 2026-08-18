package src.farm;

public abstract class Animal {
  private String name;
  private int hunger;
  private boolean isHungry;

  public Animal(String name, int hunger) {
    if (hunger < 0 || hunger > 100) {
      throw new InvalidHungerException("Hunger must be between 0 and 100, was: " + hunger + ".\n");
    }

    this.name = name;
    this.hunger = hunger;
  }

  public void increaseHunger() {
    this.hunger = Math.max(0, this.hunger - 20);

    if (this.hunger <= 30)
      this.isHungry = true;
    else
      this.isHungry = false;
  }

  public boolean isHungry() {
    return isHungry;
  }

  public void feed() {
    this.hunger = Math.min(100, this.hunger + 30);
  }

  public int getHunger() {
    return hunger;
  }

  public void setHunger(int hunger) {
    if (hunger < 0 || hunger > 100) {
      throw new InvalidHungerException("Hunger must be setted between 0 and 100, was: " + hunger + ".\n");
    }
    this.hunger = hunger;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name + ": " + this.hunger;
  }

}
