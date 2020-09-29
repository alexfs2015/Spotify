package com.spotify.music.libs.hubslocalcache;

public enum HubsCachedFeature {
    FIND("find");
    
    public final String mCacheIdentifier;

    private HubsCachedFeature(String str) {
        this.mCacheIdentifier = str;
    }
}
