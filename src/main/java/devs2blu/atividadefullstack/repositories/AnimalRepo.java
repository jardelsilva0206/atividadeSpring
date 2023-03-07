package devs2blu.atividadefullstack.repositories;

import devs2blu.atividadefullstack.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnimalRepo extends JpaRepository<Animal, Long> {

    Optional<Animal> findAnimalById(Long id);

    void deleteAnimalById(Long id);
}
