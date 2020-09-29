package defpackage;

import android.content.Context;

/* renamed from: ftn reason: default package */
public final class ftn implements wig<ftm> {
    private final wzi<Context> a;

    private ftn(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static ftn a(wzi<Context> wzi) {
        return new ftn(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ftm((Context) this.a.get());
    }
}
