package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;

/* renamed from: com.spotify.mobile.android.wrapped2019.stories.endpoint.$AutoValue_TopArtist reason: invalid class name */
abstract class C$AutoValue_TopArtist extends TopArtist {
    private final StoryParagraph amountStreamed;
    private final Artist artist;
    private final String caption;
    private final StoryParagraph favoriteSong;
    private final String previewUrl;

    C$AutoValue_TopArtist(String str, String str2, StoryParagraph storyParagraph, StoryParagraph storyParagraph2, Artist artist2) {
        if (str != null) {
            this.previewUrl = str;
            if (str2 != null) {
                this.caption = str2;
                if (storyParagraph != null) {
                    this.amountStreamed = storyParagraph;
                    if (storyParagraph2 != null) {
                        this.favoriteSong = storyParagraph2;
                        if (artist2 != null) {
                            this.artist = artist2;
                            return;
                        }
                        throw new NullPointerException("Null artist");
                    }
                    throw new NullPointerException("Null favoriteSong");
                }
                throw new NullPointerException("Null amountStreamed");
            }
            throw new NullPointerException("Null caption");
        }
        throw new NullPointerException("Null previewUrl");
    }

    @JsonProperty("previewUrl")
    public String previewUrl() {
        return this.previewUrl;
    }

    @JsonProperty("caption")
    public String caption() {
        return this.caption;
    }

    @JsonProperty("amountStreamed")
    public StoryParagraph amountStreamed() {
        return this.amountStreamed;
    }

    @JsonProperty("favoriteSong")
    public StoryParagraph favoriteSong() {
        return this.favoriteSong;
    }

    @JsonProperty("artist")
    public Artist artist() {
        return this.artist;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TopArtist{previewUrl=");
        sb.append(this.previewUrl);
        sb.append(", caption=");
        sb.append(this.caption);
        sb.append(", amountStreamed=");
        sb.append(this.amountStreamed);
        sb.append(", favoriteSong=");
        sb.append(this.favoriteSong);
        sb.append(", artist=");
        sb.append(this.artist);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TopArtist) {
            TopArtist topArtist = (TopArtist) obj;
            return this.previewUrl.equals(topArtist.previewUrl()) && this.caption.equals(topArtist.caption()) && this.amountStreamed.equals(topArtist.amountStreamed()) && this.favoriteSong.equals(topArtist.favoriteSong()) && this.artist.equals(topArtist.artist());
        }
    }

    public int hashCode() {
        return ((((((((this.previewUrl.hashCode() ^ 1000003) * 1000003) ^ this.caption.hashCode()) * 1000003) ^ this.amountStreamed.hashCode()) * 1000003) ^ this.favoriteSong.hashCode()) * 1000003) ^ this.artist.hashCode();
    }
}
