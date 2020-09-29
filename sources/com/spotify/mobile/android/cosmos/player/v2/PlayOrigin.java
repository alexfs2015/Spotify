package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayOrigin implements Parcelable, JacksonModel {
    public static final Creator<PlayOrigin> CREATOR = new Creator<PlayOrigin>() {
        public final PlayOrigin createFromParcel(Parcel parcel) {
            return new PlayOrigin(parcel);
        }

        public final PlayOrigin[] newArray(int i) {
            return new PlayOrigin[i];
        }
    };
    @JsonProperty("device_identifier")
    private final String mDeviceIdentifier;
    @JsonProperty("external_referrer")
    private final String mExternalReferrer;
    @JsonProperty("feature_classes")
    private final Set<String> mFeatureClasses;
    @JsonProperty("feature_identifier")
    private final String mFeatureIdentifier;
    @JsonProperty("feature_version")
    private final String mFeatureVersion;
    @JsonProperty("referrer_identifier")
    private final String mReferrerIdentifier;
    @JsonProperty("view_uri")
    private final String mViewUri;

    public int describeContents() {
        return 0;
    }

    public PlayOrigin(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, null, null);
    }

    public PlayOrigin(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4, str5, str6, null);
    }

    @JsonCreator
    public PlayOrigin(@JsonProperty("feature_identifier") String str, @JsonProperty("feature_version") String str2, @JsonProperty("view_uri") String str3, @JsonProperty("external_referrer") String str4, @JsonProperty("referrer_identifier") String str5, @JsonProperty("device_identifier") String str6, @JsonProperty("feature_classes") Set<String> set) {
        this.mFeatureIdentifier = str;
        this.mFeatureVersion = str2;
        this.mViewUri = str3;
        this.mExternalReferrer = str4;
        this.mReferrerIdentifier = str5;
        this.mDeviceIdentifier = str6;
        this.mFeatureClasses = set;
    }

    public String featureIdentifier() {
        return this.mFeatureIdentifier;
    }

    public String featureVersion() {
        return this.mFeatureVersion;
    }

    public String viewUri() {
        return this.mViewUri;
    }

    public String externalReferrer() {
        return this.mExternalReferrer;
    }

    public String referrerIdentifier() {
        return this.mReferrerIdentifier;
    }

    public String deviceIdentifier() {
        return this.mDeviceIdentifier;
    }

    public Set<String> featureClasses() {
        return this.mFeatureClasses;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayOrigin)) {
            return false;
        }
        PlayOrigin playOrigin = (PlayOrigin) obj;
        return faw.a(this.mFeatureIdentifier, playOrigin.mFeatureIdentifier) && faw.a(this.mFeatureVersion, playOrigin.mFeatureVersion) && faw.a(this.mViewUri, playOrigin.mViewUri) && faw.a(this.mExternalReferrer, playOrigin.mExternalReferrer) && faw.a(this.mReferrerIdentifier, playOrigin.mReferrerIdentifier) && faw.a(this.mDeviceIdentifier, playOrigin.mDeviceIdentifier) && faw.a(this.mFeatureClasses, playOrigin.mFeatureClasses);
    }

    public int hashCode() {
        int hashCode = ((this.mFeatureIdentifier.hashCode() * 31) + this.mFeatureVersion.hashCode()) * 31;
        String str = this.mViewUri;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.mExternalReferrer;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mReferrerIdentifier;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.mDeviceIdentifier;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Set<String> set = this.mFeatureClasses;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode5 + i;
    }

    protected PlayOrigin(Parcel parcel) {
        this.mFeatureIdentifier = parcel.readString();
        this.mFeatureVersion = parcel.readString();
        this.mViewUri = parcel.readString();
        this.mExternalReferrer = parcel.readString();
        this.mReferrerIdentifier = parcel.readString();
        this.mDeviceIdentifier = parcel.readString();
        this.mFeatureClasses = jse.a(parcel) ? jse.b(parcel) : null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mFeatureIdentifier);
        parcel.writeString(this.mFeatureVersion);
        parcel.writeString(this.mViewUri);
        parcel.writeString(this.mExternalReferrer);
        parcel.writeString(this.mReferrerIdentifier);
        parcel.writeString(this.mDeviceIdentifier);
        jse.a(parcel, this.mFeatureClasses != null);
        Set<String> set = this.mFeatureClasses;
        if (set != null) {
            jse.a(parcel, set);
        }
    }
}
