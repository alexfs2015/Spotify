package defpackage;

import android.content.Context;

/* renamed from: hgc reason: default package */
public final class hgc implements wig<hgb> {
    private final wzi<Context> a;

    private hgc(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static hgc a(wzi<Context> wzi) {
        return new hgc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new hgb((Context) this.a.get());
    }
}
