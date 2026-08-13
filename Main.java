package farm;

import java.util.Scanner;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    // boolean game = true;
    Animal cow = new Animal("Cow", 100);
    Animal chicken = new Animal("Chicken", 80);
    Animal sheep = new Animal("Sheep", 100);

    cow.increaseHunger();
    chicken.increaseHunger();
    sheep.increaseHunger();

    System.out.println(cow.getName() + ": " + cow.getHunger());
    System.out.println(chicken.getName() + ": " + chicken.getHunger());
    System.out.println(sheep.getName() + ": " + sheep.getHunger());
  }

  // while (game) {
  // // if (hungerLevels[0] <= 0 || hungerLevels[1] <= 0 || hungerLevels[2] <= 0)
  // {
  // // System.out.println("Du hast deine Tiere verhungern lassen");
  // // game = false;
  // // } else {
  // // printHungerAnimals(hungerLevels);
  // // printFeedAnimals(hungerLevels);
  // // // checkStatus(hungerCow, hungerChicken, hungerSheep, game);
  // // }
  // // }

  // }

  // public static void printHungerAnimals() {

  // }

  // public static void printFeedAnimals(int[] hungerLevels) {
  // // System.out.println("Möchtest du die Tiere füttern?: ja / nein");
  // // String antwort = scan.nextLine();
  // // switch (antwort) {
  // // case "ja":
  // // hungerLevels[0] = feedAnimal(hungerLevels[0]);
  // // hungerLevels[1] = feedAnimal(hungerLevels[1]);
  // // hungerLevels[2] = feedAnimal(hungerLevels[2]);
  // // break;
  // // case "nein":
  // // System.out.println("Tiere wurden nicht gefüttert!");
  // // break;
  // // default:
  // // System.out.println("Ungültige Eingabe");
  // // }
  // }

  // public static void checkStatus(int hungerCow, int hungerChicken, int
  // hungerSheep, boolean game) {
  // if (hungerCow <= 0 || hungerChicken <= 0 || hungerSheep <= 0) {
  // System.out.println("Du hast deine Tiere verhungern lassen");
  // game = false;
  // System.exit(0);
  // } else {
  // game = true;
  // }
  // }

}