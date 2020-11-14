package com.asiainfo.spzstudy.handler;

import lombok.Data;

/**
 * 返回结果实体类
 */

@Data
public class Result<T> {

    //是否成功
    private boolean flag;
    //返回码
    private Integer code;
    //返回消息
    private String message;
    //返回数据
    private T data;

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = (T) data;
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result() {
        this.flag = true;
        this.code = StatusCode.OK;
        this.message = "执行成功";
    }

    public boolean isFlag() {
        return flag;
    }

}
