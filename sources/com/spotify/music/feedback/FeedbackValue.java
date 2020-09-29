package com.spotify.music.feedback;

import com.spotify.mobile.android.spotlets.ads.model.Ad;

public enum FeedbackValue {
    ON("1"),
    OFF(Ad.DEFAULT_SKIPPABLE_AD_DELAY),
    UNDEFINED(null);
    
    final String mFeedbackValue;

    private FeedbackValue(String str) {
        this.mFeedbackValue = str;
    }

    public static FeedbackValue a(String str) {
        return ON.mFeedbackValue.equals(str) ? ON : OFF.mFeedbackValue.equals(str) ? OFF : UNDEFINED;
    }
}
