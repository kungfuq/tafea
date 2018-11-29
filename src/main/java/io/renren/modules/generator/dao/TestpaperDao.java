package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.TestpaperEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 试题管理
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-11-21 17:24:14
 */
@Mapper
public interface TestpaperDao extends BaseMapper<TestpaperEntity> {
	
}
