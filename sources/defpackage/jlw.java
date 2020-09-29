package defpackage;

import android.content.Context;

/* renamed from: jlw reason: default package */
public final class jlw implements wig<jlv> {
    private final wzi<Context> a;
    private final wzi<hit> b;

    private jlw(wzi<Context> wzi, wzi<hit> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static jlw a(wzi<Context> wzi, wzi<hit> wzi2) {
        return new jlw(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new jlv((Context) this.a.get(), (hit) this.b.get());
    }
}
