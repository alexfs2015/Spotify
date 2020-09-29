package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@JsonDeserialize(builder = Builder.class)
public abstract class ContextTrack {
    public static final ContextTrack EMPTY = builder().build();
    private static List<String> delimiters = Arrays.asList(new String[]{"spotify:meta:delimiter", "spotify:delimiter"});

    public static abstract class Builder {
        public abstract ContextTrack build();

        @JsonProperty("metadata")
        public abstract Builder metadata(Map<String, String> map);

        @JsonProperty("provider")
        public abstract Builder provider(String str);

        @JsonProperty("uid")
        public abstract Builder uid(String str);

        @JsonProperty("uri")
        public abstract Builder uri(String str);

        @JsonCreator
        public static Builder builder() {
            return ContextTrack.builder();
        }
    }

    public static final class Metadata {
        public static final String KEY_ADVERTISER = "advertiser";
        public static final String KEY_AD_ID = "ad_id";
        public static final String KEY_AD_TYPE = "ad_type";
        public static final String KEY_ALBUM_ARTIST_NAME = "album_artist_name";
        public static final String KEY_ALBUM_DISC_COUNT = "album_disc_count";
        public static final String KEY_ALBUM_DISC_NUMBER = "album_disc_number";
        public static final String KEY_ALBUM_TITLE = "album_title";
        public static final String KEY_ALBUM_TRACK_COUNT = "album_track_count";
        public static final String KEY_ALBUM_TRACK_NUMBER = "album_track_number";
        public static final String KEY_ALBUM_URI = "album_uri";
        public static final String KEY_ARTIST_NAME = "artist_name";
        public static final String KEY_ARTIST_URI = "artist_uri";
        public static final String KEY_AVAILABILITY_RESTRICTIONS = "availability_restrictions";
        public static final String KEY_CLICK_URL = "click_url";
        public static final String KEY_COLLECTION_CAN_ADD = "collection.can_add";
        public static final String KEY_COLLECTION_CAN_BAN = "collection.can_ban";
        public static final String KEY_COLLECTION_IN_COLLECTION = "collection.in_collection";
        public static final String KEY_COLLECTION_IS_BANNED = "collection.is_banned";
        public static final String KEY_CONTEXT_DESCRIPTION = "context_description";
        public static final String KEY_CONTEXT_URI = "context_uri";
        public static final String KEY_DURATION = "duration";
        public static final String KEY_EXTERNALLY_INJECTED = "mft.externally_injected";
        public static final String KEY_HIDDEN = "hidden";
        public static final String KEY_IMAGE_LARGE_URL = "image_large_url";
        public static final String KEY_IMAGE_SMALL_URL = "image_small_url";
        public static final String KEY_IMAGE_URL = "image_url";
        public static final String KEY_IMAGE_XLARGE_URL = "image_xlarge_url";
        public static final String KEY_IS_ADVERTISEMENT = "is_advertisement";
        public static final String KEY_IS_AD_SKIPPABLE = "ad.is_skippable";
        public static final String KEY_IS_EXPLICIT = "is_explicit";
        public static final String KEY_IS_INTERRUPTION = "mod.is_interruption";
        public static final String KEY_IS_LOCAL = "is_local";
        public static final String KEY_IS_QUEUED = "is_queued";
        public static final String KEY_ITERATION = "iteration";
        public static final String KEY_LOCAL_FILE_PATH = "local_file_path";
        public static final String KEY_LOCAL_FILE_SIZE = "local_file_size";
        public static final String KEY_MEDIA_EXTERNAL_URL = "media.external_url";
        public static final String KEY_MEDIA_MANIFEST_ID = "media.manifest_id";
        public static final String KEY_MEDIA_START_POSITION = "media.start_position";
        public static final String KEY_MEDIA_TYPE = "media.type";
        public static final String KEY_POPULARITY = "popularity";
        public static final String KEY_SHUFFLE_AVERAGE_POSITION = "shuffle.average_position";
        public static final String KEY_TITLE = "title";
    }

    @JsonInclude(Include.NON_EMPTY)
    @JsonProperty("metadata")
    public abstract ImmutableMap<String, String> metadata();

    @JsonInclude(Include.NON_EMPTY)
    @JsonProperty("provider")
    public abstract String provider();

    public abstract Builder toBuilder();

    @JsonInclude(Include.NON_EMPTY)
    @JsonProperty("uid")
    public abstract String uid();

    @JsonProperty("uri")
    public abstract String uri();

    public static Builder builder() {
        String str = "";
        return new Builder().uri(str).uid(str).metadata(Collections.emptyMap()).provider(str);
    }

    @JsonIgnore
    public boolean isDelimiter() {
        return delimiters.contains(uri());
    }
}
