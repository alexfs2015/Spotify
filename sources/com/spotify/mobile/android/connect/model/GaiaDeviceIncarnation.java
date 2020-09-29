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
public class GaiaDeviceIncarnation implements Parcelable, JacksonModel {
    public static final Creator<GaiaDeviceIncarnation> CREATOR = new Creator<GaiaDeviceIncarnation>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GaiaDeviceIncarnation(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GaiaDeviceIncarnation[i];
        }
    };
    private final String mIdentifier;
    private final boolean mIsPreferred;
    private final Tech mTech;

    private GaiaDeviceIncarnation(Parcel parcel) {
        this.mIdentifier = parcel.readString();
        this.mTech = (Tech) juo.a(parcel, Tech.class);
        this.mIsPreferred = juo.a(parcel);
    }

    @JsonCreator
    public GaiaDeviceIncarnation(@JsonProperty("class") Tech tech, @JsonProperty("identifier") String str, @JsonProperty("preferred") boolean z) {
        this.mTech = tech;
        this.mIdentifier = str;
        this.mIsPreferred = z;
    }

    public int describeContents() {
        return 0;
    }

    @JsonGetter("identifier")
    public String getIdentifier() {
        return this.mIdentifier;
    }

    @JsonGetter("class")
    public Tech getTech() {
        return this.mTech;
    }

    @JsonGetter("preferred")
    public boolean isPreferred() {
        return this.mIsPreferred;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GaiaDeviceIncarnation{mIdentifier='");
        sb.append(this.mIdentifier);
        sb.append('\'');
        String str = "m=shecT ";
        sb.append(", mTech=");
        sb.append(this.mTech);
        String str2 = "r, medreIrPf=sm";
        sb.append(", mIsPreferred=");
        sb.append(this.mIsPreferred);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mIdentifier);
        juo.a(parcel, this.mTech);
        juo.a(parcel, this.mIsPreferred);
    }
}
