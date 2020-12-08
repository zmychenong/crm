package com.sc.spring.entity;

/**
 * 类名：Message
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/11/5 20:36
 * 版本：V1.0
 */
public class Message {
    String code;
    String status;
    String msg;

    public Message() {
    }

    public Message(String code, String status, String msg) {
        this.code = code;
        this.status = status;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
