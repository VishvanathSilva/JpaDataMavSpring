package lk.ijse.pos.dao.custom;

import lk.ijse.pos.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDAO extends JpaRepository<Customer,String> {

   // int count() throws Exception;

}
