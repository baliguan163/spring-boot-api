package com.company.project.service.impl;

import com.company.project.dao.BaliguanNewsMapper;
import com.company.project.model.BaliguanNews;
import com.company.project.service.BaliguanNewsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-05-29.
 */
@Service
@Transactional
public class BaliguanNewsServiceImpl extends AbstractService<BaliguanNews> implements BaliguanNewsService {
    @Resource
    private BaliguanNewsMapper baliguanNewsMapper;

}
