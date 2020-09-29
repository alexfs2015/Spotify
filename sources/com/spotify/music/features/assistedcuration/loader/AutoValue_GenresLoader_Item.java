package com.spotify.music.features.assistedcuration.loader;

import com.spotify.music.features.assistedcuration.loader.GenresLoader.Item;

final class AutoValue_GenresLoader_Item extends Item {
    private final String id;
    private final String imageUrl;
    private final String largeImageUrl;
    private final String name;

    AutoValue_GenresLoader_Item(String str, String str2, String str3, String str4) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Item) {
            Item item = (Item) obj;
            if (this.id.equals(item.getId()) && this.name.equals(item.getName())) {
                String str = this.imageUrl;
                if (str != null ? str.equals(item.getImageUrl()) : item.getImageUrl() == null) {
                    String str2 = this.largeImageUrl;
                    return str2 != null ? str2.equals(item.getLargeImageUrl()) : item.getLargeImageUrl() == null;
                }
            }
        }
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLargeImageUrl() {
        return this.largeImageUrl;
    }

    public final String getName() {
        return this.name;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item{id=");
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
}
