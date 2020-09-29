package com.spotify.music.podcastentityrow;

public final class PlaySourceProvider {
    public Source a = Source.NO_CLICK;

    public enum Source {
        EPISODE_LIST,
        CONTEXTUAL_EPISODE,
        NO_CLICK,
        UNKNOWN
    }
}
