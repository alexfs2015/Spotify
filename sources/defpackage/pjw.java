package defpackage;

import android.content.Context;

/* renamed from: pjw reason: default package */
public final class pjw implements wig<pjv> {
    private final wzi<Context> a;
    private final wzi<ujp> b;

    private pjw(wzi<Context> wzi, wzi<ujp> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pjw a(wzi<Context> wzi, wzi<ujp> wzi2) {
        return new pjw(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new pjv((Context) this.a.get(), (ujp) this.b.get());
    }
}
