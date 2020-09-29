package defpackage;

import android.content.Context;

/* renamed from: rgn reason: default package */
public final class rgn implements wig<rgm> {
    private final wzi<Context> a;

    private rgn(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static rgn a(wzi<Context> wzi) {
        return new rgn(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rgm((Context) this.a.get());
    }
}
