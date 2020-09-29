package com.spotify.mobile.android.spotlets.eventshub.locationsearch.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@JsonAutoDetect(fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationsHolder implements Parcelable, JacksonModel {
    public static final Creator<LocationsHolder> CREATOR = new Creator<LocationsHolder>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LocationsHolder[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LocationsHolder(parcel);
        }
    };
    public static final LocationsHolder EMPTY = new LocationsHolder(Collections.emptyList());
    @JsonProperty("results")
    private final List<Location> mLocations;

    public int describeContents() {
        return 0;
    }

    protected LocationsHolder(Parcel parcel) {
        this.mLocations = parcel.createTypedArrayList(Location.CREATOR);
    }

    public List<Location> getLocations() {
        return this.mLocations;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationsHolder)) {
            return false;
        }
        return this.mLocations.equals(((LocationsHolder) obj).mLocations);
    }

    public int hashCode() {
        return this.mLocations.hashCode();
    }

    public LocationsHolder(@JsonProperty("results") List<Location> list) {
        if (list == null) {
            list = Collections.unmodifiableList(Arrays.asList(new Location[0]));
        }
        this.mLocations = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mLocations);
    }
}
