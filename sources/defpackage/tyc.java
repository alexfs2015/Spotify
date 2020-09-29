package defpackage;

import android.content.Context;

/* renamed from: tyc reason: default package */
public final class tyc implements wig<tyb> {
    private final wzi<Context> a;

    private tyc(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static tyc a(wzi<Context> wzi) {
        return new tyc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tyb((Context) this.a.get());
    }
}
