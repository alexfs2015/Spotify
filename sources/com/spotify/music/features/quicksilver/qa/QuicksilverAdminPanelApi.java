package com.spotify.music.features.quicksilver.qa;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.Single;

public final class QuicksilverAdminPanelApi {
    public final pzi a;
    private final SpSharedPreferences<Object> b;

    public enum MessageState {
        TRANSLATING,
        PENDING_QA,
        APPROVED,
        REJECTED
    }

    public Single<String> a(boolean z, String str) {
        return this.a.a(a(), str, z ? "approve" : "reject");
    }

    public String a() {
        return this.b.a(qbb.i, false) ? "quicksilveradmindev" : "quicksilveradmin";
    }
}
