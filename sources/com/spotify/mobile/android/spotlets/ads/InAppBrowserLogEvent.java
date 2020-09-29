package com.spotify.mobile.android.spotlets.ads;

import java.util.Locale;

public enum InAppBrowserLogEvent {
    OPENED,
    CLOSED,
    PAGE_LOADED,
    ERROR;

    public final String a() {
        return name().toLowerCase(Locale.US);
    }
}
