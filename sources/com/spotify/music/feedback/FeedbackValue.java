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
        if (ON.mFeedbackValue.equals(str)) {
            return ON;
        }
        if (OFF.mFeedbackValue.equals(str)) {
            return OFF;
        }
        return UNDEFINED;
    }
}
