package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

@JsonInclude(Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class PlayOrigin {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return PlayOrigin.builder("");
        }

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
    }

    public static Builder builder(String str) {
        Builder featureIdentifier = new Builder().featureIdentifier(str);
        String str2 = "";
        return featureIdentifier.featureVersion(str2).viewUri(str2).externalReferrer(str2).referrerIdentifier(str2).deviceIdentifier(str2).featureClasses(ImmutableSet.h());
    }

    public static PlayOrigin create(String str) {
        return builder(str).build();
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
}
