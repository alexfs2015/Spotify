package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collection;
import java.util.List;

@JsonSerialize(as = PrefsModel.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PrefsModel implements JacksonModel {
    public static final PrefsModel DEFAULT = builder().a(ImmutableList.d()).a();

    public static abstract class a {
        public abstract a a(List<PagePrefs> list);

        public abstract PrefsModel a();
    }

    @JsonProperty("page_prefs")
    public abstract List<PagePrefs> pagePrefs();

    public abstract a toBuilder();

    public static a builder() {
        return new a();
    }

    @JsonCreator
    public static PrefsModel create(@JsonProperty("page_prefs") List<PagePrefs> list) {
        return builder().a(ImmutableList.a((Collection) fav.a(list, ImmutableList.d()))).a();
    }

    public PrefsModel withPagePrefs(List<PagePrefs> list) {
        return toBuilder().a(ImmutableList.a((Collection<? extends E>) list)).a();
    }
}
