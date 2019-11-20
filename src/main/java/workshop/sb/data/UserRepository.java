package workshop.sb.data;
import org.springframework.data.repository.CrudRepository;
import workshop.sb.User;

public interface UserRepository extends CrudRepository<User, Long> {

  User findByUsername(String username);
  
}
