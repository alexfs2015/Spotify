package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Artist implements Parcelable, JacksonModel {
    @JsonCreator
    public static Artist create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("imageUri") String str3, @JsonProperty("hasAffinity") boolean z, @JsonProperty("monthlyListeners") Integer num) {
        AutoValue_Artist autoValue_Artist = r0;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        boolean z2 = z;
        Integer num2 = num;
        AutoValue_Artist autoValue_Artist2 = new AutoValue_Artist(str, str2, str3, z, num);
        return autoValue_Artist2;
    }

    @JsonProperty("imageUri")
    public abstract String getImageUri();

    @JsonProperty("monthlyListeners")
    public abstract Integer getMonthlyListener();

    @JsonProperty("name")
    public abstract String getName();

    @JsonProperty("uri")
    public abstract String getUri();

    @JsonProperty("hasAffinity")
    public abstract boolean hasAffinity();
}
