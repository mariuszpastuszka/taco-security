package workshop.sb.data;

import org.springframework.data.repository.CrudRepository;

import workshop.sb.Taco;

public interface TacoRepository 
         extends CrudRepository<Taco, Long> {

}
