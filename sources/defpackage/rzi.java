package defpackage;

import android.content.Context;

/* renamed from: rzi reason: default package */
public final class rzi implements wig<rzh> {
    private final wzi<Context> a;

    private rzi(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static rzi a(wzi<Context> wzi) {
        return new rzi(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rzh((Context) this.a.get());
    }
}
