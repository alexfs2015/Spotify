package defpackage;

import android.content.Context;

/* renamed from: maf reason: default package */
public final class maf implements wig<mae> {
    private final wzi<Context> a;

    private maf(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static maf a(wzi<Context> wzi) {
        return new maf(wzi);
    }

    public final /* synthetic */ Object get() {
        return new mae((Context) this.a.get());
    }
}
