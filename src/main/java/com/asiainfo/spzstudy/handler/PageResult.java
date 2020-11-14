package com.asiainfo.spzstudy.handler;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {

    private Long total;//总记录数
    private Long page;//总记录数
    private List<T> rows;//记录

    public PageResult(Long total, Long page, List<T> rows) {
        this.total = total;
        this.rows = rows;
        this.page = page;
    }

    public PageResult() {
    }
}
