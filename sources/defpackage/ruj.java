package defpackage;

import android.content.Context;

/* renamed from: ruj reason: default package */
public final class ruj implements wig<rui> {
    private final wzi<Context> a;
    private final wzi<rvn> b;
    private final wzi<rwe> c;

    private ruj(wzi<Context> wzi, wzi<rvn> wzi2, wzi<rwe> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ruj a(wzi<Context> wzi, wzi<rvn> wzi2, wzi<rwe> wzi3) {
        return new ruj(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new rui((Context) this.a.get(), (rvn) this.b.get(), (rwe) this.c.get());
    }
}
