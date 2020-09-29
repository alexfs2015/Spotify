package defpackage;

import android.content.Context;

/* renamed from: nex reason: default package */
public final class nex implements wig<Boolean> {
    private final wzi<Context> a;

    private nex(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static nex a(wzi<Context> wzi) {
        return new nex(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jvi.c((Context) this.a.get()));
    }
}
