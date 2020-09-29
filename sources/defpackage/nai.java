package defpackage;

import android.content.Context;

/* renamed from: nai reason: default package */
public final class nai implements wig<nah> {
    private final wzi<Context> a;

    private nai(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static nai a(wzi<Context> wzi) {
        return new nai(wzi);
    }

    public final /* synthetic */ Object get() {
        return new nah((Context) this.a.get());
    }
}
