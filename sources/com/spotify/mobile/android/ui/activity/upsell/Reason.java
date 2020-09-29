package com.spotify.mobile.android.ui.activity.upsell;

import com.spotify.music.libs.viewuri.ViewUris;

public enum Reason {
    NO_UPSELL("no-upsell", ViewUris.aP),
    BAD_TYPE("bad type", ViewUris.aP),
    USER_REQUEST("user-initiated", ViewUris.aP);
    
    public final String mAdSlotName;
    private final sso mViewUri;

    private Reason(String str, sso sso) {
        this.mAdSlotName = str;
        this.mViewUri = sso;
    }
}
