package defpackage;

import android.content.Context;

/* renamed from: obj reason: default package */
public final class obj implements wig<obi> {
    private final wzi<Context> a;

    private obj(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static obj a(wzi<Context> wzi) {
        return new obj(wzi);
    }

    public final /* synthetic */ Object get() {
        return new obi((Context) this.a.get());
    }
}
