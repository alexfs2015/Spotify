package com.spotify.mobile.android.wrapped2019.stories;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

public abstract class StoryParagraph implements Parcelable, JacksonModel {

    public static abstract class a {
        public abstract a a(String str);

        public abstract a a(List<String> list);

        public abstract StoryParagraph a();
    }

    public abstract String text();

    public abstract List<String> values();

    @JsonCreator
    public static StoryParagraph create(@JsonProperty("text") String str, @JsonProperty("values") List<String> list) {
        return new AutoValue_StoryParagraph(str, list);
    }

    public String[] valuesArray() {
        return (String[]) values().toArray(new String[0]);
    }

    public static a builder() {
        return new a();
    }
}
