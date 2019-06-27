package com.zhongweixian.domain.request;

import com.zhongweixian.domain.request.component.BaseRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InitRequest {
    @JsonProperty
    private com.zhongweixian.domain.request.component.BaseRequest BaseRequest;

    public BaseRequest getBaseRequest() {
        return BaseRequest;
    }

    public void setBaseRequest(BaseRequest baseRequest) {
        BaseRequest = baseRequest;
    }
}