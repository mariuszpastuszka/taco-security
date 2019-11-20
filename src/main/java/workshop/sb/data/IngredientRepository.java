package workshop.sb.data;

import org.springframework.data.repository.CrudRepository;

import workshop.sb.Ingredient;

public interface IngredientRepository 
         extends CrudRepository<Ingredient, String> {

}
