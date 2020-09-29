package com.spotify.searchview.proto;

public enum EntityType implements b {
    ENTITY_TYPE_UNKNOWN(0),
    ENTITY_TYPE_ARTIST(1),
    ENTITY_TYPE_TRACK(2),
    ENTITY_TYPE_ALBUM(3),
    ENTITY_TYPE_PLAYLIST(4),
    ENTITY_TYPE_GENRE(5),
    ENTITY_TYPE_AUDIO_SHOW(6),
    ENTITY_TYPE_AUDIO_EPISODE(7),
    ENTITY_TYPE_PROFILE(8),
    UNRECOGNIZED(-1);
    
    private final int value;

    static {
        new Object() {
        };
    }

    private EntityType(int i) {
        this.value = i;
    }

    public static EntityType a(int i) {
        switch (i) {
            case 0:
                return ENTITY_TYPE_UNKNOWN;
            case 1:
                return ENTITY_TYPE_ARTIST;
            case 2:
                return ENTITY_TYPE_TRACK;
            case 3:
                return ENTITY_TYPE_ALBUM;
            case 4:
                return ENTITY_TYPE_PLAYLIST;
            case 5:
                return ENTITY_TYPE_GENRE;
            case 6:
                return ENTITY_TYPE_AUDIO_SHOW;
            case 7:
                return ENTITY_TYPE_AUDIO_EPISODE;
            case 8:
                return ENTITY_TYPE_PROFILE;
            default:
                return null;
        }
    }

    public final int a() {
        return this.value;
    }
}
