import java.util.Scanner;

public class Farm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalFactory animalFactory;

        System.out.println("Welcome to Dauren's Farm!");

        while (true) {
            System.out.println("Choose an animal to make sound: chicken or cow");
            String animalType = scanner.nextLine().toLowerCase();

            if (animalType.equals("chicken")) {
                animalFactory = new ChickenFactory();
            } else if (animalType.equals("cow")) {
                animalFactory = new CowFactory();
            } else {
                System.out.println("error");
                continue;
            }
            Animal animal = animalFactory.createAnimal();
            animal.makeSound();
        }
    }
}