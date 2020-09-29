package defpackage;

import android.content.Context;

/* renamed from: rjp reason: default package */
public final class rjp implements wig<rjo> {
    private final wzi<Context> a;

    private rjp(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static rjp a(wzi<Context> wzi) {
        return new rjp(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rjo((Context) this.a.get());
    }
}
