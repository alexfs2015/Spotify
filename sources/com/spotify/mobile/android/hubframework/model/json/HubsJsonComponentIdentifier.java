package com.spotify.mobile.android.hubframework.model.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.hubframework.model.serializer.HubsModelFailingSerializer;

@JsonSerialize(using = HubsModelFailingSerializer.class)
final class HubsJsonComponentIdentifier extends hac implements JacksonModel {
    private static final String JSON_KEY_CATEGORY = "category";
    private static final String JSON_KEY_ID = "id";

    private HubsJsonComponentIdentifier(String str, String str2) {
        super(str, str2);
    }

    @JsonCreator
    static HubsJsonComponentIdentifier fromJson(@JsonProperty("id") String str, @JsonProperty("category") String str2) {
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        if (str2 == null) {
            str2 = str3;
        }
        return new HubsJsonComponentIdentifier(str, str2);
    }
}
