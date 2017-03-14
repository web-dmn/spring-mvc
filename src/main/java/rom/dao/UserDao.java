package rom.dao;

import rom.entity.UserEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Java on 2017/03/04.
 */
public interface UserDao extends Serializable{
    public List<UserEntity> getAll();
}
