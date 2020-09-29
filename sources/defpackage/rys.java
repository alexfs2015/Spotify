package defpackage;

import android.content.Context;

/* renamed from: rys reason: default package */
public final class rys implements wig<ryr> {
    private final wzi<Context> a;
    private final wzi<ryu> b;

    private rys(wzi<Context> wzi, wzi<ryu> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rys a(wzi<Context> wzi, wzi<ryu> wzi2) {
        return new rys(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ryr((Context) this.a.get(), (ryu) this.b.get());
    }
}
