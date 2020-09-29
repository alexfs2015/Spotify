package com.spotify.music.genie.omakasse;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OmakaseResponse implements Parcelable, JacksonModel {
    @JsonProperty("uri")
    public abstract List<String> getUriList();

    @JsonCreator
    public static OmakaseResponse create(@JsonProperty("uri") List<String> list) {
        return new AutoValue_OmakaseResponse(list);
    }
}
