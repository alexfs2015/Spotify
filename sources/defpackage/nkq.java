package defpackage;

import android.os.Bundle;

/* renamed from: nkq reason: default package */
public final class nkq implements vua<osf> {
    private final wlc<Bundle> a;

    private nkq(wlc<Bundle> wlc) {
        this.a = wlc;
    }

    public static nkq a(wlc<Bundle> wlc) {
        return new nkq(wlc);
    }

    public static osf a(Bundle bundle) {
        return (osf) vuf.a(CC.a(bundle), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
