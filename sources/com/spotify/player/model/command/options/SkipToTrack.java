package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class SkipToTrack {
    public static final SkipToTrack EMPTY = builder().build();

    public static abstract class Builder {
        public abstract SkipToTrack build();

        @JsonProperty("page_index")
        public abstract Builder pageIndex(Long l);

        @JsonProperty("page_url")
        public abstract Builder pageUrl(String str);

        @JsonProperty("track_index")
        public abstract Builder trackIndex(Long l);

        @JsonProperty("track_uid")
        public abstract Builder trackUid(String str);

        @JsonProperty("track_uri")
        public abstract Builder trackUri(String str);

        @JsonCreator
        public static Builder builder() {
            return SkipToTrack.builder();
        }
    }

    @JsonProperty("page_index")
    public abstract Optional<Long> pageIndex();

    @JsonProperty("page_url")
    public abstract Optional<String> pageUrl();

    public abstract Builder toBuilder();

    @JsonProperty("track_index")
    public abstract Optional<Long> trackIndex();

    @JsonProperty("track_uid")
    public abstract Optional<String> trackUid();

    @JsonProperty("track_uri")
    public abstract Optional<String> trackUri();

    public static Builder builder() {
        return new Builder();
    }
}
