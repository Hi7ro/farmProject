package src.farm;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    List<Animal> animals = new ArrayList<>();
    animals.add(new Cow("Cow", 100));
    animals.add(new Chicken("Chicken", 80));
    animals.add(new Sheep("Sheep", 100));

    System.out.println(animals);

    for (int i = 0; i < 3; i++) {
      System.out.println("Tag: " + (i + 1) + "\n");
      for (Animal animal : animals) {
        animal.increaseHunger();
        System.out.println(animal);
        System.out.println(animal.getName() + " produces " + animal.produce());
      }
      // printAllAnimals(animals);

      System.out.println("___________________________\n");
      printAllAnimals(getHungryAnimals(animals));
    }

  }

  public static void printAllAnimals(List<Animal> animals) {
    for (Animal animal : animals) {
      System.out.println(animal.getName() + ": " + animal.getHunger());
    }

  }

  public static List<Animal> getHungryAnimals(List<Animal> animals) {
    List<Animal> hungryAnimals = new ArrayList<>();
    for (Animal animal : animals) {
      if (animal.isHungry()) {
        hungryAnimals.add(animal);
      }
    }

    return hungryAnimals;
  }

}