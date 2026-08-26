package farm;

public abstract class Animal {
  private String name;
  private int hunger;
  private int product;
  private boolean isHungry;

  public Animal(String name, int hunger) {
    if (hunger < 0 || hunger > 100) {
      throw new InvalidHungerException("Hunger must be between 0 and 100, was: " + hunger);
    }

    this.name = name;
    this.hunger = hunger;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHunger() {
    return this.hunger;
  }

  public void setHunger(int hunger) {
    if (hunger < 0 || hunger > 100) {
      throw new InvalidHungerException("Hunger must be between 0 and 100, was " + hunger);
    }
    this.hunger = hunger;
  }

  public int getProduct() {
    return this.product;
  }

  public void setProduct(int product) {
    if (product < 0) {
      throw new InvalidProductionException("Product can't be under 0, was: " + product);
    }
    this.product = product;
  }

  public void addProduct(int product) {
    this.product += product;
  }

  public boolean isHungry() {
    return this.isHungry;
  }

  public void feedAnimal() {
    this.hunger = Math.min(100, this.hunger + 30);
  }

  public void increaseHunger() {
    this.hunger = Math.max(0, this.hunger - 20);

    if (this.hunger <= 30)
      this.isHungry = true;
    else
      this.isHungry = false;
  }

}