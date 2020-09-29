package com.spotify.mobile.android.connect.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonDeserialize(using = GaiaState_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GaiaState implements JacksonModel {
    private final List<GaiaDevice> mDevices;
    private final boolean mIsActive;
    private final String mOnboardingDevice;
    private final boolean mShouldUseLocalPlayback;
    private final GaiaTransferError mTransferError;

    @JsonCreator
    public GaiaState(@JsonProperty("is_active") boolean z, @JsonProperty("onboarding_device") String str, @JsonProperty("should_use_local_playback") boolean z2, @JsonProperty("transfer_error") GaiaTransferError gaiaTransferError, @JsonProperty("devices") List<GaiaDevice> list) {
        this.mIsActive = z;
        this.mOnboardingDevice = str;
        this.mShouldUseLocalPlayback = z2;
        this.mTransferError = gaiaTransferError;
        this.mDevices = gcn.a(list);
    }

    @JsonGetter("devices")
    public List<GaiaDevice> getDevices() {
        return this.mDevices;
    }

    @JsonGetter("onboarding_device")
    public String getOnboardingDevice() {
        return this.mOnboardingDevice;
    }

    @JsonGetter("transfer_error")
    public GaiaTransferError getTransferError() {
        return this.mTransferError;
    }

    @JsonGetter("is_active")
    public Boolean isActive() {
        return Boolean.valueOf(this.mIsActive);
    }

    @JsonGetter("should_use_local_playback")
    public boolean shouldUseLocalPlayback() {
        return this.mShouldUseLocalPlayback;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GaiaState{, mOnboardingDevice='");
        sb.append(this.mOnboardingDevice);
        sb.append('\'');
        String str = "=Asvmi,tIcse";
        sb.append(", mIsActive=");
        sb.append(this.mIsActive);
        sb.append(", mShouldUseLocalPlayback=");
        sb.append(this.mShouldUseLocalPlayback);
        String str2 = "rE mrornersr,a=Tf";
        sb.append(", mTransferError=");
        sb.append(this.mTransferError);
        String str3 = "Dv eosimec=";
        sb.append(", mDevices=");
        sb.append(this.mDevices);
        sb.append('}');
        return sb.toString();
    }
}
