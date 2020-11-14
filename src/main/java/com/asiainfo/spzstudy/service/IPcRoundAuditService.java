package com.asiainfo.spzstudy.service;

import com.asiainfo.spzstudy.entity.PcRoundAudit;
import com.asiainfo.spzstudy.handler.PageResult;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 绕行审计结果表 服务类
 * </p>
 *
 * @author Spz
 * @since 2020-11-10
 */
@DS("slave_2")
public interface IPcRoundAuditService extends IService<PcRoundAudit> {

    PcRoundAudit getPcRoundAudit(QueryWrapper<PcRoundAudit> queryWrapper);

    PageResult<PcRoundAudit> selectRoundPage(Page<PcRoundAudit> page, QueryWrapper<PcRoundAudit> queryWrapper);
}
