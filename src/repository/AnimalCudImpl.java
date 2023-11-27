package repository;

import models.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 27.11.2023
 */
public class AnimalCudImpl implements AnimalCRUD {

    private final List<Animal> ANIMALS = new ArrayList<>();

    @Override

    public boolean create(Animal animal) {
        if (animal == null || ANIMALS.contains(animal)) {
            return false;
        }
        return ANIMALS.add(animal);
    }

    @Override
    public List<Animal> getAll() {
        return ANIMALS;
    }

    @Override
    public Animal getById(long animalId) {
        return ANIMALS.stream()
                .filter(animal -> animal.getId() == animalId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Animal modifyAnimal(long animalId, String newName, int newAge) {
        Animal animal = getById(animalId);
        if (animal == null) {
            System.out.println("WARNING: Animal with id" + animalId + " not exists");
            return null;
        }
        animal.setName(newName);
        animal.setAge(newAge);
        return animal;
    }


    @Override
    public Animal deleteById(long animalId) {
        Animal animal = getById(animalId);
        if (animal == null) {
            System.out.println("WARNING: Animal with id" + animalId + " not exists");
            return null;
        }
        ANIMALS.remove(animal);
        return animal;
    }
}
