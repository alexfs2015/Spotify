package com.spotify.mobile.android.spotlets.ads.api;

import io.reactivex.Completable;
import java.util.Map;

public interface SlotApi {

    public enum Intent {
        NOW,
        NEXT_CONTEXT,
        NEXT_TRACK,
        FETCH,
        CLEAR
    }

    Completable a(String str, Intent intent);

    Completable a(String str, Intent intent, Map<String, String> map);
}
