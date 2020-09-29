package defpackage;

import android.content.Context;

/* renamed from: tzc reason: default package */
public final class tzc implements wig<tzb> {
    private final wzi<Context> a;

    private tzc(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static tzc a(wzi<Context> wzi) {
        return new tzc(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tzb((Context) this.a.get());
    }
}
