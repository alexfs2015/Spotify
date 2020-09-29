package defpackage;

import android.content.Context;

/* renamed from: rfp reason: default package */
public final class rfp implements wig<rfo> {
    private final wzi<Context> a;

    private rfp(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static rfp a(wzi<Context> wzi) {
        return new rfp(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rfo((Context) this.a.get());
    }
}
