package com.spotify.mobile.android.ui.activity.upsell;

import com.spotify.music.libs.viewuri.ViewUris;

public enum Reason {
    NO_UPSELL("no-upsell", ViewUris.aQ),
    BAD_TYPE("bad type", ViewUris.aQ),
    USER_REQUEST("user-initiated", ViewUris.aQ);
    
    public final String mAdSlotName;
    private final sih mViewUri;

    private Reason(String str, sih sih) {
        this.mAdSlotName = str;
        this.mViewUri = sih;
    }
}
