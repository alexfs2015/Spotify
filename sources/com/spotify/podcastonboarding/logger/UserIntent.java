package com.spotify.podcastonboarding.logger;

public enum UserIntent {
    NAVIGATE_FORWARD("navigate-forward"),
    SELECT_DISABLE("select-disable"),
    SELECT_ENABLE("select-enable"),
    SKIP("skip"),
    SKIP_DISMISS("dismiss");
    
    public final String mIntent;

    private UserIntent(String str) {
        this.mIntent = str;
    }
}
