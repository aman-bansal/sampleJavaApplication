package com.sample.application.context;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Context {
    private String requestBody;
    private String requestMethod;
    private Long queryExecutionStartTime;
    private Long queryExecutionEndTime;

    public Context() {
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public Long getQueryExecutionStartTime() {
        return queryExecutionStartTime;
    }

    public void setQueryExecutionStartTime(Long queryExecutionStartTime) {
        this.queryExecutionStartTime = queryExecutionStartTime;
    }

    public Long getQueryExecutionEndTime() {
        return queryExecutionEndTime;
    }

    public void setQueryExecutionEndTime(Long queryExecutionEndTime) {
        this.queryExecutionEndTime = queryExecutionEndTime;
    }

    @Override
    public String toString() {
        return "Context{" +
                "requestBody='" + requestBody + '\'' +
                ", requestMethod='" + requestMethod + '\'' +
                ", queryExecutionStartTime=" + queryExecutionStartTime +
                ", queryExecutionEndTime=" + queryExecutionEndTime +
                '}';
    }
}