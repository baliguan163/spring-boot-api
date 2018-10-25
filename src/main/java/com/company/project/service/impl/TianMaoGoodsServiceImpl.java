package com.company.project.service.impl;

import com.company.project.dao.TianMaoGoodsMapper;
import com.company.project.model.TianMaoGoods;
import com.company.project.service.TianMaoGoodsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-09-07.
 */
@Service
@Transactional
public class TianMaoGoodsServiceImpl extends AbstractService<TianMaoGoods> implements TianMaoGoodsService {
    @Resource
    private TianMaoGoodsMapper tianMaoGoodsMapper;

}
