package defpackage;

import android.content.Context;

/* renamed from: szm reason: default package */
public final class szm implements wig<szl> {
    private final wzi<Context> a;

    private szm(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static szm a(wzi<Context> wzi) {
        return new szm(wzi);
    }

    public final /* synthetic */ Object get() {
        return new szl((Context) this.a.get());
    }
}
