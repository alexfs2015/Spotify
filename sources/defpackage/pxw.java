package defpackage;

import android.os.Bundle;

/* renamed from: pxw reason: default package */
public final class pxw implements vua<b> {
    private final wlc<Bundle> a;

    private pxw(wlc<Bundle> wlc) {
        this.a = wlc;
    }

    public static pxw a(wlc<Bundle> wlc) {
        return new pxw(wlc);
    }

    public static b a(Bundle bundle) {
        return (b) vuf.a(CC.a(bundle), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
