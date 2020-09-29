package defpackage;

import android.content.Context;

/* renamed from: rfn reason: default package */
public final class rfn implements wig<rfm> {
    private final wzi<Context> a;
    private final wzi<jyg> b;

    private rfn(wzi<Context> wzi, wzi<jyg> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rfn a(wzi<Context> wzi, wzi<jyg> wzi2) {
        return new rfn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rfm((Context) this.a.get(), (jyg) this.b.get());
    }
}
