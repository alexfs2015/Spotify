package com.spotify.music.features.tasteonboarding.logging;

public enum Intent {
    CLEAR("clear"),
    DONE_COMPLETE("done-complete"),
    DONE_INCOMPLETE("done-incomplete"),
    LIKE_TRACK("like-enable"),
    PLAY("play"),
    NAVIGATE_BACK("navigate-back"),
    NAVIGATE_FORWARD("navigate-forward"),
    SEARCH("search"),
    SELECT_DISABLE("select-disable"),
    SELECT_ENABLE("select-enable"),
    SELECT_GENRE("select-genre"),
    SKIP("dismiss"),
    SKIP_TRACK("skip");
    
    public final String mIntent;

    private Intent(String str) {
        this.mIntent = str;
    }
}
