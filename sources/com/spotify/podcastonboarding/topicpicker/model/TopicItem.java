package com.spotify.podcastonboarding.topicpicker.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class TopicItem implements Parcelable, JacksonModel {

    public interface a {
        a a(boolean z);

        TopicItem a();
    }

    public abstract String color();

    public abstract String id();

    public abstract String image();

    public abstract String name();

    public abstract String parent();

    public abstract boolean selected();

    public abstract a toBuilder();

    public abstract String type();

    @JsonCreator
    public static TopicItem create(@JsonProperty("id") String str, @JsonProperty("name") String str2, @JsonProperty("type") String str3, @JsonProperty("parent") String str4, @JsonProperty("color") String str5, @JsonProperty("selected") boolean z, @JsonProperty("image") String str6) {
        AutoValue_TopicItem autoValue_TopicItem = new AutoValue_TopicItem(str, str2, str3, str4, str5, z, str6);
        return autoValue_TopicItem;
    }

    public static a builder() {
        return new a();
    }

    public TopicItem withSelected(boolean z) {
        return toBuilder().a(z).a();
    }
}
