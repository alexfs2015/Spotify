package defpackage;

import android.os.Bundle;

/* renamed from: nkt reason: default package */
public final class nkt implements vua<String> {
    private final wlc<Bundle> a;

    private nkt(wlc<Bundle> wlc) {
        this.a = wlc;
    }

    public static nkt a(wlc<Bundle> wlc) {
        return new nkt(wlc);
    }

    public static String a(Bundle bundle) {
        return (String) vuf.a(bundle.getString("key_home_mix_uri"), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
