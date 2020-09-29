package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.wrapped2019.stories.endpoint.$AutoValue_Podcast reason: invalid class name */
abstract class C$AutoValue_Podcast extends Podcast {
    private final String imageUrl;
    private final String name;
    private final String rank;

    C$AutoValue_Podcast(String str, String str2, String str3) {
        if (str != null) {
            this.name = str;
            if (str2 != null) {
                this.rank = str2;
                if (str3 != null) {
                    this.imageUrl = str3;
                    return;
                }
                throw new NullPointerException("Null imageUrl");
            }
            throw new NullPointerException("Null rank");
        }
        throw new NullPointerException("Null name");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Podcast) {
            Podcast podcast = (Podcast) obj;
            if (this.name.equals(podcast.name()) && this.rank.equals(podcast.rank()) && this.imageUrl.equals(podcast.imageUrl())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.rank.hashCode()) * 1000003) ^ this.imageUrl.hashCode();
    }

    @JsonProperty("imageUrl")
    public String imageUrl() {
        return this.imageUrl;
    }

    @JsonProperty("name")
    public String name() {
        return this.name;
    }

    @JsonProperty("rank")
    public String rank() {
        return this.rank;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Podcast{name=");
        sb.append(this.name);
        String str = "r snak=";
        sb.append(", rank=");
        sb.append(this.rank);
        String str2 = "mUeml a,=ig";
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append("}");
        return sb.toString();
    }
}
