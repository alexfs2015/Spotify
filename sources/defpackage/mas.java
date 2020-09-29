package defpackage;

import android.content.Context;

/* renamed from: mas reason: default package */
public final class mas implements vua<mar> {
    private final wlc<Context> a;
    private final wlc<ood> b;
    private final wlc<a<ooa>> c;
    private final wlc<oob> d;

    private mas(wlc<Context> wlc, wlc<ood> wlc2, wlc<a<ooa>> wlc3, wlc<oob> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mas a(wlc<Context> wlc, wlc<ood> wlc2, wlc<a<ooa>> wlc3, wlc<oob> wlc4) {
        return new mas(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new mar(this.a, this.b, this.c, this.d);
    }
}
