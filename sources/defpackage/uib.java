package defpackage;

import android.content.Context;

/* renamed from: uib reason: default package */
public final class uib implements wig<uia> {
    private final wzi<Context> a;
    private final wzi<shg> b;

    private uib(wzi<Context> wzi, wzi<shg> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uib a(wzi<Context> wzi, wzi<shg> wzi2) {
        return new uib(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new uia((Context) this.a.get(), (shg) this.b.get());
    }
}
