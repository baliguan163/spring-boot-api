package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.TianMaoGoods;
import com.company.project.service.TianMaoGoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ado on 2018-09-07.
*/
@RestController
@RequestMapping("/tian/mao/goods")
public class TianMaoGoodsController {
    @Resource
    private TianMaoGoodsService tianMaoGoodsService;

    @PostMapping
    public Result add(@RequestBody TianMaoGoods tianMaoGoods) {
        tianMaoGoodsService.save(tianMaoGoods);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        tianMaoGoodsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody TianMaoGoods tianMaoGoods) {
        tianMaoGoodsService.update(tianMaoGoods);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        TianMaoGoods tianMaoGoods = tianMaoGoodsService.findById(id);
        return ResultGenerator.genSuccessResult(tianMaoGoods);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TianMaoGoods> list = tianMaoGoodsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
