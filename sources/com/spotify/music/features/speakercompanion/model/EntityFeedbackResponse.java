package com.spotify.music.features.speakercompanion.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class EntityFeedbackResponse implements JacksonModel {
    @JsonCreator
    public static EntityFeedbackResponse create(@JsonProperty("eligible") boolean z, @JsonProperty("payload") EntityFeedback entityFeedback) {
        return new AutoValue_EntityFeedbackResponse(z, entityFeedback);
    }

    public abstract boolean eligible();

    public abstract EntityFeedback payload();
}
