package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

@JsonDeserialize(using = PlayerContext_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerContext implements Parcelable, JacksonModel {
    public static final Creator<PlayerContext> CREATOR = new Creator<PlayerContext>() {
        public final PlayerContext createFromParcel(Parcel parcel) {
            return new PlayerContext(parcel);
        }

        public final PlayerContext[] newArray(int i) {
            return new PlayerContext[i];
        }
    };
    @JsonProperty("fallback_pages")
    private final PlayerContextPage[] mFallbackPages;
    @JsonProperty("metadata")
    private final ImmutableMap<String, String> mMetadata;
    @JsonProperty("pages")
    private final PlayerContextPage[] mPages;
    @JsonProperty("restrictions")
    private final PlayerRestrictions mRestrictions;
    @JsonProperty("uri")
    private final String mUri;
    @JsonProperty("url")
    private final String mUrl;

    public static final class MediaType {
        public static final String AUDIO = "audio";
        public static final String VIDEO = "video";

        private MediaType() {
        }
    }

    public static final class Metadata {
        public static final String CONTEXT_DESCRIPTION = "context_description";
        public static final String CONTEXT_LONG_DESCRIPTION = "context_long_description";
        public static final String CONTEXT_OWNER = "context_owner";
        public static final String FORMAT_LIST_TYPE = "format_list_type";
        public static final String IMAGE_LARGE_URL = "image_large_url";
        public static final String IMAGE_URL = "image_url";
        public static final String INTERRUPTION_MANIFEST_IDS = "mod.interruption_manifest_ids";
        public static final String IS_DATA_SAVER_CONTEXT = "is_data_saver_context";
        public static final String IS_LOADING = "is_loading";
        public static final String KEY_SHUFFLE_ALGORITHM = "shuffle.algorithm";
        public static final String KEY_TRACK_COUNT = "track_count";
        public static final String LICENSE = "license";
        public static final String LICENSE_ON_DEMAND_WHEN_FREE = "mobile_on_demand";
        public static final String MEDIA_TYPE = "media.type";
        public static final String SHUFFLE_ALGORITHM_WEIGHTED = "weighted";
        public static final String SORTING_CRITERIA = "sorting.criteria";

        private Metadata() {
        }
    }

    public int describeContents() {
        return 0;
    }

    protected PlayerContext(Parcel parcel) {
        this.mUri = parcel.readString();
        this.mUrl = parcel.readString();
        this.mMetadata = jse.a(parcel, jvm.c());
        this.mRestrictions = (PlayerRestrictions) jse.b(parcel, PlayerRestrictions.CREATOR);
        this.mPages = (PlayerContextPage[]) parcel.createTypedArray(PlayerContextPage.CREATOR);
        this.mFallbackPages = (PlayerContextPage[]) parcel.createTypedArray(PlayerContextPage.CREATOR);
    }

    public static PlayerContext create(String str, PlayerTrack[] playerTrackArr) {
        return create(str, playerTrackArr, Collections.EMPTY_MAP);
    }

    public static PlayerContext createFromContextUrl(String str, String str2) {
        PlayerContext playerContext = new PlayerContext(str, Collections.EMPTY_MAP, null, null, null, str2);
        return playerContext;
    }

    public static PlayerContext create(String str, PlayerTrack[] playerTrackArr, Map<String, String> map) {
        PlayerContext playerContext = new PlayerContext(str, map, null, new PlayerContextPage[]{new PlayerContextPage(null, null, playerTrackArr, null)}, null, null);
        return playerContext;
    }

    public static PlayerContext createFromContextUrl(String str, String str2, Map<String, String> map) {
        PlayerContext playerContext = new PlayerContext(str, map, null, null, null, str2);
        return playerContext;
    }

    public static PlayerContext create(String str, PlayerTrack[] playerTrackArr, PlayerRestrictions playerRestrictions, Map<String, String> map) {
        PlayerContext playerContext = new PlayerContext(str, map, playerRestrictions, new PlayerContextPage[]{new PlayerContextPage(null, null, playerTrackArr, null)}, null, null);
        return playerContext;
    }

    public static PlayerContext create(String str, String str2) {
        return create(str, str2, Collections.EMPTY_MAP);
    }

    public static PlayerContext create(String str, String str2, Map<String, String> map) {
        PlayerContext playerContext = new PlayerContext(str, map, null, new PlayerContextPage[]{new PlayerContextPage(str2, null, null, null)}, null, null);
        return playerContext;
    }

    @JsonCreator
    public PlayerContext(@JsonProperty("uri") String str, @JsonProperty("metadata") Map<String, String> map, @JsonProperty("restrictions") PlayerRestrictions playerRestrictions, @JsonProperty("pages") PlayerContextPage[] playerContextPageArr, @JsonProperty("fallback_pages") PlayerContextPage[] playerContextPageArr2, @JsonProperty("url") String str2) {
        this.mUri = str;
        this.mUrl = str2;
        if (map == null || map.isEmpty()) {
            this.mMetadata = ImmutableMap.f();
        } else {
            this.mMetadata = ImmutableMap.a(map);
        }
        this.mRestrictions = playerRestrictions;
        this.mPages = playerContextPageArr;
        this.mFallbackPages = playerContextPageArr2;
    }

    public String uri() {
        return this.mUri;
    }

    public String url() {
        return this.mUrl;
    }

    public Map<String, String> metadata() {
        return this.mMetadata;
    }

    public PlayerRestrictions restrictions() {
        return this.mRestrictions;
    }

    public PlayerContextPage[] pages() {
        return this.mPages;
    }

    public PlayerContextPage[] fallbackPages() {
        return this.mFallbackPages;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUri);
        parcel.writeString(this.mUrl);
        jse.a(parcel, (Map<String, String>) this.mMetadata);
        jse.a(parcel, (Parcelable) this.mRestrictions, i);
        parcel.writeTypedArray(this.mPages, i);
        parcel.writeTypedArray(this.mFallbackPages, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerContext)) {
            return false;
        }
        PlayerContext playerContext = (PlayerContext) obj;
        if (!this.mUri.equals(playerContext.mUri)) {
            return false;
        }
        String str = this.mUrl;
        if (str == null ? playerContext.mUrl != null : !str.equals(playerContext.mUrl)) {
            return false;
        }
        if (!this.mMetadata.equals(playerContext.mMetadata)) {
            return false;
        }
        PlayerRestrictions playerRestrictions = this.mRestrictions;
        if (playerRestrictions == null ? playerContext.mRestrictions != null : !playerRestrictions.equals(playerContext.mRestrictions)) {
            return false;
        }
        if (!Arrays.equals(this.mPages, playerContext.mPages)) {
            return false;
        }
        return Arrays.equals(this.mFallbackPages, playerContext.mFallbackPages);
    }

    public int hashCode() {
        int hashCode = this.mUri.hashCode() * 31;
        String str = this.mUrl;
        int i = 0;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.mMetadata.hashCode()) * 31;
        PlayerRestrictions playerRestrictions = this.mRestrictions;
        if (playerRestrictions != null) {
            i = playerRestrictions.hashCode();
        }
        return ((((hashCode2 + i) * 31) + Arrays.hashCode(this.mPages)) * 31) + Arrays.hashCode(this.mFallbackPages);
    }
}
