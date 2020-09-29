package com.spotify.music.features.findfriends.legacy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndexModel implements JacksonModel {
    @JsonProperty("FACEBOOK")
    private final List<String> mFacebookValue;

    private IndexModel(List<String> list) {
        this.mFacebookValue = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexModel)) {
            return false;
        }
        IndexModel indexModel = (IndexModel) obj;
        List<String> list = this.mFacebookValue;
        return list == null ? indexModel.mFacebookValue == null : list.equals(indexModel.mFacebookValue);
    }

    public int hashCode() {
        List<String> list = this.mFacebookValue;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }
}
