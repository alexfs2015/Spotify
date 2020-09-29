package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.List;

@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class CreateRadioStationModel implements JacksonModel {
    public static CreateRadioStationModel create(RadioStationModel radioStationModel) {
        return new AutoValue_CreateRadioStationModel(Arrays.asList((Object[]) fbp.a(radioStationModel.seeds)), radioStationModel.title, radioStationModel.imageUri);
    }

    public static CreateRadioStationModel create(List<String> list) {
        return new AutoValue_CreateRadioStationModel((List) fbp.a(list), null, null);
    }

    public static CreateRadioStationModel create(String[] strArr) {
        return new AutoValue_CreateRadioStationModel(Arrays.asList((Object[]) fbp.a(strArr)), null, null);
    }

    @JsonProperty("imageUri")
    public abstract String imageUri();

    @JsonProperty
    public abstract List<String> seeds();

    @JsonProperty("title")
    public abstract String title();
}
