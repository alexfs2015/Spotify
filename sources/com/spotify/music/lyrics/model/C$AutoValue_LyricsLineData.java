package com.spotify.music.lyrics.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.music.lyrics.model.$AutoValue_LyricsLineData reason: invalid class name */
abstract class C$AutoValue_LyricsLineData extends LyricsLineData {
    private final Integer time;
    private final List<Word> words;

    C$AutoValue_LyricsLineData(Integer num, List<Word> list) {
        this.time = num;
        if (list != null) {
            this.words = list;
            return;
        }
        throw new NullPointerException("Null words");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LyricsLineData) {
            LyricsLineData lyricsLineData = (LyricsLineData) obj;
            Integer num = this.time;
            if (num != null ? num.equals(lyricsLineData.time()) : lyricsLineData.time() == null) {
                if (this.words.equals(lyricsLineData.words())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.time;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.words.hashCode();
    }

    @JsonProperty("time")
    public Integer time() {
        return this.time;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LyricsLineData{time=");
        sb.append(this.time);
        sb.append(", words=");
        sb.append(this.words);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("words")
    public List<Word> words() {
        return this.words;
    }
}
