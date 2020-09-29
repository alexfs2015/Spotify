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
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GaiaDeviceRedirectUris(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GaiaDeviceRedirectUris[i];
        }
    };
    private final GaiaDeviceRedirectUrisAndroid mAndroidUris;

    private GaiaDeviceRedirectUris(Parcel parcel) {
        GaiaDeviceRedirectUrisAndroid gaiaDeviceRedirectUrisAndroid = (GaiaDeviceRedirectUrisAndroid) juo.b(parcel, GaiaDeviceRedirectUrisAndroid.CREATOR);
        if (gaiaDeviceRedirectUrisAndroid == null) {
            String str = "";
            gaiaDeviceRedirectUrisAndroid = new GaiaDeviceRedirectUrisAndroid(str, str, str, str);
        }
        this.mAndroidUris = gaiaDeviceRedirectUrisAndroid;
    }

    @JsonCreator
    public GaiaDeviceRedirectUris(@JsonProperty("android") GaiaDeviceRedirectUrisAndroid gaiaDeviceRedirectUrisAndroid) {
        this.mAndroidUris = gaiaDeviceRedirectUrisAndroid;
    }

    public int describeContents() {
        return 0;
    }

    @JsonGetter("android")
    public GaiaDeviceRedirectUrisAndroid getAndroidUris() {
        return this.mAndroidUris;
    }

    public void writeToParcel(Parcel parcel, int i) {
        juo.a(parcel, (Parcelable) this.mAndroidUris, i);
    }
}
