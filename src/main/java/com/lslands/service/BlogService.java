package com.lslands.service;

import com.lslands.bean.Blog;
import com.lslands.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * Created by lslands on 2020/03/04.
 */

public interface BlogService {

    //查询  根据id
    Blog getBlog(Long id);

    //分页查询
    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Page<Blog> listBlog(Pageable pageable);

    //Search  查询方法
    Page<Blog> listBlog(String query,Pageable pageable);

    //信息详情 (获取 转换)
    Blog getAndConvert(Long id);

    //推荐博客列表
    List<Blog> listRecommendBlogTop(Integer size);

    //  新增
    Blog saveBlog(Blog blog);

    //  修改
    Blog updateBlog(Long id,Blog blog);

    //删除
    void deleteBlog(Long id);


    Map<String,List<Blog>> archiveBlog();

    Long countBlog();





    Page<Blog> listBlog(Long tagId,Pageable pageable);



}
