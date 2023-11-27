import models.Cat;
import models.Dog;
import repository.AnimalCRUD;
import repository.AnimalCudImpl;

import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 27.11.2023
 */
public class Application {

    public static void main(String[] args) {
        final AnimalCRUD animalCud = new AnimalCudImpl();
        Scanner scanner = new Scanner(System.in);

        String line = "";
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter animal type:");
            System.out.println("(1) -> Dog");
            System.out.println("(2) -> Cat");

            int selectedType = scanner.nextInt();
            scanner.nextLine();
            switch (selectedType) {
                case 1: {
                    System.out.println("Enter animal name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter animal age");
                    int age = scanner.nextInt();
                    animalCud.create(new Dog(name, age));
                    break;
                }
                case 2: {
                    System.out.println("Enter animal name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter animal age");
                    int age = scanner.nextInt();
                    animalCud.create(new Cat(name, age));
                    break;
                }
            }

        }

        System.out.println("All animals:");
//        animalCud.getAll().forEach(System.out::println);
        animalCud.getAll().forEach(animal -> System.out.println(animal));
    }
}
