package com.lslands.dao;

/**
 * Created by lslands on 2020/03/02.
 */

        import com.lslands.bean.User;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String name,String password);
}
