package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.YangxianNew;
import com.company.project.service.YangxianNewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ado on 2018-05-31.
*/
@RestController
@RequestMapping("/yangxian/new")
public class YangxianNewController {
    @Resource
    private YangxianNewService yangxianNewService;

    @PostMapping
    public Result add(@RequestBody YangxianNew yangxianNew) {
        yangxianNewService.save(yangxianNew);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        yangxianNewService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody YangxianNew yangxianNew) {
        yangxianNewService.update(yangxianNew);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        YangxianNew yangxianNew = yangxianNewService.findById(id);
        return ResultGenerator.genSuccessResult(yangxianNew);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<YangxianNew> list = yangxianNewService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
