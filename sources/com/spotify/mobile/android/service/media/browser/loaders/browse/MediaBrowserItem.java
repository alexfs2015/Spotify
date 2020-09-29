package com.spotify.mobile.android.service.media.browser.loaders.browse;

import android.net.Uri;
import android.os.Bundle;

public final class MediaBrowserItem {
    public final String a;
    public final ActionType b;
    public final String c;
    public final String d;
    public final Uri e;
    public final Uri f;
    public final boolean g;
    public final boolean h;
    public final Bundle i;
    private final String j;

    public enum ActionType {
        PLAYABLE,
        BROWSABLE,
        NONE
    }

    public MediaBrowserItem(String str, String str2, String str3, Uri uri, Uri uri2, ActionType actionType, String str4, boolean z, boolean z2, Bundle bundle) {
        this.a = (String) fbp.a(str);
        this.b = actionType;
        this.c = str2;
        this.d = str3;
        this.e = uri;
        this.f = uri2;
        this.j = str4;
        this.g = z;
        this.h = z2;
        this.i = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaBrowserItem)) {
            return false;
        }
        return this.a.equals(((MediaBrowserItem) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
