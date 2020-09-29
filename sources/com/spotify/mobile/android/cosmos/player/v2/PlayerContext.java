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

    protected PlayerContext(Parcel parcel) {
        this.mUri = parcel.readString();
        this.mUrl = parcel.readString();
        this.mMetadata = juo.a(parcel, jxu.c());
        this.mRestrictions = (PlayerRestrictions) juo.b(parcel, PlayerRestrictions.CREATOR);
        this.mPages = (PlayerContextPage[]) parcel.createTypedArray(PlayerContextPage.CREATOR);
        this.mFallbackPages = (PlayerContextPage[]) parcel.createTypedArray(PlayerContextPage.CREATOR);
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

    public static PlayerContext create(String str, String str2) {
        return create(str, str2, Collections.EMPTY_MAP);
    }

    public static PlayerContext create(String str, String str2, Map<String, String> map) {
        boolean z = true;
        PlayerContext playerContext = r2;
        String str3 = str;
        Map<String, String> map2 = map;
        PlayerContext playerContext2 = new PlayerContext(str, map, null, new PlayerContextPage[]{new PlayerContextPage(str2, null, null, null)}, null, null);
        return playerContext2;
    }

    public static PlayerContext create(String str, PlayerTrack[] playerTrackArr) {
        return create(str, playerTrackArr, Collections.EMPTY_MAP);
    }

    public static PlayerContext create(String str, PlayerTrack[] playerTrackArr, PlayerRestrictions playerRestrictions, Map<String, String> map) {
        boolean z = false | false;
        String str2 = str;
        PlayerRestrictions playerRestrictions2 = playerRestrictions;
        PlayerContext playerContext = new PlayerContext(str, map, playerRestrictions, new PlayerContextPage[]{new PlayerContextPage(null, null, playerTrackArr, null)}, null, null);
        return playerContext;
    }

    public static PlayerContext create(String str, PlayerTrack[] playerTrackArr, Map<String, String> map) {
        String str2 = str;
        PlayerContext playerContext = new PlayerContext(str, map, null, new PlayerContextPage[]{new PlayerContextPage(null, null, playerTrackArr, null)}, null, null);
        return playerContext;
    }

    public static PlayerContext createFromContextUrl(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        PlayerContext playerContext = new PlayerContext(str, Collections.EMPTY_MAP, null, null, null, str2);
        return playerContext;
    }

    public static PlayerContext createFromContextUrl(String str, String str2, Map<String, String> map) {
        Map<String, String> map2 = map;
        String str3 = str2;
        PlayerContext playerContext = new PlayerContext(str, map, null, null, null, str2);
        return playerContext;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r5.mUrl != null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            if (r4 != r5) goto L_0x0005
            r5 = 5
            r5 = 1
            return r5
        L_0x0005:
            r3 = 5
            boolean r0 = r5 instanceof com.spotify.mobile.android.cosmos.player.v2.PlayerContext
            r1 = 5
            r1 = 0
            if (r0 != 0) goto L_0x000e
            r3 = 2
            return r1
        L_0x000e:
            com.spotify.mobile.android.cosmos.player.v2.PlayerContext r5 = (com.spotify.mobile.android.cosmos.player.v2.PlayerContext) r5
            java.lang.String r0 = r4.mUri
            r3 = 3
            java.lang.String r2 = r5.mUri
            boolean r0 = r0.equals(r2)
            r3 = 6
            if (r0 != 0) goto L_0x001d
            return r1
        L_0x001d:
            java.lang.String r0 = r4.mUrl
            r3 = 2
            if (r0 == 0) goto L_0x002e
            java.lang.String r2 = r5.mUrl
            r3 = 0
            boolean r0 = r0.equals(r2)
            r3 = 5
            if (r0 != 0) goto L_0x0033
            r3 = 3
            goto L_0x0032
        L_0x002e:
            java.lang.String r0 = r5.mUrl
            if (r0 == 0) goto L_0x0033
        L_0x0032:
            return r1
        L_0x0033:
            com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> r0 = r4.mMetadata
            com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> r2 = r5.mMetadata
            boolean r0 = r0.equals(r2)
            r3 = 7
            if (r0 != 0) goto L_0x0040
            r3 = 7
            return r1
        L_0x0040:
            r3 = 2
            com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions r0 = r4.mRestrictions
            r3 = 2
            if (r0 == 0) goto L_0x0051
            r3 = 5
            com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions r2 = r5.mRestrictions
            boolean r0 = r0.equals(r2)
            r3 = 6
            if (r0 != 0) goto L_0x0058
            goto L_0x0057
        L_0x0051:
            r3 = 5
            com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions r0 = r5.mRestrictions
            r3 = 4
            if (r0 == 0) goto L_0x0058
        L_0x0057:
            return r1
        L_0x0058:
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage[] r0 = r4.mPages
            r3 = 2
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage[] r2 = r5.mPages
            r3 = 7
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 != 0) goto L_0x0065
            return r1
        L_0x0065:
            r3 = 4
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage[] r0 = r4.mFallbackPages
            r3 = 2
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage[] r5 = r5.mFallbackPages
            r3 = 6
            boolean r5 = java.util.Arrays.equals(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerContext.equals(java.lang.Object):boolean");
    }

    public PlayerContextPage[] fallbackPages() {
        return this.mFallbackPages;
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

    public Map<String, String> metadata() {
        return this.mMetadata;
    }

    public PlayerContextPage[] pages() {
        return this.mPages;
    }

    public PlayerRestrictions restrictions() {
        return this.mRestrictions;
    }

    public String uri() {
        return this.mUri;
    }

    public String url() {
        return this.mUrl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUri);
        parcel.writeString(this.mUrl);
        juo.a(parcel, (Map<String, String>) this.mMetadata);
        juo.a(parcel, (Parcelable) this.mRestrictions, i);
        parcel.writeTypedArray(this.mPages, i);
        parcel.writeTypedArray(this.mFallbackPages, i);
    }
}
