package com.spotify.music.features.yourlibrary.musicpages.recsloader;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_RecsItem extends RecsItem {
    private final String id;
    private final String imageUrl;
    private final String largeImageUrl;
    private final String name;

    AutoValue_RecsItem(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.id = str;
            if (str2 != null) {
                this.name = str2;
                this.imageUrl = str3;
                this.largeImageUrl = str4;
                return;
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null id");
    }

    @JsonProperty("id")
    public final String id() {
        return this.id;
    }

    @JsonProperty("name")
    public final String name() {
        return this.name;
    }

    @JsonProperty("image_url")
    public final String imageUrl() {
        return this.imageUrl;
    }

    @JsonProperty("large_image_url")
    public final String largeImageUrl() {
        return this.largeImageUrl;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecsItem{id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", largeImageUrl=");
        sb.append(this.largeImageUrl);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RecsItem) {
            RecsItem recsItem = (RecsItem) obj;
            if (this.id.equals(recsItem.id()) && this.name.equals(recsItem.name())) {
                String str = this.imageUrl;
                if (str != null ? str.equals(recsItem.imageUrl()) : recsItem.imageUrl() == null) {
                    String str2 = this.largeImageUrl;
                    return str2 != null ? str2.equals(recsItem.largeImageUrl()) : recsItem.largeImageUrl() == null;
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.id.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003;
        String str = this.imageUrl;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.largeImageUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }
}
