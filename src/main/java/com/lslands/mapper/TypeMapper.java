package com.lslands.mapper;

import com.lslands.bean.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Mapper
public interface TypeMapper {

    @Select("select * from t_type")
    List<Type> findTop(Pageable pageable);

}
