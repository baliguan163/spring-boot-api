package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BaliguanNews;
import com.company.project.service.BaliguanNewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ado on 2018-05-29.
*/
@RestController
@RequestMapping("/baliguan/news")
public class BaliguanNewsController {
    @Resource
    private BaliguanNewsService baliguanNewsService;

    @PostMapping
    public Result add(@RequestBody BaliguanNews baliguanNews) {
        baliguanNewsService.save(baliguanNews);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        baliguanNewsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody BaliguanNews baliguanNews) {
        baliguanNewsService.update(baliguanNews);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        BaliguanNews baliguanNews = baliguanNewsService.findById(id);
        return ResultGenerator.genSuccessResult(baliguanNews);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<BaliguanNews> list = baliguanNewsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
