package main.reponsitory;

import main.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserReponsitory extends CrudRepository<UserEntity, Integer>{
}
