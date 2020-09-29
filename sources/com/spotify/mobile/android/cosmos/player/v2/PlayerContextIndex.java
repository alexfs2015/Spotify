package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerContextIndex implements Parcelable, JacksonModel {
    public static final Creator<PlayerContextIndex> CREATOR = new Creator<PlayerContextIndex>() {
        public final PlayerContextIndex createFromParcel(Parcel parcel) {
            return new PlayerContextIndex(parcel);
        }

        public final PlayerContextIndex[] newArray(int i) {
            return new PlayerContextIndex[i];
        }
    };
    @JsonProperty("page")
    private final int mPage;
    @JsonProperty("track")
    private final int mTrack;

    @JsonCreator
    public PlayerContextIndex(@JsonProperty("page") int i, @JsonProperty("track") int i2) {
        this.mPage = i;
        this.mTrack = i2;
    }

    protected PlayerContextIndex(Parcel parcel) {
        this.mPage = parcel.readInt();
        this.mTrack = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerContextIndex)) {
            return false;
        }
        PlayerContextIndex playerContextIndex = (PlayerContextIndex) obj;
        if (this.mPage != playerContextIndex.mPage) {
            return false;
        }
        return this.mTrack == playerContextIndex.mTrack;
    }

    public int hashCode() {
        return (this.mPage * 31) + this.mTrack;
    }

    @JsonProperty("page")
    public int page() {
        return this.mPage;
    }

    @JsonProperty("track")
    public int track() {
        return this.mTrack;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mPage);
        parcel.writeInt(this.mTrack);
    }
}
