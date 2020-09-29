package com.facebook.share.internal;

public enum ShareStoryFeature implements aly {
    SHARE_STORY_ASSET(20170417);
    
    private int minVersion;

    public final String a() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }

    private ShareStoryFeature(int i) {
        this.minVersion = 20170417;
    }

    public final int b() {
        return this.minVersion;
    }
}
