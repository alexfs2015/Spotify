package com.spotify.music.search.podcasts.tabs;

import com.spotify.music.R;

public enum SearchTab {
    ALL("all", R.string.podcast_tab_all),
    MUSIC("music", R.string.podcast_tab_music),
    PODCASTS("podcasts", R.string.podcast_tab_podcasts),
    TRACKS("tracks", R.string.podcast_tab_tracks),
    ALBUMS("albums", R.string.podcast_tab_albums),
    ARTISTS("artists", R.string.podcast_tab_artists),
    PLAYLISTS("playlists", R.string.podcast_tab_playlists),
    LYRICS("lyrics", R.string.podcast_tab_lyrics),
    VIDEO("video", R.string.podcast_tab_video),
    PROFILES("profiles", R.string.podcast_tab_profiles);
    
    public static final SearchTab[] a = null;
    public final String mTabId;
    public final int mTabNameResId;

    static {
        a = values();
    }

    private SearchTab(String str, int i) {
        this.mTabId = str;
        this.mTabNameResId = i;
    }
}
