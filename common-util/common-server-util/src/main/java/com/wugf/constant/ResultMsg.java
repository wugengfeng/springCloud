package com.wugf.constant;


public enum ResultMsg {
    FAIL(-1, "fail"),
    SUCCESS(0, "success");

    private Integer code;
    private String msg;

    ResultMsg(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

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
}
