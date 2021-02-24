package com.keda.system.kedaexhibition.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author peng
 * @date 2021/1/26
 */
@Mapper
public interface CurrentMapper {

    /**
     * 根据断路器查询vlaue
     * @param parent 断路器编号
     * @return value集合
     */
    @Select("select value from current where parent = #{parent} order by current.number asc")
    List<Integer> listValueByParent(Integer parent);
}
