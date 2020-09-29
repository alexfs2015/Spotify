package defpackage;

import android.content.Context;

/* renamed from: qtk reason: default package */
public final class qtk implements wig<qtj> {
    private final wzi<Context> a;
    private final wzi<a> b;
    private final wzi<qra> c;

    private qtk(wzi<Context> wzi, wzi<a> wzi2, wzi<qra> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qtk a(wzi<Context> wzi, wzi<a> wzi2, wzi<qra> wzi3) {
        return new qtk(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new qtj((Context) this.a.get(), (a) this.b.get(), (qra) this.c.get());
    }
}
