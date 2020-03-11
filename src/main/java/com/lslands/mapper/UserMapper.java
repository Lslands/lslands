/*
package com.lslands.mapper;

import com.lslands.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    //登录
    @Select("select *  from t_user where username = #{username} and password= #{password}")
    User findByUsernameAndPassword(@Param("username") String username,@Param("password") String password);
}
*/
