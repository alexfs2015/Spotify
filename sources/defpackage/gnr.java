package defpackage;

import android.content.Context;

/* renamed from: gnr reason: default package */
public final class gnr implements wig<gnq> {
    private final wzi<ftm> a;
    private final wzi<Context> b;
    private final wzi<a> c;

    private gnr(wzi<ftm> wzi, wzi<Context> wzi2, wzi<a> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static gnr a(wzi<ftm> wzi, wzi<Context> wzi2, wzi<a> wzi3) {
        return new gnr(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new gnq((ftm) this.a.get(), (Context) this.b.get(), (a) this.c.get());
    }
}
