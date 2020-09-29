package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerContextPage implements Parcelable, JacksonModel {
    public static final Creator<PlayerContextPage> CREATOR = new Creator<PlayerContextPage>() {
        public final PlayerContextPage createFromParcel(Parcel parcel) {
            return new PlayerContextPage(parcel);
        }

        public final PlayerContextPage[] newArray(int i) {
            return new PlayerContextPage[i];
        }
    };
    @JsonProperty("metadata")
    private final ImmutableMap<String, String> mMetadata;
    @JsonProperty("next_page_url")
    private final String mNextPageUrl;
    @JsonProperty("page_url")
    private final String mPageUrl;
    @JsonProperty("tracks")
    private final PlayerTrack[] mTracks;

    protected PlayerContextPage(Parcel parcel) {
        this.mMetadata = juo.a(parcel, jxu.c());
        this.mPageUrl = parcel.readString();
        this.mNextPageUrl = parcel.readString();
        this.mTracks = (PlayerTrack[]) parcel.createTypedArray(PlayerTrack.CREATOR);
    }

    @JsonCreator
    public PlayerContextPage(@JsonProperty("page_url") String str, @JsonProperty("next_page_url") String str2, @JsonProperty("tracks") PlayerTrack[] playerTrackArr, @JsonProperty("metadata") Map<String, String> map) {
        this.mPageUrl = str;
        this.mNextPageUrl = str2;
        this.mTracks = playerTrackArr;
        if (map == null || map.isEmpty()) {
            this.mMetadata = ImmutableMap.f();
        } else {
            this.mMetadata = ImmutableMap.a(map);
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r5.mPageUrl != null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 5
            if (r4 != r5) goto L_0x0006
            r3 = 6
            r5 = 1
            return r5
        L_0x0006:
            r3 = 5
            boolean r0 = r5 instanceof com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage
            r3 = 2
            r1 = 0
            if (r0 != 0) goto L_0x000f
            r3 = 0
            return r1
        L_0x000f:
            r3 = 6
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage r5 = (com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage) r5
            java.lang.String r0 = r4.mPageUrl
            r3 = 4
            if (r0 == 0) goto L_0x0023
            r3 = 5
            java.lang.String r2 = r5.mPageUrl
            r3 = 4
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0029
            r3 = 6
            goto L_0x0028
        L_0x0023:
            r3 = 0
            java.lang.String r0 = r5.mPageUrl
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            return r1
        L_0x0029:
            r3 = 4
            java.lang.String r0 = r4.mNextPageUrl
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = r5.mNextPageUrl
            r3 = 2
            boolean r0 = r0.equals(r2)
            r3 = 7
            if (r0 != 0) goto L_0x0041
            goto L_0x003f
        L_0x0039:
            r3 = 6
            java.lang.String r0 = r5.mNextPageUrl
            r3 = 7
            if (r0 == 0) goto L_0x0041
        L_0x003f:
            r3 = 4
            return r1
        L_0x0041:
            r3 = 7
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r0 = r4.mTracks
            r3 = 2
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r2 = r5.mTracks
            boolean r0 = java.util.Arrays.equals(r0, r2)
            r3 = 6
            if (r0 != 0) goto L_0x0050
            r3 = 1
            return r1
        L_0x0050:
            r3 = 7
            com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> r0 = r4.mMetadata
            com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> r5 = r5.mMetadata
            r3 = 7
            boolean r5 = r0.equals(r5)
            r3 = 4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.mPageUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mNextPageUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode + i) * 31) + Arrays.hashCode(this.mTracks)) * 31) + this.mMetadata.hashCode();
    }

    public Map<String, String> metadata() {
        return this.mMetadata;
    }

    public String nextPageUrl() {
        return this.mNextPageUrl;
    }

    public String pageUrl() {
        return this.mPageUrl;
    }

    public PlayerTrack[] tracks() {
        return this.mTracks;
    }

    public void writeToParcel(Parcel parcel, int i) {
        juo.a(parcel, (Map<String, String>) this.mMetadata);
        parcel.writeString(this.mPageUrl);
        parcel.writeString(this.mNextPageUrl);
        parcel.writeTypedArray(this.mTracks, i);
    }
}
