package com.asiainfo.spzstudy.service.impl;

import com.asiainfo.spzstudy.entity.PcRoundAudit;
import com.asiainfo.spzstudy.handler.PageResult;
import com.asiainfo.spzstudy.mapper.PcRoundAuditMapper;
import com.asiainfo.spzstudy.service.IPcRoundAuditService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 绕行审计结果表 服务实现类
 * </p>
 *
 * @author Spz
 * @since 2020-11-10
 */

@Service
public class PcRoundAuditServiceImpl extends ServiceImpl<PcRoundAuditMapper, PcRoundAudit> implements IPcRoundAuditService {

    @Autowired
    private PcRoundAuditMapper pcRoundAuditMapper;


    @Override
    public PcRoundAudit getPcRoundAudit(QueryWrapper<PcRoundAudit> queryWrapper) {
        PcRoundAudit pcRoundAudit1 = pcRoundAuditMapper.selectOne(queryWrapper);
        return pcRoundAudit1;
    }

    public PcRoundAudit getOneBysql() {
        PcRoundAudit pcRoundAudit1 = pcRoundAuditMapper.selectRound();
        return pcRoundAudit1;
    }

    @Override
    public PageResult<PcRoundAudit> selectRoundPage(Page<PcRoundAudit> page, QueryWrapper<PcRoundAudit> queryWrapper) {
        IPage<PcRoundAudit> roundPage = pcRoundAuditMapper.selectPage(page, queryWrapper);
        return new PageResult<>(roundPage.getTotal(), roundPage.getPages(), roundPage.getRecords());
    }
}
