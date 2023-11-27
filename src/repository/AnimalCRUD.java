package repository;

import models.Animal;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 27.11.2023
 */
public interface AnimalCRUD {

    //CRUD
    boolean create(Animal animal);

    List<Animal> getAll();

    Animal getById(long animalId);

    Animal modifyAnimal(long animalId, String newName, int age);

    Animal deleteById(long animalId);
}
