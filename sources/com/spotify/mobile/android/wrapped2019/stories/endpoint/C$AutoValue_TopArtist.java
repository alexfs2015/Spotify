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

    @JsonProperty("amountStreamed")
    public StoryParagraph amountStreamed() {
        return this.amountStreamed;
    }

    @JsonProperty("artist")
    public Artist artist() {
        return this.artist;
    }

    @JsonProperty("caption")
    public String caption() {
        return this.caption;
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

    @JsonProperty("favoriteSong")
    public StoryParagraph favoriteSong() {
        return this.favoriteSong;
    }

    public int hashCode() {
        return ((((((((this.previewUrl.hashCode() ^ 1000003) * 1000003) ^ this.caption.hashCode()) * 1000003) ^ this.amountStreamed.hashCode()) * 1000003) ^ this.favoriteSong.hashCode()) * 1000003) ^ this.artist.hashCode();
    }

    @JsonProperty("previewUrl")
    public String previewUrl() {
        return this.previewUrl;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TopArtist{previewUrl=");
        sb.append(this.previewUrl);
        sb.append(", caption=");
        sb.append(this.caption);
        String str = "t stnur,=dmeeSaoa";
        sb.append(", amountStreamed=");
        sb.append(this.amountStreamed);
        String str2 = "=vomofa,Senrgti";
        sb.append(", favoriteSong=");
        sb.append(this.favoriteSong);
        String str3 = "airtos,= ";
        sb.append(", artist=");
        sb.append(this.artist);
        String str4 = "}";
        sb.append("}");
        return sb.toString();
    }
}
