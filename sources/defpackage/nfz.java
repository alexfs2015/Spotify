package defpackage;

import android.os.Bundle;

/* renamed from: nfz reason: default package */
public final class nfz implements vua<String> {
    private final wlc<Bundle> a;

    private nfz(wlc<Bundle> wlc) {
        this.a = wlc;
    }

    public static nfz a(wlc<Bundle> wlc) {
        return new nfz(wlc);
    }

    public static String a(Bundle bundle) {
        return (String) vuf.a(CC.a(bundle), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
