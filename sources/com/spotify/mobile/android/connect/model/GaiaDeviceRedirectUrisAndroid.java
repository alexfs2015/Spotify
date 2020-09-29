package com.spotify.mobile.android.connect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GaiaDeviceRedirectUrisAndroid implements Parcelable, JacksonModel {
    public static final Creator<GaiaDeviceRedirectUrisAndroid> CREATOR = new Creator<GaiaDeviceRedirectUrisAndroid>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GaiaDeviceRedirectUrisAndroid[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GaiaDeviceRedirectUrisAndroid(parcel);
        }
    };
    private final String mDeviceNameParam;
    private final String mFallbackUrl;
    private final String mRedirectBackAppParam;
    private final String mUri;

    public int describeContents() {
        return 0;
    }

    @JsonCreator
    public GaiaDeviceRedirectUrisAndroid(@JsonProperty("uri") String str, @JsonProperty("redirectBackAppParam") String str2, @JsonProperty("deviceNameParam") String str3, @JsonProperty("fallbackUrl") String str4) {
        if (str == null) {
            str = "";
        }
        this.mUri = str;
        this.mRedirectBackAppParam = str2;
        this.mDeviceNameParam = str3;
        this.mFallbackUrl = str4;
    }

    private GaiaDeviceRedirectUrisAndroid(Parcel parcel) {
        String c = jse.c(parcel);
        if (c == null) {
            c = "";
        }
        this.mUri = c;
        this.mRedirectBackAppParam = jse.c(parcel);
        this.mDeviceNameParam = jse.c(parcel);
        this.mFallbackUrl = jse.c(parcel);
    }

    @JsonGetter("uri")
    public String getUri() {
        return this.mUri;
    }

    @JsonGetter("redirectBackAppParam")
    public String getRedirectBackAppParam() {
        return this.mRedirectBackAppParam;
    }

    @JsonGetter("deviceNameParam")
    public String getDeviceNameParam() {
        return this.mDeviceNameParam;
    }

    @JsonGetter("fallbackUrl")
    public String getFallbackUrl() {
        return this.mFallbackUrl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        jse.a(parcel, this.mUri);
        jse.a(parcel, this.mRedirectBackAppParam);
        jse.a(parcel, this.mDeviceNameParam);
        jse.a(parcel, this.mFallbackUrl);
    }
}
