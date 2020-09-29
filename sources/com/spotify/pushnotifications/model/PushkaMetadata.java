package com.spotify.pushnotifications.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PushkaMetadata implements JacksonModel {
    public abstract String getCampaignId();

    public abstract String getMessageId();

    @JsonCreator
    public static PushkaMetadata create(@JsonProperty("messageId") String str, @JsonProperty("campaignId") String str2) {
        return new AutoValue_PushkaMetadata(str, str2);
    }
}
