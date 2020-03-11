package com.lslands.mapper;

import com.lslands.bean.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Mapper
public interface TagMapper {

    @Select("select * from t_tag")
    List<Tag> findTop(Pageable pageable);
}
