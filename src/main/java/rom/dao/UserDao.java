package rom.dao;

import org.springframework.stereotype.Repository;
import rom.entity.UserEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Java on 2017/03/04.
 */
@Repository
public interface UserDao<UserEntity> extends Serializable {
    public List<UserEntity> getAll();
}
