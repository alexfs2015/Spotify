package com.spotify.music.features.connect.cast.discovery;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscoveredDevice implements JacksonModel {
    public static final String CLASS_JS_CAST = "cast-js";
    static final String DEVICE_AUDIO_TYPE = "CASTAUDIO";
    static final String DEVICE_DEFAULT_PUBLIC_KEY = "SU5WQUxJRA==";
    static final Integer DEVICE_DEFAULT_SUCCESS_STATUS = Integer.valueOf(101);
    static final String DEVICE_DEFAULT_VERSION = "2.2.0";
    public static final Integer DEVICE_FAILURE_STATUS_BAD_REQUEST = Integer.valueOf(102);
    public static final Integer DEVICE_FAILURE_STATUS_INVALID_PUBLIC_KEY = Integer.valueOf(203);
    public static final Integer DEVICE_FAILURE_STATUS_LOGIN_FAILED = Integer.valueOf(202);
    public static final Integer DEVICE_FAILURE_STATUS_NOT_INITIALIZED = Integer.valueOf(0);
    public static final Integer DEVICE_FAILURE_UNKNOWN = Integer.valueOf(204);
    static final String DEVICE_FREE_ACCOUNT_REQ = "FREE";
    static final String DEVICE_PREMIUM_ACCOUNT_REQ = "PREMIUM";
    static final String DEVICE_VIDEO_TYPE = "CASTVIDEO";
    public static final int ERROR_PREMIUM_REQUIRED = 9;
    /* access modifiers changed from: private */
    public String mAccountReq;
    private String mBrandDisplayName;
    /* access modifiers changed from: private */
    public String mClientId;
    /* access modifiers changed from: private */
    public String mDeviceClass;
    private final String mDeviceId;
    /* access modifiers changed from: private */
    public String mDeviceType;
    /* access modifiers changed from: private */
    public int mErrorCode;
    /* access modifiers changed from: private */
    public String mIpAddress;
    /* access modifiers changed from: private */
    public boolean mIsAudioGroup;
    /* access modifiers changed from: private */
    public String mLibraryVersion;
    private String mModelDisplayName;
    /* access modifiers changed from: private */
    public String mPublicKey;
    private String mRemoteName;
    /* access modifiers changed from: private */
    public String mScope;
    /* access modifiers changed from: private */
    public Integer mStatus;
    /* access modifiers changed from: private */
    public String mTokenType;
    /* access modifiers changed from: private */
    public String mVersion;

    public static class a {
        public final DiscoveredDevice a;

        public a(String str, String str2, String str3, String str4) {
            DiscoveredDevice discoveredDevice = new DiscoveredDevice(str, str2, str3, str4);
            this.a = discoveredDevice;
        }
    }

    public static DiscoveredDevice errorStatusDevice(String str, Integer num) {
        DiscoveredDevice discoveredDevice = new DiscoveredDevice(str);
        discoveredDevice.setStatus(num);
        return discoveredDevice;
    }

    private DiscoveredDevice(String str) {
        this.mDeviceId = str;
    }

    private DiscoveredDevice(String str, String str2, String str3, String str4) {
        this.mDeviceId = str;
        this.mStatus = DEVICE_DEFAULT_SUCCESS_STATUS;
        this.mVersion = DEVICE_DEFAULT_VERSION;
        this.mPublicKey = DEVICE_DEFAULT_PUBLIC_KEY;
        this.mRemoteName = str2;
        this.mAccountReq = DEVICE_FREE_ACCOUNT_REQ;
        this.mDeviceType = DEVICE_VIDEO_TYPE;
        this.mBrandDisplayName = str3;
        this.mModelDisplayName = str4;
        String str5 = "";
        this.mLibraryVersion = str5;
        this.mTokenType = str5;
        this.mIpAddress = str5;
        this.mIsAudioGroup = false;
        this.mDeviceClass = CLASS_JS_CAST;
    }

    @JsonCreator
    private DiscoveredDevice(@JsonProperty("deviceID") String str, @JsonProperty("remoteName") String str2, @JsonProperty("deviceType") String str3, @JsonProperty("brandDisplayName") String str4, @JsonProperty("modelDisplayName") String str5, @JsonProperty("status") Integer num, @JsonProperty("accountReq") String str6, @JsonProperty("version") String str7, @JsonProperty("libraryVersion") String str8, @JsonProperty("publicKey") String str9, @JsonProperty("tokenType") String str10, @JsonProperty("clientID") String str11, @JsonProperty("scope") String str12, @JsonProperty("spotifyError") int i, @JsonProperty("deviceAPI_isGroup") boolean z, @JsonProperty("deviceAPI_ipAddress") String str13, @JsonProperty("deviceAPI_deviceClass") String str14) {
        this.mStatus = num;
        this.mVersion = str7;
        this.mDeviceId = str;
        this.mPublicKey = str9;
        this.mRemoteName = str2;
        this.mAccountReq = str6;
        this.mDeviceType = str3;
        this.mBrandDisplayName = str4;
        this.mModelDisplayName = str5;
        this.mLibraryVersion = str8;
        this.mTokenType = str10;
        this.mScope = str12;
        this.mClientId = str11;
        this.mErrorCode = i;
        this.mIsAudioGroup = z;
        this.mIpAddress = str13;
        this.mDeviceClass = str14;
    }

    @JsonGetter("status")
    public Integer getStatus() {
        return this.mStatus;
    }

    @JsonGetter("version")
    public String getVersion() {
        return this.mVersion;
    }

    @JsonGetter("deviceID")
    public String getDeviceId() {
        return this.mDeviceId;
    }

    @JsonGetter("publicKey")
    public String getPublicKey() {
        return this.mPublicKey;
    }

    @JsonGetter("remoteName")
    public String getRemoteName() {
        return this.mRemoteName;
    }

    @JsonGetter("accountReq")
    public String getAccountReq() {
        return this.mAccountReq;
    }

    @JsonGetter("deviceType")
    public String getDeviceType() {
        return this.mDeviceType;
    }

    @JsonGetter("brandDisplayName")
    public String getBrandDisplayName() {
        return this.mBrandDisplayName;
    }

    @JsonGetter("modelDisplayName")
    public String getModelDisplayName() {
        return this.mModelDisplayName;
    }

    @JsonGetter("libraryVersion")
    public String getLibraryVersion() {
        return this.mLibraryVersion;
    }

    @JsonGetter("spotifyError")
    public int getErrorCode() {
        return this.mErrorCode;
    }

    @JsonGetter("tokenType")
    public String getTokenType() {
        return this.mTokenType;
    }

    @JsonGetter("scope")
    public String getScope() {
        return this.mScope;
    }

    @JsonGetter("clientID")
    public String getClientId() {
        return this.mClientId;
    }

    @JsonGetter("deviceAPI_isGroup")
    public int isAudioGroup() {
        return this.mIsAudioGroup ? 1 : 0;
    }

    @JsonGetter("deviceAPI_ipAddress")
    public String getIpAddress() {
        return this.mIpAddress;
    }

    @JsonGetter("deviceAPI_deviceClass")
    public String getDeviceClass() {
        return this.mDeviceClass;
    }

    public void setStatus(Integer num) {
        this.mStatus = num;
    }

    public void setTokenType(String str) {
        this.mTokenType = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveredDevice)) {
            return false;
        }
        return this.mDeviceId.equals(((DiscoveredDevice) obj).mDeviceId);
    }

    public int hashCode() {
        return this.mDeviceId.hashCode();
    }
}
