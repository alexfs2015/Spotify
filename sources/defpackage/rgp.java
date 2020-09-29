package defpackage;

import android.content.Context;

/* renamed from: rgp reason: default package */
public final class rgp implements wig<rgo> {
    private final wzi<Context> a;

    private rgp(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static rgp a(wzi<Context> wzi) {
        return new rgp(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rgo((Context) this.a.get());
    }
}
