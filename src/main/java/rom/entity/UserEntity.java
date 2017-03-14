package rom.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Java on 2017/03/04.
 * ユーザ情報クラス
 */
@Repository
public class UserEntity implements Serializable{

    private Integer id;
    private String name;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
