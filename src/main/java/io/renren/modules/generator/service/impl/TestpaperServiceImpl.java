package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.TestpaperDao;
import io.renren.modules.generator.entity.TestpaperEntity;
import io.renren.modules.generator.service.TestpaperService;


@Service("testpaperService")
public class TestpaperServiceImpl extends ServiceImpl<TestpaperDao, TestpaperEntity> implements TestpaperService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TestpaperEntity> page = this.selectPage(
                new Query<TestpaperEntity>(params).getPage(),
                new EntityWrapper<TestpaperEntity>()
        );

        return new PageUtils(page);
    }

}
