package com.wugf.vo;

import com.wugf.constant.ResultMsg;

/**
 * 统一返回数据格式实体
 */
public class ResultVo<T> {
    private Integer code;
    private String msg;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setResultMsg(ResultMsg resultMsg){
        if (resultMsg != null) {
            this.code = resultMsg.getCode();
            this.msg = resultMsg.getMsg();
        }
    }
}
