package defpackage;

import android.content.Context;

/* renamed from: iyp reason: default package */
public final class iyp implements wig<Boolean> {
    private final wzi<Context> a;

    private iyp(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static iyp a(wzi<Context> wzi) {
        return new iyp(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jvi.c((Context) this.a.get()));
    }
}
