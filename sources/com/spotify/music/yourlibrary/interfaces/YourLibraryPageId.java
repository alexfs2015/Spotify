package com.spotify.music.yourlibrary.interfaces;

public enum YourLibraryPageId {
    MUSIC_PLAYLISTS("music_playlists"),
    MUSIC_ARTISTS("music_artists"),
    MUSIC_ALBUMS("music_albums"),
    MUSIC_DOWNLOADS("music_downloads"),
    MUSIC_SONGS("music_songs"),
    PODCAST_DOWNLOADS("podcast_downloads"),
    PODCAST_EPISODES("podcast_episodes"),
    PODCAST_FOLLOWED("podcast_followed");
    
    private static final YourLibraryPageId[] i = null;
    public final String mId;

    static {
        i = values();
    }

    private YourLibraryPageId(String str) {
        this.mId = str;
    }

    public static YourLibraryPageId a(String str) {
        YourLibraryPageId[] yourLibraryPageIdArr;
        for (YourLibraryPageId yourLibraryPageId : i) {
            if (yourLibraryPageId.mId.equals(str)) {
                return yourLibraryPageId;
            }
        }
        return null;
    }
}
