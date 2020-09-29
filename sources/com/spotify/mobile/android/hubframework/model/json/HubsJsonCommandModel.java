package com.spotify.mobile.android.hubframework.model.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.hubframework.model.serializer.HubsModelFailingSerializer;

@JsonSerialize(using = HubsModelFailingSerializer.class)
final class HubsJsonCommandModel extends hct implements JacksonModel {
    private static final String KEY_DATA = "data";
    private static final String KEY_NAME = "name";

    private HubsJsonCommandModel(String str, HubsJsonComponentBundle hubsJsonComponentBundle) {
        if (str == null) {
            str = "";
        }
        super(str, HubsImmutableComponentBundle.fromNullable(hubsJsonComponentBundle));
    }

    @JsonCreator
    static HubsJsonCommandModel fromJson(@JsonProperty("name") String str, @JsonProperty("data") HubsJsonComponentBundle hubsJsonComponentBundle) {
        return new HubsJsonCommandModel(str, hubsJsonComponentBundle);
    }
}
