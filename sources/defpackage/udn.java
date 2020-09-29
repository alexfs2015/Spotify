package defpackage;

import android.content.Context;

/* renamed from: udn reason: default package */
public final class udn implements vua<udm> {
    private final wlc<Context> a;

    private udn(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static udn a(wlc<Context> wlc) {
        return new udn(wlc);
    }

    public final /* synthetic */ Object get() {
        return new udm((Context) this.a.get());
    }
}
