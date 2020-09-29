package com.spotify.music.features.playlistentity.plugin;

import com.spotify.music.playlist.formatlisttype.FormatListType;

public interface Plugin {

    public enum Type {
        CUSTOM,
        VANILLA
    }

    Type a();

    boolean a(FormatListType formatListType, fpt fpt);

    String b();
}
