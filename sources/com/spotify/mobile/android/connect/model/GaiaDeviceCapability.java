package com.spotify.mobile.android.connect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GaiaDeviceCapability implements Parcelable, JacksonModel {
    public static final Creator<GaiaDeviceCapability> CREATOR = new Creator<GaiaDeviceCapability>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GaiaDeviceCapability(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GaiaDeviceCapability[i];
        }
    };
    private final String mDefaultTitle;
    private final GaiaDeviceRedirectUris mGaiaDeviceRedirectUris;
    private final String mIconUrl;
    private final String mId;
    private final Map<String, String> mLocalizedTitles;

    private GaiaDeviceCapability(Parcel parcel) {
        String c = juo.c(parcel);
        String c2 = juo.c(parcel);
        String c3 = juo.c(parcel);
        GaiaDeviceRedirectUris gaiaDeviceRedirectUris = (GaiaDeviceRedirectUris) juo.b(parcel, GaiaDeviceRedirectUris.CREATOR);
        String str = "";
        if (c == null) {
            c = str;
        }
        this.mId = c;
        if (c2 == null) {
            c2 = str;
        }
        this.mDefaultTitle = c2;
        if (c3 == null) {
            c3 = str;
        }
        this.mIconUrl = c3;
        if (gaiaDeviceRedirectUris == null) {
            gaiaDeviceRedirectUris = new GaiaDeviceRedirectUris(new GaiaDeviceRedirectUrisAndroid(str, str, str, str));
        }
        this.mGaiaDeviceRedirectUris = gaiaDeviceRedirectUris;
        this.mLocalizedTitles = juo.a(parcel, jxu.c());
    }

    @JsonCreator
    public GaiaDeviceCapability(@JsonProperty("id") String str, @JsonProperty("defaultTitle") String str2, @JsonProperty("iconUrl") String str3, @JsonProperty("redirectUris") GaiaDeviceRedirectUris gaiaDeviceRedirectUris, @JsonProperty("localizedTitle") Map<String, String> map) {
        this.mId = str;
        this.mDefaultTitle = str2;
        this.mIconUrl = str3;
        this.mGaiaDeviceRedirectUris = gaiaDeviceRedirectUris;
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.mLocalizedTitles = map;
    }

    public int describeContents() {
        return 0;
    }

    @JsonGetter("defaultTitle")
    public String getDefaultTitle() {
        return this.mDefaultTitle;
    }

    @JsonGetter("redirectUris")
    public GaiaDeviceRedirectUris getGaiaDeviceRedirectUris() {
        return this.mGaiaDeviceRedirectUris;
    }

    @JsonGetter("iconUrl")
    public String getIconUrl() {
        return this.mIconUrl;
    }

    @JsonGetter("id")
    public String getId() {
        return this.mId;
    }

    @JsonGetter("localizedTitle")
    public Map<String, String> getLocalizedTitles() {
        return this.mLocalizedTitles;
    }

    public void writeToParcel(Parcel parcel, int i) {
        juo.a(parcel, this.mId);
        juo.a(parcel, this.mDefaultTitle);
        juo.a(parcel, this.mIconUrl);
        juo.a(parcel, (Parcelable) this.mGaiaDeviceRedirectUris, i);
        juo.a(parcel, this.mLocalizedTitles);
    }
}
