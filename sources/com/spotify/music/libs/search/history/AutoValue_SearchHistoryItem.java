package com.spotify.music.libs.search.history;

import com.fasterxml.jackson.annotation.JsonGetter;

final class AutoValue_SearchHistoryItem extends SearchHistoryItem {
    private static final long serialVersionUID = -1732689253947124362L;
    private final String getComponentCategory;
    private final String getComponentId;
    private final String getImageUri;
    private final String getOriginUri;
    private final String getPreviewId;
    private final String getSubtitle;
    private final String getTargetUri;
    private final String getTitle;
    private final boolean isExplicit;
    private final boolean shouldAppearDisabled;

    AutoValue_SearchHistoryItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        this.getComponentId = str;
        this.getComponentCategory = str2;
        if (str3 != null) {
            this.getTargetUri = str3;
            if (str4 != null) {
                this.getTitle = str4;
                this.getSubtitle = str5;
                this.getImageUri = str6;
                if (str7 != null) {
                    this.getOriginUri = str7;
                    this.getPreviewId = str8;
                    this.isExplicit = z;
                    this.shouldAppearDisabled = z2;
                    return;
                }
                throw new NullPointerException("Null getOriginUri");
            }
            throw new NullPointerException("Null getTitle");
        }
        throw new NullPointerException("Null getTargetUri");
    }

    @JsonGetter("componentId")
    public final String getComponentId() {
        return this.getComponentId;
    }

    @JsonGetter("componentCategory")
    public final String getComponentCategory() {
        return this.getComponentCategory;
    }

    @JsonGetter("targetUri")
    public final String getTargetUri() {
        return this.getTargetUri;
    }

    @JsonGetter("title")
    public final String getTitle() {
        return this.getTitle;
    }

    @JsonGetter("subtitle")
    public final String getSubtitle() {
        return this.getSubtitle;
    }

    @JsonGetter("imageUri")
    public final String getImageUri() {
        return this.getImageUri;
    }

    @JsonGetter("originUri")
    public final String getOriginUri() {
        return this.getOriginUri;
    }

    @JsonGetter("previewId")
    public final String getPreviewId() {
        return this.getPreviewId;
    }

    @JsonGetter("isExplicit")
    public final boolean isExplicit() {
        return this.isExplicit;
    }

    @JsonGetter("shouldAppearDisabled")
    public final boolean shouldAppearDisabled() {
        return this.shouldAppearDisabled;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchHistoryItem{getComponentId=");
        sb.append(this.getComponentId);
        sb.append(", getComponentCategory=");
        sb.append(this.getComponentCategory);
        sb.append(", getTargetUri=");
        sb.append(this.getTargetUri);
        sb.append(", getTitle=");
        sb.append(this.getTitle);
        sb.append(", getSubtitle=");
        sb.append(this.getSubtitle);
        sb.append(", getImageUri=");
        sb.append(this.getImageUri);
        sb.append(", getOriginUri=");
        sb.append(this.getOriginUri);
        sb.append(", getPreviewId=");
        sb.append(this.getPreviewId);
        sb.append(", isExplicit=");
        sb.append(this.isExplicit);
        sb.append(", shouldAppearDisabled=");
        sb.append(this.shouldAppearDisabled);
        sb.append("}");
        return sb.toString();
    }
}
