package workshop.sb.data;

import org.springframework.data.repository.CrudRepository;

import workshop.sb.Order;

public interface OrderRepository 
         extends CrudRepository<Order, Long> {

}
