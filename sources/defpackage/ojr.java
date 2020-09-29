package defpackage;

import android.os.Bundle;

/* renamed from: ojr reason: default package */
public final class ojr implements vua<String> {
    private final wlc<Bundle> a;

    private ojr(wlc<Bundle> wlc) {
        this.a = wlc;
    }

    public static ojr a(wlc<Bundle> wlc) {
        return new ojr(wlc);
    }

    public static String a(Bundle bundle) {
        return (String) vuf.a(bundle.getString("key_playlist_uri"), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
