package defpackage;

import android.os.Bundle;

/* renamed from: pxr reason: default package */
public final class pxr implements vua<a> {
    private final wlc<Bundle> a;

    private pxr(wlc<Bundle> wlc) {
        this.a = wlc;
    }

    public static pxr a(wlc<Bundle> wlc) {
        return new pxr(wlc);
    }

    public static a a(Bundle bundle) {
        return (a) vuf.a(CC.b(bundle), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
