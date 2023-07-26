package com.ra.Exercise;

public class providerId {
    private String providerId;
    private String providerName;
    private boolean status;

    public providerId() {
    }

    public providerId(String providerId, String providerName, boolean status) {
        this.providerId = providerId;
        this.providerName = providerName;
        this.status = status;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
