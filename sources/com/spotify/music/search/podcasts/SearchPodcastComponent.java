package com.spotify.music.search.podcasts;

public enum SearchPodcastComponent implements hck {
    EPISODE_ROW("search:podcastEpisodeRow", r1),
    SHOW_ROW("search:podcastShowRow", r1),
    TAG_CARD("search:podcastTag", "card");
    
    private final String mCategory;
    private final String mId;

    private SearchPodcastComponent(String str, String str2) {
        this.mId = str;
        this.mCategory = str2;
    }

    public final String category() {
        return this.mCategory;
    }

    public final String id() {
        return this.mId;
    }
}
