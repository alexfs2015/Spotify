package com.spotify.mobile.android.service.media.browser;

import android.net.Uri;
import android.os.Bundle;

public final class MediaBrowserItem {
    public final String a;
    public final ActionType b;
    public final String c;
    public final String d;
    public final Uri e;
    public final boolean f;
    public final boolean g;
    public final Bundle h;
    private final String i;

    public enum ActionType {
        PLAYABLE,
        BROWSABLE,
        NONE
    }

    public MediaBrowserItem(String str, String str2, String str3, Uri uri, ActionType actionType, String str4, boolean z, boolean z2, Bundle bundle) {
        this.a = (String) fay.a(str);
        this.b = actionType;
        this.c = str2;
        this.d = str3;
        this.e = uri;
        this.i = str4;
        this.f = z;
        this.g = z2;
        this.h = bundle;
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
