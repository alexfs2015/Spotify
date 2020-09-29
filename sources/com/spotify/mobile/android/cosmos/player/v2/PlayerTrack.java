package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

@Deprecated
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerTrack implements Parcelable, JacksonModel {
    public static final Creator<PlayerTrack> CREATOR = new Creator<PlayerTrack>() {
        public final PlayerTrack createFromParcel(Parcel parcel) {
            return new PlayerTrack(parcel);
        }

        public final PlayerTrack[] newArray(int i) {
            return new PlayerTrack[i];
        }
    };
    public static final String TRACK_THUMB_STATE_DOWN = "down";
    public static final String TRACK_THUMB_STATE_UP = "up";
    @JsonProperty("metadata")
    private final ImmutableMap<String, String> mMetadata;
    @JsonProperty("provider")
    private final String mProvider;
    @JsonProperty("uid")
    private final String mUid;
    @JsonProperty("uri")
    private final String mUri;

    public static final class MediaType {
        public static final String AUDIO = "audio";
        public static final String VIDEO = "video";

        private MediaType() {
        }
    }

    public static final class Metadata {
        public static final String ADDED_AT = "added_at";
        public static final String ADVERTISER = "advertiser";
        public static final String AD_ID = "ad_id";
        public static final String ALBUM_DISK_COUNT = "album_disc_count";
        public static final String ALBUM_DISK_NUMBER = "album_disc_number";
        public static final String ALBUM_TITLE = "album_title";
        public static final String ALBUM_TRACK_COUNT = "album_title";
        public static final String ALBUM_TRACK_NUMBER = "album_track_number";
        public static final String ALBUM_URI = "album_uri";
        public static final String ARTIST_NAME = "artist_name";
        public static final String ARTIST_URI = "artist_uri";
        public static final String AUDIO_FADE_IN_CURVES = "audio.fade_in_curves";
        public static final String AUDIO_FADE_IN_DURATION = "audio.fade_in_duration";
        public static final String AUDIO_FADE_IN_START_TIME = "audio.fade_in_start_time";
        public static final String AUDIO_FADE_OUT_CURVES = "audio.fade_out_curves";
        public static final String AUDIO_FADE_OUT_DURATION = "audio.fade_out_duration";
        public static final String AUDIO_FADE_OUT_START_TIME = "audio.fade_out_start_time";
        public static final String AUDIO_FADE_OVERLAP = "audio.fade_overlap";
        public static final String AVAILABILITY_RESTRICTIONS = "availability_restrictions";
        public static final String CLICK_URL = "click_url";
        public static final String COLLECTION_CAN_ADD = "collection.can_add";
        public static final String COLLECTION_CAN_BAN = "collection.can_ban";
        public static final String COLLECTION_IN_COLLECTION = "collection.in_collection";
        public static final String COLLECTION_IS_BANNED = "collection.is_banned";
        public static final String CONTEXT_URI = "context_uri";
        public static final String DISLIKE_FEEDBACK_AVAILABLE = "dislike-feedback-available";
        public static final String DISLIKE_FEEDBACK_ENABLED = "dislike-feedback-enabled";
        public static final String DISLIKE_FEEDBACK_SELECTED = "dislike-feedback-selected";
        public static final String DURATION = "duration";
        public static final String EXTERNAL_URL = "media.external_url";
        public static final String HAS_LYRICS = "has_lyrics";
        public static final String IMAGE_LARGE_URL = "image_large_url";
        public static final String IMAGE_SMALL_URL = "image_small_url";
        public static final String IMAGE_URL = "image_url";
        public static final String IMAGE_XLARGE_URL = "image_xlarge_url";
        public static final String IS_ACTIVE_PLAY_INTERRUPTION = "mod.is_active_play_interruption";
        public static final String IS_ADVERTISEMENT = "is_advertisement";
        public static final String IS_AD_SKIPPABLE = "ad.is_skippable";
        public static final String IS_BACKGROUNDABLE = "is_backgroundable";
        public static final String IS_DATA_SAVER_TRACK = "is_data_saver_track";
        public static final String IS_EXPLICIT = "is_explicit";
        public static final String IS_PODCAST_ADVERTISEMENT = "is_podcast_advertisement";
        public static final String IS_QUEUED = "is_queued";
        public static final String LIKE_FEEDBACK_AVAILABLE = "like-feedback-available";
        public static final String LIKE_FEEDBACK_ENABLED = "like-feedback-enabled";
        public static final String LIKE_FEEDBACK_SELECTED = "like-feedback-selected";
        public static final String MEDIA_LIVE = "media.live";
        public static final String MEDIA_MANIFEST = "media.manifest";
        public static final String MEDIA_MANIFEST_ID = "media.manifest_id";
        public static final String MEDIA_START_POSITION = "media.start_position";
        public static final String MEDIA_TYPE = "media.type";
        public static final String MFT_INJECTION_REASON = "mft.injection_reason";
        public static final String MFT_INJECTION_SOURCE = "mft.injection_source";
        public static final String MFT_UNPLAYABLE_POLICY = "mft.unplayable.policy";
        public static final String SHUFFLE_AVERAGE_POSITION = "shuffle.average_position";
        public static final String TITLE = "title";
        public static final String TRACK_RADIO_THUMB_STATE = "radio.thumb";
        public static final String VIDEO_SECONDS_BEFORE_TRACK_STUCK = "video.seconds_before_track_stuck";

        private Metadata() {
        }
    }

    private PlayerTrack(Parcel parcel) {
        this.mUri = parcel.readString();
        this.mUid = parcel.readString();
        this.mProvider = juo.c(parcel);
        this.mMetadata = juo.a(parcel, jxu.c());
    }

    @JsonCreator
    public PlayerTrack(@JsonProperty("uri") String str, @JsonProperty("uid") String str2, @JsonProperty("album_uri") String str3, @JsonProperty("artist_uri") String str4, @JsonProperty("provider") String str5, @JsonProperty("metadata") Map<String, String> map) {
        this.mUri = (String) fbp.a(str);
        if (str2 == null) {
            str2 = "";
        }
        this.mUid = str2;
        this.mProvider = str5;
        a g = ImmutableMap.g();
        if (map != null && !map.isEmpty()) {
            g.a(map);
        }
        if (str3 != null) {
            String str6 = "album_uri";
            if (map == null || !map.containsKey(str6)) {
                g.b(str6, str3);
            }
        }
        if (str4 != null) {
            String str7 = "artist_uri";
            if (map == null || !map.containsKey(str7)) {
                g.b(str7, str4);
            }
        }
        this.mMetadata = g.b();
    }

    public static PlayerTrack create(String str) {
        String str2 = "";
        String str3 = str;
        String str4 = str;
        PlayerTrack playerTrack = new PlayerTrack(str4, "", null, null, null, Collections.EMPTY_MAP);
        return playerTrack;
    }

    public static PlayerTrack create(String str, String str2, String str3) {
        String str4 = "";
        String str5 = str;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        PlayerTrack playerTrack = new PlayerTrack(str6, "", str2, str3, null, Collections.EMPTY_MAP);
        return playerTrack;
    }

    public static PlayerTrack create(@JsonProperty("uri") String str, @JsonProperty("uid") String str2, @JsonProperty("album_uri") String str3, @JsonProperty("artist_uri") String str4, @JsonProperty("provider") String str5, @JsonProperty("metadata") Map<String, String> map) {
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        PlayerTrack playerTrack = new PlayerTrack(str, str2, str3, str4, str5, map);
        return playerTrack;
    }

    public static PlayerTrack create(@JsonProperty("uri") String str, @JsonProperty("album_uri") String str2, @JsonProperty("artist_uri") String str3, @JsonProperty("provider") String str4, @JsonProperty("metadata") Map<String, String> map) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        Map<String, String> map2 = map;
        PlayerTrack playerTrack = new PlayerTrack(str, "", str2, str3, null, map);
        return playerTrack;
    }

    public static PlayerTrack create(String str, String str2, String str3, Map<String, String> map) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        PlayerTrack playerTrack = new PlayerTrack(str, "", str2, str3, null, map);
        return playerTrack;
    }

    public static PlayerTrack create(String str, Map<String, String> map) {
        String str2 = "";
        boolean z = true & false;
        PlayerTrack playerTrack = r0;
        PlayerTrack playerTrack2 = new PlayerTrack(str, "", null, null, null, map);
        return playerTrack2;
    }

    @JsonIgnore
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerTrack)) {
            return false;
        }
        PlayerTrack playerTrack = (PlayerTrack) obj;
        if (!fbn.a(this.mProvider, playerTrack.mProvider)) {
            return false;
        }
        if (!fbn.a(this.mUri, playerTrack.mUri)) {
            return false;
        }
        if (!fbn.a(this.mUid, playerTrack.mUid)) {
            return false;
        }
        return MapUtils.areMapsEqual(this.mMetadata, playerTrack.mMetadata);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mUri, this.mUid, this.mProvider, Integer.valueOf(MapUtils.hashOfMap(this.mMetadata))});
    }

    public Map<String, String> metadata() {
        return this.mMetadata;
    }

    public String provider() {
        return this.mProvider;
    }

    public String toString() {
        String str = "kysTl=Pa{errarui";
        StringBuilder sb = new StringBuilder("PlayerTrack{uri=");
        sb.append(uri());
        String str2 = "u= mid";
        sb.append(", uid=");
        sb.append(uid());
        sb.append(", metadata=");
        sb.append(metadata());
        String str3 = "}";
        sb.append("}");
        return sb.toString();
    }

    public String uid() {
        return this.mUid;
    }

    public String uri() {
        return this.mUri;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUri);
        parcel.writeString(this.mUid);
        juo.a(parcel, this.mProvider);
        juo.a(parcel, (Map<String, String>) this.mMetadata);
    }
}
