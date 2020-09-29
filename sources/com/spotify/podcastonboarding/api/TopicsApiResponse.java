package com.spotify.podcastonboarding.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.podcastonboarding.topicpicker.model.TopicItem;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class TopicsApiResponse implements JacksonModel {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class a {
        public abstract String a();

        public abstract String b();

        public abstract List<TopicItem> c();

        @JsonCreator
        public static a create(@JsonProperty("render_type") String str, @JsonProperty("title") String str2, @JsonProperty("topics") List<TopicItem> list) {
            return new vah(str, str2, list);
        }
    }

    public abstract List<a> sections();

    @JsonCreator
    public static TopicsApiResponse create(@JsonProperty("sections") List<a> list) {
        return new AutoValue_TopicsApiResponse(list);
    }
}
