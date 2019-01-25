package com.ts.cloudfd.rest.request;


import java.time.LocalDateTime;

public class SignalRequest {

    private Long    id;

    private LocalDateTime   time;

    public SignalRequest() {
    }


    public Long getId() {
        return id;
    }


    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
