package com.lslands.mapper;

import com.lslands.bean.Blog;
import com.lslands.bean.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Mapper
public interface BlogMapper {

    /**
     * search  查询方法
     * Created by lslands on 2020/03/06.
     */
    @Select("select title,content from t_blog where title like '?%' or content like '?%'")
    Page<Blog> findByQuery(String query, Pageable pageable);



}
