package com.keda.system.kedaexhibition.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author peng
 * @date 2021/1/26
 */
@Mapper
public interface VoltageMapper {

    /**
     * 根据断路器查询vlaue
     * @param parent 断路器编号
     * @return value集合
     */
    @Select("select value from voltage where parent = #{parent} order by voltage.number asc")
    List<Integer> listValueByParent(Integer parent);
}
