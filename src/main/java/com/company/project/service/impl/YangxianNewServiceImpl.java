package com.company.project.service.impl;

import com.company.project.dao.YangxianNewMapper;
import com.company.project.model.YangxianNew;
import com.company.project.service.YangxianNewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-05-31.
 */
@Service
@Transactional
public class YangxianNewServiceImpl extends AbstractService<YangxianNew> implements YangxianNewService {
    @Resource
    private YangxianNewMapper yangxianNewMapper;

}
