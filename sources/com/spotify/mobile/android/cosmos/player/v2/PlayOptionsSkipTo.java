package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayOptionsSkipTo implements Parcelable, JacksonModel {
    public static final Creator<PlayOptionsSkipTo> CREATOR = new Creator<PlayOptionsSkipTo>() {
        public final PlayOptionsSkipTo createFromParcel(Parcel parcel) {
            return new PlayOptionsSkipTo(parcel);
        }

        public final PlayOptionsSkipTo[] newArray(int i) {
            return new PlayOptionsSkipTo[i];
        }
    };
    @JsonProperty("page_index")
    private final int mPageIndex;
    @JsonProperty("page_url")
    private final String mPageUrl;
    @JsonProperty("track_index")
    private final int mTrackIndex;
    @JsonProperty("track_uid")
    private final String mTrackUid;
    @JsonProperty("track_uri")
    private final String mTrackUri;

    protected PlayOptionsSkipTo(Parcel parcel) {
        this.mPageUrl = parcel.readString();
        this.mPageIndex = parcel.readInt();
        this.mTrackUid = parcel.readString();
        this.mTrackUri = parcel.readString();
        this.mTrackIndex = parcel.readInt();
    }

    @JsonCreator
    public PlayOptionsSkipTo(@JsonProperty("page_url") String str, @JsonProperty("page_index") int i, @JsonProperty("track_uid") String str2, @JsonProperty("track_uri") String str3, @JsonProperty("track_index") int i2) {
        this.mPageUrl = str;
        this.mPageIndex = i;
        this.mTrackUid = str2;
        this.mTrackUri = str3;
        this.mTrackIndex = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayOptionsSkipTo)) {
            return false;
        }
        PlayOptionsSkipTo playOptionsSkipTo = (PlayOptionsSkipTo) obj;
        if (!fbn.a(this.mPageUrl, playOptionsSkipTo.mPageUrl)) {
            return false;
        }
        if (this.mPageIndex != playOptionsSkipTo.mPageIndex) {
            return false;
        }
        if (fbn.a(this.mTrackUid, playOptionsSkipTo.mTrackUid) && fbn.a(this.mTrackUri, playOptionsSkipTo.mTrackUri)) {
            return this.mTrackIndex == playOptionsSkipTo.mTrackIndex;
        }
        return false;
    }

    public int hashCode() {
        String str = this.mPageUrl;
        int i = 0;
        boolean z = true & false;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.mPageIndex) * 31;
        String str2 = this.mTrackUid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mTrackUri;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.mTrackIndex;
    }

    @JsonProperty("page_index")
    public int pageIndex() {
        return this.mPageIndex;
    }

    @JsonProperty("page_url")
    public String pageUrl() {
        return this.mPageUrl;
    }

    @JsonProperty("track_index")
    public int trackIndex() {
        return this.mTrackIndex;
    }

    @JsonProperty("track_uid")
    public String trackUid() {
        return this.mTrackUid;
    }

    @JsonProperty("track_uri")
    public String trackUri() {
        return this.mTrackUri;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mPageUrl);
        parcel.writeInt(this.mPageIndex);
        parcel.writeString(this.mTrackUid);
        parcel.writeString(this.mTrackUri);
        parcel.writeInt(this.mTrackIndex);
    }
}
