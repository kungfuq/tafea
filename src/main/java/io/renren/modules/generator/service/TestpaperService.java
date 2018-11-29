package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.TestpaperEntity;

import java.util.Map;

/**
 * 试题管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-11-21 17:24:14
 */
public interface TestpaperService extends IService<TestpaperEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

