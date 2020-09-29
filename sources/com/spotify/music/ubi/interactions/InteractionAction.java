package com.spotify.music.ubi.interactions;

public enum InteractionAction {
    LIKE("like"),
    UNLIKE("unlike"),
    FOLLOW("follow"),
    UNFOLLOW("unfollow");
    
    public final String mLogString;

    private InteractionAction(String str) {
        this.mLogString = str;
    }
}
