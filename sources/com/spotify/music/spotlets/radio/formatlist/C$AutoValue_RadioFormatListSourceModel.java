package com.spotify.music.spotlets.radio.formatlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/* renamed from: com.spotify.music.spotlets.radio.formatlist.$AutoValue_RadioFormatListSourceModel reason: invalid class name */
abstract class C$AutoValue_RadioFormatListSourceModel extends RadioFormatListSourceModel {
    private final List<Map<String, String>> mediaItems;
    private final Integer total;

    C$AutoValue_RadioFormatListSourceModel(Integer num, List<Map<String, String>> list) {
        this.total = num;
        this.mediaItems = list;
    }

    @JsonProperty("total")
    public Integer total() {
        return this.total;
    }

    @JsonProperty("mediaItems")
    public List<Map<String, String>> mediaItems() {
        return this.mediaItems;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RadioFormatListSourceModel{total=");
        sb.append(this.total);
        sb.append(", mediaItems=");
        sb.append(this.mediaItems);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RadioFormatListSourceModel) {
            RadioFormatListSourceModel radioFormatListSourceModel = (RadioFormatListSourceModel) obj;
            Integer num = this.total;
            if (num != null ? num.equals(radioFormatListSourceModel.total()) : radioFormatListSourceModel.total() == null) {
                List<Map<String, String>> list = this.mediaItems;
                return list != null ? list.equals(radioFormatListSourceModel.mediaItems()) : radioFormatListSourceModel.mediaItems() == null;
            }
        }
    }

    public int hashCode() {
        Integer num = this.total;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        List<Map<String, String>> list = this.mediaItems;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode ^ i;
    }
}
