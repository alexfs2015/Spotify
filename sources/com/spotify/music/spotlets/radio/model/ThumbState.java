package com.spotify.music.spotlets.radio.model;

import com.comscore.android.id.IdHelperAndroid;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

public enum ThumbState {
    NONE(IdHelperAndroid.NO_ID_AVAILABLE, IdHelperAndroid.NO_ID_AVAILABLE, FeedbackState.NONE),
    UP(PlayerTrack.TRACK_THUMB_STATE_UP, "ups", FeedbackState.POSITIVE),
    DOWN(PlayerTrack.TRACK_THUMB_STATE_DOWN, "downs", FeedbackState.NEGATIVE);
    
    public final String mApolloValue;
    private final FeedbackState mFeedbackState;
    public final String mPlayerValue;

    private ThumbState(String str, String str2, FeedbackState feedbackState) {
        this.mPlayerValue = str;
        this.mApolloValue = str2;
        this.mFeedbackState = feedbackState;
    }

    public static ThumbState a(String str) {
        if (UP.mPlayerValue.equals(str)) {
            return UP;
        }
        if (DOWN.mPlayerValue.equals(str)) {
            return DOWN;
        }
        return NONE;
    }
}
