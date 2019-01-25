package com.ts.cloudfd.model;

public class Signal {

    private String msg;
    private String name;

    public Signal(String msg, String name) {
        this.msg = msg;
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Signal{" +
                "msg='" + msg + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
