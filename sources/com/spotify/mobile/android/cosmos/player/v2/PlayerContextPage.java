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

    public int describeContents() {
        return 0;
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

    protected PlayerContextPage(Parcel parcel) {
        this.mMetadata = jse.a(parcel, jvm.c());
        this.mPageUrl = parcel.readString();
        this.mNextPageUrl = parcel.readString();
        this.mTracks = (PlayerTrack[]) parcel.createTypedArray(PlayerTrack.CREATOR);
    }

    public String pageUrl() {
        return this.mPageUrl;
    }

    public String nextPageUrl() {
        return this.mNextPageUrl;
    }

    public PlayerTrack[] tracks() {
        return this.mTracks;
    }

    public Map<String, String> metadata() {
        return this.mMetadata;
    }

    public void writeToParcel(Parcel parcel, int i) {
        jse.a(parcel, (Map<String, String>) this.mMetadata);
        parcel.writeString(this.mPageUrl);
        parcel.writeString(this.mNextPageUrl);
        parcel.writeTypedArray(this.mTracks, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerContextPage)) {
            return false;
        }
        PlayerContextPage playerContextPage = (PlayerContextPage) obj;
        String str = this.mPageUrl;
        if (str == null ? playerContextPage.mPageUrl != null : !str.equals(playerContextPage.mPageUrl)) {
            return false;
        }
        String str2 = this.mNextPageUrl;
        if (str2 == null ? playerContextPage.mNextPageUrl != null : !str2.equals(playerContextPage.mNextPageUrl)) {
            return false;
        }
        if (!Arrays.equals(this.mTracks, playerContextPage.mTracks)) {
            return false;
        }
        return this.mMetadata.equals(playerContextPage.mMetadata);
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
}
