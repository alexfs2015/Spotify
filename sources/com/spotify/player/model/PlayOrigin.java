package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class PlayOrigin {
    public static final PlayOrigin EMPTY = builder().build();

    public static abstract class Builder {
        public abstract PlayOrigin build();

        @JsonProperty("device_identifier")
        public abstract Builder deviceIdentifier(String str);

        @JsonProperty("external_referrer")
        public abstract Builder externalReferrer(String str);

        @JsonProperty("feature_classes")
        public abstract Builder featureClasses(Set<String> set);

        @JsonProperty("feature_identifier")
        public abstract Builder featureIdentifier(String str);

        @JsonProperty("feature_version")
        public abstract Builder featureVersion(String str);

        @JsonProperty("referrer_identifier")
        public abstract Builder referrerIdentifier(String str);

        @JsonProperty("view_uri")
        public abstract Builder viewUri(String str);

        @JsonCreator
        public static Builder builder() {
            return PlayOrigin.builder();
        }
    }

    @JsonProperty("device_identifier")
    public abstract String deviceIdentifier();

    @JsonProperty("external_referrer")
    public abstract String externalReferrer();

    @JsonProperty("feature_classes")
    public abstract ImmutableSet<String> featureClasses();

    @JsonProperty("feature_identifier")
    public abstract String featureIdentifier();

    @JsonProperty("feature_version")
    public abstract String featureVersion();

    @JsonProperty("referrer_identifier")
    public abstract String referrerIdentifier();

    public abstract Builder toBuilder();

    @JsonProperty("view_uri")
    public abstract String viewUri();

    public static Builder builder() {
        String str = "";
        return new Builder().featureIdentifier(str).featureVersion(str).viewUri(str).externalReferrer(str).referrerIdentifier(str).deviceIdentifier(str).featureClasses(ImmutableSet.h());
    }

    public PlayOrigin withDeviceIdentifier(String str) {
        return toBuilder().deviceIdentifier(str).build();
    }
}
