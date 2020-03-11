package com.lslands.service;

import com.lslands.bean.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by lslands on 2020/03/03.
 *
 *
 *          取名规则：  获取单个数据  后缀 get
 *                      获取多个数据      list
 *                      统计值             count
 *                      增加              save
 *                      删除          delete
 *                      修改          update
 */

public interface TypeService {

    Type saveType(Type type);

    Type getType(Long id);

    //增加  名字不能为空的校验
    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);

    List<Type> listType();

    List<Type> listTypeTop(Integer size);

    Type updateType(Long id,Type type);

    void deleteType(Long id);
}
