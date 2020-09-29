package com.spotify.music.features.user.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DecoratedUser implements JacksonModel {
    @JsonProperty("displayName")
    public final String displayName;
    @JsonProperty("facebookUid")
    public final String facebookUid;
    @JsonProperty("firstName")
    public final String firstName;
    @JsonProperty("images")
    public final Images images;
    @JsonProperty("lastName")
    public final String lastName;
    @JsonProperty("username")
    public final String username;
    @JsonProperty("valid")
    public final Boolean valid;

    public DecoratedUser(@JsonProperty("username") String str, @JsonProperty("valid") Boolean bool, @JsonProperty("displayName") String str2, @JsonProperty("images") Images images2, @JsonProperty("firstName") String str3, @JsonProperty("lastName") String str4, @JsonProperty("facebookUid") String str5) {
        this.username = (String) fay.a(str);
        this.valid = (Boolean) fay.a(bool);
        this.displayName = str2;
        this.images = images2;
        this.firstName = str3;
        this.lastName = str4;
        this.facebookUid = str5;
    }
}
