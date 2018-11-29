package io.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.generator.entity.TestpaperEntity;
import io.renren.modules.generator.service.TestpaperService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 试题管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-11-21 17:24:14
 */
@RestController
@RequestMapping("generator/testpaper")
public class TestpaperController {
    @Autowired
    private TestpaperService testpaperService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:testpaper:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = testpaperService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{paperId}")
    @RequiresPermissions("generator:testpaper:info")
    public R info(@PathVariable("paperId") Long paperId){
			TestpaperEntity testpaper = testpaperService.selectById(paperId);

        return R.ok().put("testpaper", testpaper);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:testpaper:save")
    public R save(@RequestBody TestpaperEntity testpaper){
			testpaperService.insert(testpaper);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:testpaper:update")
    public R update(@RequestBody TestpaperEntity testpaper){
			testpaperService.updateById(testpaper);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:testpaper:delete")
    public R delete(@RequestBody Long[] paperIds){
			testpaperService.deleteBatchIds(Arrays.asList(paperIds));

        return R.ok();
    }

}
