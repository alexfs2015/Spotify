package defpackage;

import android.content.Context;

/* renamed from: qyp reason: default package */
public final class qyp implements wig<Boolean> {
    private final wzi<Context> a;

    private qyp(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static qyp a(wzi<Context> wzi) {
        return new qyp(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jvi.c((Context) this.a.get()));
    }
}
