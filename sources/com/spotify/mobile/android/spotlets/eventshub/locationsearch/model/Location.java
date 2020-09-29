package com.spotify.mobile.android.spotlets.eventshub.locationsearch.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonAutoDetect(fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location implements Parcelable, JacksonModel {
    public static final Creator<Location> CREATOR = new Creator<Location>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Location[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Location(parcel);
        }
    };
    public static final Location EMPTY = new Location(-1, "");
    public static final int EMPTY_GEONAMEID = -1;
    @JsonProperty("geonameId")
    public final int mGeonameId;
    @JsonProperty("location")
    public final String mLocationName;

    public int describeContents() {
        return 0;
    }

    public Location(@JsonProperty("geonameId") int i, @JsonProperty("location") String str) {
        this.mGeonameId = i;
        if (str == null) {
            str = "";
        }
        this.mLocationName = str;
    }

    protected Location(Parcel parcel) {
        this.mGeonameId = parcel.readInt();
        this.mLocationName = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        if (this.mGeonameId != location.mGeonameId) {
            return false;
        }
        return this.mLocationName.equals(location.mLocationName);
    }

    public int hashCode() {
        return (this.mGeonameId * 31) + this.mLocationName.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mGeonameId);
        parcel.writeString(this.mLocationName);
    }
}
