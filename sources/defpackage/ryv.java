package defpackage;

import android.content.Context;

/* renamed from: ryv reason: default package */
public final class ryv implements wig<ryu> {
    private final wzi<Context> a;
    private final wzi<a> b;

    private ryv(wzi<Context> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ryv a(wzi<Context> wzi, wzi<a> wzi2) {
        return new ryv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ryu(this.a, this.b);
    }
}
