package com.spotify.music.lyrics.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class LyricsLineData implements Parcelable, JacksonModel {
    @JsonCreator
    public static LyricsLineData create(@JsonProperty("time") Integer num, @JsonProperty("words") List<Word> list) {
        return new AutoValue_LyricsLineData(num, list);
    }

    public int requireTime() {
        return ((Integer) fbp.a(time())).intValue();
    }

    @JsonProperty("time")
    public abstract Integer time();

    @JsonProperty("words")
    public abstract List<Word> words();
}
