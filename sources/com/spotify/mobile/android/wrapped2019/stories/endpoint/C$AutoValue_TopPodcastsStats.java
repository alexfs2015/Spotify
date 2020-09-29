package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;

/* renamed from: com.spotify.mobile.android.wrapped2019.stories.endpoint.$AutoValue_TopPodcastsStats reason: invalid class name */
abstract class C$AutoValue_TopPodcastsStats extends TopPodcastsStats {
    private final String imageUrl;
    private final StoryParagraph paragraph1;
    private final StoryParagraph paragraph2;

    C$AutoValue_TopPodcastsStats(String str, StoryParagraph storyParagraph, StoryParagraph storyParagraph2) {
        if (str != null) {
            this.imageUrl = str;
            if (storyParagraph != null) {
                this.paragraph1 = storyParagraph;
                if (storyParagraph2 != null) {
                    this.paragraph2 = storyParagraph2;
                    return;
                }
                throw new NullPointerException("Null paragraph2");
            }
            throw new NullPointerException("Null paragraph1");
        }
        throw new NullPointerException("Null imageUrl");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TopPodcastsStats) {
            TopPodcastsStats topPodcastsStats = (TopPodcastsStats) obj;
            if (this.imageUrl.equals(topPodcastsStats.imageUrl()) && this.paragraph1.equals(topPodcastsStats.paragraph1()) && this.paragraph2.equals(topPodcastsStats.paragraph2())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.imageUrl.hashCode() ^ 1000003) * 1000003) ^ this.paragraph1.hashCode()) * 1000003) ^ this.paragraph2.hashCode();
    }

    @JsonProperty("imageUrl")
    public String imageUrl() {
        return this.imageUrl;
    }

    @JsonProperty("paragraph1")
    public StoryParagraph paragraph1() {
        return this.paragraph1;
    }

    @JsonProperty("paragraph2")
    public StoryParagraph paragraph2() {
        return this.paragraph2;
    }

    public String toString() {
        String str = "opsagsmaUet{oSariTsPtcsltd";
        StringBuilder sb = new StringBuilder("TopPodcastsStats{imageUrl=");
        sb.append(this.imageUrl);
        String str2 = "pa,mpg1r= ahr";
        sb.append(", paragraph1=");
        sb.append(this.paragraph1);
        sb.append(", paragraph2=");
        sb.append(this.paragraph2);
        String str3 = "}";
        sb.append("}");
        return sb.toString();
    }
}
