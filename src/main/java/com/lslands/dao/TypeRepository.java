package com.lslands.dao;

/**
 * Created by lslands on 2020/03/02.
 */

import com.lslands.bean.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypeRepository extends JpaRepository<Type,Long> {

    //增加  名字不能为空的校验
    Type findByName(String name);

    @Query("select t from t_type t")
    List<Type> findTop(Pageable pageable);


}
