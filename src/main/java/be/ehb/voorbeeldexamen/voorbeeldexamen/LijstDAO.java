package be.ehb.voorbeeldexamen.voorbeeldexamen;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LijstDAO extends CrudRepository<Lijst,Integer> {


    List<Lijst> findByCategorie(String categorie);
}
