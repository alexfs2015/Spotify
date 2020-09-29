package com.spotify.music.libs.search.history;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.io.Serializable;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SearchHistoryItem implements JacksonModel, Serializable {
    public static final String SEARCH_HISTORY_IMAGE_URI = "trackImageUri";
    public static final String SEARCH_HISTORY_SUBTITLE = "searchHistorySubtitle";
    public static final String SEARCH_HISTORY_TRACK_ALBUM_URI = "album_uri";
    public static final String SEARCH_HISTORY_TRACK_PREVIEW_ID = "preview_id";
    private static final long serialVersionUID = -1732689253947124362L;

    @JsonGetter("componentCategory")
    public abstract String getComponentCategory();

    @JsonGetter("componentId")
    public abstract String getComponentId();

    @JsonGetter("imageUri")
    public abstract String getImageUri();

    @JsonGetter("originUri")
    public abstract String getOriginUri();

    @JsonGetter("previewId")
    public abstract String getPreviewId();

    @JsonGetter("subtitle")
    public abstract String getSubtitle();

    @JsonGetter("targetUri")
    public abstract String getTargetUri();

    @JsonGetter("title")
    public abstract String getTitle();

    @JsonGetter("isExplicit")
    public abstract boolean isExplicit();

    @JsonGetter("shouldAppearDisabled")
    public abstract boolean shouldAppearDisabled();

    @JsonCreator
    public static SearchHistoryItem create(@JsonProperty("componentId") String str, @JsonProperty("componentCategory") String str2, @JsonProperty("targetUri") String str3, @JsonProperty("title") String str4, @JsonProperty("subtitle") String str5, @JsonProperty("imageUri") String str6, @JsonProperty("originUri") String str7, @JsonProperty("previewId") String str8, @JsonProperty("isExplicit") boolean z, @JsonProperty("shouldAppearDisabled") boolean z2) {
        AutoValue_SearchHistoryItem autoValue_SearchHistoryItem = new AutoValue_SearchHistoryItem(str, str2, str3, str4, str5, str6, str7, str8, z, z2);
        return autoValue_SearchHistoryItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SearchHistoryItem) {
            SearchHistoryItem searchHistoryItem = (SearchHistoryItem) obj;
            return faw.a(getTargetUri(), searchHistoryItem.getTargetUri()) && faw.a(getOriginUri(), searchHistoryItem.getOriginUri());
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getTargetUri(), getOriginUri()});
    }
}
