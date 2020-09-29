package defpackage;

import android.content.Context;

/* renamed from: uqi reason: default package */
public final class uqi implements wig<uqh> {
    private final wzi<Context> a;

    private uqi(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static uqi a(wzi<Context> wzi) {
        return new uqi(wzi);
    }

    public final /* synthetic */ Object get() {
        return new uqh((Context) this.a.get());
    }
}
