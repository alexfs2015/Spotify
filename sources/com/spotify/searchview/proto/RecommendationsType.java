package com.spotify.searchview.proto;

public enum RecommendationsType implements b {
    RECOMMENDATIONS_TYPE_UNKNOWN(0),
    RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_ARTIST(1),
    RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_GENRE(2),
    RECOMMENDATIONS_TYPE_PODCASTS_FOR_CATEGORY(3),
    RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_TRACK(4),
    UNRECOGNIZED(-1);
    
    final int value;

    static {
        new Object() {
        };
    }

    public final int a() {
        return this.value;
    }

    public static RecommendationsType a(int i) {
        if (i == 0) {
            return RECOMMENDATIONS_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_ARTIST;
        }
        if (i == 2) {
            return RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_GENRE;
        }
        if (i == 3) {
            return RECOMMENDATIONS_TYPE_PODCASTS_FOR_CATEGORY;
        }
        if (i != 4) {
            return null;
        }
        return RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_TRACK;
    }

    private RecommendationsType(int i) {
        this.value = i;
    }
}
