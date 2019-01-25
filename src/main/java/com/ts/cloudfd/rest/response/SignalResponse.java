package com.ts.cloudfd.rest.response;

public class SignalResponse {
    private   Long id;
    private   Long  uuid;

    public SignalResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }
}
