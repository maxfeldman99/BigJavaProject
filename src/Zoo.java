import java.util.HashMap;

public class Zoo {
    HashMap<Integer, Animal> allAnimals;

    public Zoo() {
        allAnimals = new HashMap<>();
    }

    void addAnimal(Animal a)
    {
        allAnimals.put(a.get_id(), a);
    }

}