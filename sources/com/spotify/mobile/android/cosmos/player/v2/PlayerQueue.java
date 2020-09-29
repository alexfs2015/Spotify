package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerQueue implements Parcelable, JacksonModel {
    public static final Creator<PlayerQueue> CREATOR = new Creator<PlayerQueue>() {
        public final PlayerQueue createFromParcel(Parcel parcel) {
            return new PlayerQueue(parcel);
        }

        public final PlayerQueue[] newArray(int i) {
            return new PlayerQueue[i];
        }
    };
    @JsonProperty("next_tracks")
    private final PlayerTrack[] mNextTracks;
    @JsonProperty("prev_tracks")
    private final PlayerTrack[] mPrevTracks;
    @JsonProperty("revision")
    private final String mRevision;
    @JsonProperty("track")
    private final PlayerTrack mTrack;

    public int describeContents() {
        return 0;
    }

    public PlayerTrack track() {
        return this.mTrack;
    }

    public PlayerTrack[] nextTracks() {
        return this.mNextTracks;
    }

    public PlayerTrack[] prevTracks() {
        return this.mPrevTracks;
    }

    public String revision() {
        return this.mRevision;
    }

    @JsonCreator
    public PlayerQueue(@JsonProperty("revision") String str, @JsonProperty("track") PlayerTrack playerTrack, @JsonProperty("next_tracks") PlayerTrack[] playerTrackArr, @JsonProperty("prev_tracks") PlayerTrack[] playerTrackArr2) {
        this.mRevision = str;
        this.mTrack = playerTrack;
        this.mNextTracks = playerTrackArr;
        this.mPrevTracks = playerTrackArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerQueue)) {
            return false;
        }
        PlayerQueue playerQueue = (PlayerQueue) obj;
        if (!this.mRevision.equals(playerQueue.mRevision)) {
            return false;
        }
        PlayerTrack playerTrack = this.mTrack;
        if (playerTrack == null ? playerQueue.mTrack != null : !playerTrack.equals(playerQueue.mTrack)) {
            return false;
        }
        if (!Arrays.equals(this.mNextTracks, playerQueue.mNextTracks)) {
            return false;
        }
        return Arrays.equals(this.mPrevTracks, playerQueue.mPrevTracks);
    }

    public int hashCode() {
        return (((Arrays.hashCode(new Object[]{this.mRevision, this.mTrack}) * 31) + Arrays.hashCode(this.mNextTracks)) * 31) + Arrays.hashCode(this.mPrevTracks);
    }

    protected PlayerQueue(Parcel parcel) {
        this.mRevision = parcel.readString();
        this.mTrack = (PlayerTrack) jse.b(parcel, PlayerTrack.CREATOR);
        this.mNextTracks = (PlayerTrack[]) parcel.createTypedArray(PlayerTrack.CREATOR);
        this.mPrevTracks = (PlayerTrack[]) parcel.createTypedArray(PlayerTrack.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mRevision);
        jse.a(parcel, (Parcelable) this.mTrack, 0);
        parcel.writeTypedArray(this.mNextTracks, 0);
        parcel.writeTypedArray(this.mPrevTracks, 0);
    }
}
