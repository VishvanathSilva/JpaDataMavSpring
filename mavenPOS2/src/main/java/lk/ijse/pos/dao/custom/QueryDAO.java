package lk.ijse.pos.dao.custom;


import lk.ijse.pos.entity.CustomEntity;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface QueryDAO  {

    List<CustomEntity> getOrdersTotal() throws Exception;

}
