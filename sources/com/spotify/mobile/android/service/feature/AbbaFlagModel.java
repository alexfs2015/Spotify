package com.spotify.mobile.android.service.feature;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AbbaFlagModel implements JacksonModel {
    private final String mCell;
    private final String mFeatureName;

    @JsonCreator
    public AbbaFlagModel(@JsonProperty("featureName") String str, @JsonProperty("cell") String str2) {
        this.mFeatureName = (String) fay.a(str);
        this.mCell = (String) fay.a(str2);
    }

    public String getFeatureName() {
        return this.mFeatureName;
    }

    public String getCell() {
        return this.mCell;
    }
}
