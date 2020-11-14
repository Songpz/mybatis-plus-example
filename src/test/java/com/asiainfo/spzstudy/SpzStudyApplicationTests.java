package com.asiainfo.spzstudy;

import com.asiainfo.spzstudy.entity.PcRoundAudit;
import com.asiainfo.spzstudy.mapper.PcRoundAuditMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class SpzStudyApplicationTests {


    @Autowired
    private PcRoundAuditMapper pcRoundAuditMapper;


    @Test
    void contextLoads() {
    }

    /**
     * 分页查询
     */
    @Test
    public void selectByPage() {
        QueryWrapper<PcRoundAudit> wrapper = new QueryWrapper();

        Page<PcRoundAudit> page = new Page<>(1,20);

        //IPage<User> userIPage = userMapper.selectPage(page, wrapper);

        IPage<PcRoundAudit> mapIPage = pcRoundAuditMapper.selectPage(page, wrapper);


        System.out.println("总页数"+mapIPage.getPages());
        System.out.println("总记录数"+mapIPage.getTotal());
        List<PcRoundAudit> records = mapIPage.getRecords();
        records.forEach(System.out::println);
    }
}
