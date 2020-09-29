package defpackage;

import android.content.Context;

/* renamed from: lcr reason: default package */
public final class lcr implements wig<Boolean> {
    private final wzi<Context> a;

    private lcr(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static lcr a(wzi<Context> wzi) {
        return new lcr(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jvi.b((Context) this.a.get()));
    }
}
