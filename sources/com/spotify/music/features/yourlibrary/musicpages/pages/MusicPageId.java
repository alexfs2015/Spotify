package com.spotify.music.features.yourlibrary.musicpages.pages;

public enum MusicPageId {
    PLAYLISTS("playlists"),
    ARTISTS("artists"),
    ALBUMS("albums"),
    DOWNLOADS("downloads"),
    FOLDER("folder"),
    SONGS("songs");
    
    public final String mId;

    static {
        values();
    }

    private MusicPageId(String str) {
        this.mId = str;
    }
}
