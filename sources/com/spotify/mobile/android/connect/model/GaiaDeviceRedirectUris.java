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
public class GaiaDeviceRedirectUris implements Parcelable, JacksonModel {
    public static final Creator<GaiaDeviceRedirectUris> CREATOR = new Creator<GaiaDeviceRedirectUris>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GaiaDeviceRedirectUris[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GaiaDeviceRedirectUris(parcel);
        }
    };
    private final GaiaDeviceRedirectUrisAndroid mAndroidUris;

    public int describeContents() {
        return 0;
    }

    @JsonCreator
    public GaiaDeviceRedirectUris(@JsonProperty("android") GaiaDeviceRedirectUrisAndroid gaiaDeviceRedirectUrisAndroid) {
        this.mAndroidUris = gaiaDeviceRedirectUrisAndroid;
    }

    private GaiaDeviceRedirectUris(Parcel parcel) {
        GaiaDeviceRedirectUrisAndroid gaiaDeviceRedirectUrisAndroid = (GaiaDeviceRedirectUrisAndroid) jse.b(parcel, GaiaDeviceRedirectUrisAndroid.CREATOR);
        if (gaiaDeviceRedirectUrisAndroid == null) {
            String str = "";
            gaiaDeviceRedirectUrisAndroid = new GaiaDeviceRedirectUrisAndroid(str, str, str, str);
        }
        this.mAndroidUris = gaiaDeviceRedirectUrisAndroid;
    }

    @JsonGetter("android")
    public GaiaDeviceRedirectUrisAndroid getAndroidUris() {
        return this.mAndroidUris;
    }

    public void writeToParcel(Parcel parcel, int i) {
        jse.a(parcel, (Parcelable) this.mAndroidUris, i);
    }
}
