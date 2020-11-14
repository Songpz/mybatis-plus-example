package com.asiainfo.spzstudy.controller;


import com.asiainfo.spzstudy.entity.PcRoundAudit;
import com.asiainfo.spzstudy.handler.PageResult;
import com.asiainfo.spzstudy.handler.Result;
import com.asiainfo.spzstudy.handler.StatusCode;
import com.asiainfo.spzstudy.service.IPcRoundAuditService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 绕行审计结果表 前端控制器
 * </p>
 *
 * @author Spz
 * @since 2020-11-10
 */
@RestController
@RequestMapping("/test")
public class PcRoundAuditController {

    @Autowired
    private IPcRoundAuditService iPcRoundAuditService;

    @GetMapping("/getPcRoundAudit")
    public Result<PcRoundAudit> getPcRoundAudit(PcRoundAudit pcRoundAudit) {

        QueryWrapper<PcRoundAudit> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("pcra_id", pcRoundAudit.getPcraId());
        PcRoundAudit one = iPcRoundAuditService.getPcRoundAudit(queryWrapper);
        return new Result<>(true, StatusCode.OK, "查询成功", one);
    }

    @RequestMapping("/selectRoundPage")
    public Result<PcRoundAudit> selectRoundPage(Integer pageNum, Integer pageSize) {

        Page<PcRoundAudit> page = new Page<>(pageNum, pageSize);
        QueryWrapper<PcRoundAudit> queryWrapper = new QueryWrapper<>();
        PageResult<PcRoundAudit> pageResult = iPcRoundAuditService.selectRoundPage(page, queryWrapper);

        return new Result<>(true, StatusCode.OK, "查询成功", pageResult);
    }

    @RequestMapping("/addPcRoundAudit")
    public Result<PcRoundAudit> addPcRoundAudit(PcRoundAudit pcRoundAudit) {

        QueryWrapper<PcRoundAudit> queryWrapper = new QueryWrapper<>();
        pcRoundAudit.setClientIp(pcRoundAudit.getClientIp());
        pcRoundAudit.setCreateTime(pcRoundAudit.getCreateTime());
        pcRoundAudit.setDoubtType(pcRoundAudit.getDoubtType());
        pcRoundAudit.setHostIp(pcRoundAudit.getHostIp());
        queryWrapper.setEntity(pcRoundAudit);
        boolean bool = iPcRoundAuditService.update(queryWrapper);

        if (bool) {
            return new Result<>();
        }

        return new Result<>(false, StatusCode.ERROR, "添加失败！");
    }
}
