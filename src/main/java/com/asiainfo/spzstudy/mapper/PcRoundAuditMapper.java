package com.asiainfo.spzstudy.mapper;

import com.asiainfo.spzstudy.entity.PcRoundAudit;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 绕行审计结果表 Mapper 接口
 * </p>
 *
 * @author Spz
 * @since 2020-11-10
 */
public interface PcRoundAuditMapper extends BaseMapper<PcRoundAudit> {

    PcRoundAudit selectRound();
}
