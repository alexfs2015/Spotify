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

    protected PlayerQueue(Parcel parcel) {
        this.mRevision = parcel.readString();
        this.mTrack = (PlayerTrack) juo.b(parcel, PlayerTrack.CREATOR);
        this.mNextTracks = (PlayerTrack[]) parcel.createTypedArray(PlayerTrack.CREATOR);
        this.mPrevTracks = (PlayerTrack[]) parcel.createTypedArray(PlayerTrack.CREATOR);
    }

    @JsonCreator
    public PlayerQueue(@JsonProperty("revision") String str, @JsonProperty("track") PlayerTrack playerTrack, @JsonProperty("next_tracks") PlayerTrack[] playerTrackArr, @JsonProperty("prev_tracks") PlayerTrack[] playerTrackArr2) {
        this.mRevision = str;
        this.mTrack = playerTrack;
        this.mNextTracks = playerTrackArr;
        this.mPrevTracks = playerTrackArr2;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r5.mTrack != null) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 3
            if (r4 != r5) goto L_0x0006
            r5 = 0
            r5 = 1
            return r5
        L_0x0006:
            boolean r0 = r5 instanceof com.spotify.mobile.android.cosmos.player.v2.PlayerQueue
            r3 = 7
            r1 = 0
            r3 = 5
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            r3 = 7
            com.spotify.mobile.android.cosmos.player.v2.PlayerQueue r5 = (com.spotify.mobile.android.cosmos.player.v2.PlayerQueue) r5
            java.lang.String r0 = r4.mRevision
            r3 = 5
            java.lang.String r2 = r5.mRevision
            boolean r0 = r0.equals(r2)
            r3 = 4
            if (r0 != 0) goto L_0x001e
            return r1
        L_0x001e:
            r3 = 6
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r0 = r4.mTrack
            if (r0 == 0) goto L_0x002f
            r3 = 2
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r2 = r5.mTrack
            boolean r0 = r0.equals(r2)
            r3 = 4
            if (r0 != 0) goto L_0x0037
            r3 = 3
            goto L_0x0035
        L_0x002f:
            r3 = 0
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r0 = r5.mTrack
            r3 = 6
            if (r0 == 0) goto L_0x0037
        L_0x0035:
            r3 = 3
            return r1
        L_0x0037:
            r3 = 3
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r0 = r4.mNextTracks
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r2 = r5.mNextTracks
            boolean r0 = java.util.Arrays.equals(r0, r2)
            r3 = 7
            if (r0 != 0) goto L_0x0045
            r3 = 0
            return r1
        L_0x0045:
            r3 = 4
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r0 = r4.mPrevTracks
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r5 = r5.mPrevTracks
            r3 = 4
            boolean r5 = java.util.Arrays.equals(r0, r5)
            r3 = 6
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerQueue.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((Arrays.hashCode(new Object[]{this.mRevision, this.mTrack}) * 31) + Arrays.hashCode(this.mNextTracks)) * 31) + Arrays.hashCode(this.mPrevTracks);
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

    public PlayerTrack track() {
        return this.mTrack;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mRevision);
        juo.a(parcel, (Parcelable) this.mTrack, 0);
        parcel.writeTypedArray(this.mNextTracks, 0);
        parcel.writeTypedArray(this.mPrevTracks, 0);
    }
}
