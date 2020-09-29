package defpackage;

import android.content.Context;

/* renamed from: txg reason: default package */
public final class txg implements wig<txf> {
    private final wzi<Context> a;

    private txg(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static txg a(wzi<Context> wzi) {
        return new txg(wzi);
    }

    public final /* synthetic */ Object get() {
        return new txf((Context) this.a.get());
    }
}
