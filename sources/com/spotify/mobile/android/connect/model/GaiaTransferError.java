package com.spotify.mobile.android.connect.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.connect.model.ConnectDevice.DeviceTransferError;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GaiaTransferError implements JacksonModel {
    private final String mDeviceId;
    private final DeviceTransferError mErrorCode;

    @JsonCreator
    public GaiaTransferError(@JsonProperty("code") int i, @JsonProperty("device") String str) {
        this.mErrorCode = DeviceTransferError.a(i);
        this.mDeviceId = str;
    }

    public DeviceTransferError getErrorCode() {
        return this.mErrorCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GaiaTransferError{mDeviceId='");
        sb.append(this.mDeviceId);
        sb.append('\'');
        sb.append(", mErrorCode=");
        sb.append(this.mErrorCode);
        sb.append('}');
        return sb.toString();
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }
}
