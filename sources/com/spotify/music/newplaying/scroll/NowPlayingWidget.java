package com.spotify.music.newplaying.scroll;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public interface NowPlayingWidget {

    public enum Type {
        ARTIST,
        BEHIND_THE_LYRICS,
        EXAMPLE,
        LYRICS,
        PIVOTS_MUSIC,
        PIVOTS_PODCAST,
        STORYLINES
    }

    View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    Type a();

    void b();

    void c();

    void d();
}
