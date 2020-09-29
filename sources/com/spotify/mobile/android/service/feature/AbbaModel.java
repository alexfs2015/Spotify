package com.spotify.mobile.android.service.feature;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonDeserialize(using = AbbaModel_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbbaModel implements JacksonModel {
    private final AbbaFlagModel[] mFlags;

    @JsonCreator
    public AbbaModel(@JsonProperty("flags") AbbaFlagModel[] abbaFlagModelArr) {
        if (abbaFlagModelArr == null) {
            this.mFlags = new AbbaFlagModel[0];
        } else {
            this.mFlags = abbaFlagModelArr;
        }
    }

    @JsonProperty("flags")
    public AbbaFlagModel[] getFlags() {
        return this.mFlags;
    }
}
