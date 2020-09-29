package defpackage;

import android.content.Context;

/* renamed from: jly reason: default package */
public final class jly implements wig<jlx> {
    private final wzi<Context> a;

    private jly(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static jly a(wzi<Context> wzi) {
        return new jly(wzi);
    }

    public final /* synthetic */ Object get() {
        return new jlx((Context) this.a.get());
    }
}
