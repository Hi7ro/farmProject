import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import farm.*;

public class App {

    static boolean repeat = true;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        List<Animal> animals = new ArrayList<>();
        List<Animal> deadAnimals = filterAnimals(animals);

        animals.add(new Cow("Cow", 100));
        animals.add(new Chicken("Chicken", 80));
        animals.add(new Sheep("Sheep", 100));

        while (repeat) {
            checkAnimals(animals);
            animalsGetHungry(animals);
            printGame(animals);

        }
        scan.close();
    }

    public static void printAllAnimalStatus(List<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + ": " + animal.getHunger());
        }
    }

    public static void printGame(List<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(
                    "Möchtest du: "
                            + animal.getName()
                            + " füttern? Hunger: " + animal.getHunger() + ", alle oder keines?: "
                            + "/ alle / j / n");
            if (animal.isHungry()) {
                String answer = scan.nextLine();
                if (answer.equals("j")) {
                    animal.feedAnimal();
                    System.out.println(animal.getName() + " wurde gefüttert!\n");
                } else if (answer.equals("alle")) {
                    animals.forEach(ani -> {
                        ani.feedAnimal();
                    });
                    System.out.println("Alle wurden gefüttert!\n");
                } else if (answer.equals("n")) {
                    System.out.println("Keine Tiere wurden gefüttert!\n");
                } else
                    System.out.println("ungültige eingabe, nichts passiert...\n");
            }
        }
        printProducedProducts(animals);

    }

    public static void animalsGetHungry(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.increaseHunger();
        }
    }

    public static void checkAnimals(List<Animal> animals) {
        if (animals.isEmpty()) {
            System.out.println("All animals are dead, GAME OVER!!!");
            repeat = false;
        }
    }

    public static void printProducedProducts(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof ProductProducer producer) {
                animal.addProduct(producer.produce());
            }
            System.out.println(animal.getName()
                    + " hunger: "
                    + animal.getHunger()
                    + " prodouced: " + animal.getProduct());
        }
        System.out.println("_________________\n");
    }

    public static List<Animal> filterAnimals(List<Animal> animals) {
        return animals.stream()
                .filter(a -> a.getHunger() <= 0)
                .toList();
    }

}
