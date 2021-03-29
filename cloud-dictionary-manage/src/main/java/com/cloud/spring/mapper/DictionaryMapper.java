package com.cloud.spring.mapper;

import com.cloud.spring.entity.Dictionary;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author QMS
 * @since 2021-03-29
 */
public interface DictionaryMapper extends BaseMapper<Dictionary> {
    boolean createTable(@Param("tableName") String tableName);
    boolean deleteTable(@Param("tableName") String tableName);
}
