package com.spotify.mobile.android.hubframework.model.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.hubframework.model.serializer.HubsModelFailingSerializer;
import java.util.List;

@JsonSerialize(using = HubsModelFailingSerializer.class)
public class HubsJsonViewModel extends hai implements JacksonModel {
    private static final String JSON_KEY_BODY = "body";
    private static final String JSON_KEY_CUSTOM = "custom";
    private static final String JSON_KEY_EXTENSION = "extension";
    private static final String JSON_KEY_HEADER = "header";
    private static final String JSON_KEY_ID = "id";
    private static final String JSON_KEY_OVERLAYS = "overlays";
    private static final String JSON_KEY_TITLE = "title";

    private HubsJsonViewModel(String str, String str2, hae hae, ImmutableList<hae> immutableList, ImmutableList<hae> immutableList2, String str3, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        super(str, str2, hae, immutableList, immutableList2, str3, hubsImmutableComponentBundle);
    }

    @JsonCreator
    static HubsJsonViewModel fromJson(@JsonProperty("id") String str, @JsonProperty("title") String str2, @JsonProperty("header") HubsJsonComponentModel hubsJsonComponentModel, @JsonProperty("body") List<HubsJsonComponentModel> list, @JsonProperty("overlays") List<HubsJsonComponentModel> list2, @JsonProperty("extension") String str3, @JsonProperty("custom") HubsJsonComponentBundle hubsJsonComponentBundle) {
        HubsJsonViewModel hubsJsonViewModel = new HubsJsonViewModel(str, str2, hubsJsonComponentModel, hap.a((List<E>) hab.a(list)), hap.a((List<E>) hab.a(list2)), str3, HubsImmutableComponentBundle.fromNullable(hubsJsonComponentBundle));
        return hubsJsonViewModel;
    }
}
