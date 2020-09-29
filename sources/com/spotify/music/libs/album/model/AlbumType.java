package com.spotify.music.libs.album.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.spotify.mobile.android.cosmos.JacksonModel;

public enum AlbumType implements JacksonModel {
    ALBUM,
    SINGLE,
    COMPILATION,
    EP,
    AUDIOBOOK,
    PODCAST;
    
    private static final AlbumType[] ALBUM_TYPE_VALUES = null;

    static {
        ALBUM_TYPE_VALUES = values();
    }

    @JsonCreator
    public static AlbumType resolve(String str) {
        AlbumType[] albumTypeArr;
        for (AlbumType albumType : ALBUM_TYPE_VALUES) {
            if (albumType.name().equalsIgnoreCase(str)) {
                return albumType;
            }
        }
        return ALBUM;
    }
}
