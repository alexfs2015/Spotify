package com.spotify.mobile.android.spotlets.ads;

import com.spotify.mobile.android.spotlets.ads.model.Ad;

public enum AdsProductState {
    ENABLED("1"),
    DISABLED(Ad.DEFAULT_SKIPPABLE_AD_DELAY);
    
    public final String mValue;

    private AdsProductState(String str) {
        this.mValue = str;
    }
}
