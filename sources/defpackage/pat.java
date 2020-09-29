package defpackage;

import android.content.Context;

/* renamed from: pat reason: default package */
public final class pat implements wig<Integer> {
    private final wzi<Context> a;

    private pat(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static pat a(wzi<Context> wzi) {
        return new pat(wzi);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(vfj.b(75.0f, ((Context) this.a.get()).getResources()));
    }
}
