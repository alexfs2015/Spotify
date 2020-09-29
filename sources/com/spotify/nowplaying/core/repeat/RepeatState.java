package com.spotify.nowplaying.core.repeat;

public enum RepeatState {
    NONE(false, false),
    CONTEXT(true, false),
    TRACK(true, true),
    DISABLED(false, false);
    
    public final boolean mRepeatContext;
    public final boolean mRepeatTrack;

    private RepeatState(boolean z, boolean z2) {
        this.mRepeatContext = z;
        this.mRepeatTrack = z2;
    }
}
