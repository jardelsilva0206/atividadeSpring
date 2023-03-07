package devs2blu.atividadefullstack.service;

import devs2blu.atividadefullstack.exception.AnimalNotFoundException;
import devs2blu.atividadefullstack.model.Animal;
import devs2blu.atividadefullstack.repositories.AnimalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    private final AnimalRepo animalRepo;

    @Autowired
    public AnimalService(AnimalRepo animalRepo){this.animalRepo = animalRepo;}

    public Animal addAnimal(Animal animal){
        return animalRepo.save(animal);
    }

    public List<Animal> findAllAnimals(){return animalRepo.findAll();}

    public Animal updateAnimal(Animal animal){ return animalRepo.save(animal);}

    public Animal findAnimalById(Long id){
        return animalRepo.findAnimalById(id)
                .orElseThrow(()-> new AnimalNotFoundException("Animal by id: "+id+" was not found"));
    }
    public void deleteAnimal(Long id){animalRepo.deleteById(id);}
}
