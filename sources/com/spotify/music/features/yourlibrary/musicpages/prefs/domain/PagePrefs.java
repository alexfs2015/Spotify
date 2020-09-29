package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.yourlibrary.musicpages.datasource.SortOrder;
import java.util.Map;

@JsonSerialize(as = PagePrefs.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PagePrefs implements JacksonModel {

    public static abstract class a {
        public abstract a a(SortOrder sortOrder);

        public abstract a a(Long l);

        public abstract a a(String str);

        public abstract a a(Map<String, Boolean> map);

        public abstract PagePrefs a();

        public abstract a b(Map<String, String> map);
    }

    @JsonProperty("active_sort_order")
    public abstract SortOrder activeSortOrder();

    @JsonProperty("filter_states")
    public abstract Map<String, Boolean> filterStates();

    @JsonProperty("options")
    public abstract Map<String, String> options();

    @JsonProperty("timestamp")
    public abstract Long timestamp();

    public abstract a toBuilder();

    @JsonProperty("uri")
    public abstract String uri();

    public static a builderWithDefault() {
        return builder().a((Long) null).a((SortOrder) null).a((Map<String, Boolean>) ImmutableMap.f()).b(ImmutableMap.f());
    }

    public static a builder() {
        return new a();
    }

    @JsonCreator
    public static PagePrefs create(@JsonProperty("uri") String str, @JsonProperty("timestamp") Long l, @JsonProperty("active_sort_order") SortOrder sortOrder, @JsonProperty("filter_states") Map<String, Boolean> map, @JsonProperty("options") Map<String, String> map2) {
        return builder().a(str).a(l).a(sortOrder).a((Map<String, Boolean>) ImmutableMap.a((Map) fav.a(map, ImmutableMap.f()))).b(ImmutableMap.a((Map) fav.a(map2, ImmutableMap.f()))).a();
    }

    public PagePrefs withTimestamp(long j) {
        return toBuilder().a(Long.valueOf(j)).a();
    }

    public PagePrefs withActiveSortOrder(SortOrder sortOrder) {
        return toBuilder().a(sortOrder).a();
    }

    public PagePrefs withFilterStates(Map<String, Boolean> map) {
        return toBuilder().a(map).a();
    }

    public PagePrefs withOptions(Map<String, String> map) {
        return toBuilder().b(map).a();
    }
}
