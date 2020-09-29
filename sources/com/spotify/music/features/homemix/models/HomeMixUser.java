package com.spotify.music.features.homemix.models;

import android.graphics.Color;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class HomeMixUser implements JacksonModel {
    @JsonCreator
    public static HomeMixUser create(@JsonProperty("username") String str, @JsonProperty("short_name") String str2, @JsonProperty("image_url") String str3, @JsonProperty("large_image_url") String str4, @JsonProperty("initials") String str5, @JsonProperty("enabled") boolean z, @JsonProperty("present") boolean z2, @JsonProperty("color") String str6, @JsonProperty("needs_taste_onboarding") boolean z3) {
        AutoValue_HomeMixUser autoValue_HomeMixUser = new AutoValue_HomeMixUser((String) fbp.a(str), str2, str3, str4, str5, z, z2, str6, z3);
        return autoValue_HomeMixUser;
    }

    @JsonProperty("color")
    public abstract String getColor();

    @JsonIgnore
    public nqw getFace() {
        return new nqu(getImageUrl(), (String) fbp.a(getInitials()), Color.parseColor(getColor()));
    }

    @JsonProperty("image_url")
    public abstract String getImageUrl();

    @JsonProperty("initials")
    public abstract String getInitials();

    @JsonProperty("large_image_url")
    public abstract String getLargeImageUrl();

    @JsonProperty("short_name")
    public abstract String getShortName();

    @JsonProperty("username")
    public abstract String getUsername();

    @JsonProperty("enabled")
    public abstract boolean isEnabled();

    @JsonProperty("present")
    public abstract boolean isPresent();

    @JsonProperty("needs_taste_onboarding")
    public abstract boolean needsTasteOnboarding();
}
