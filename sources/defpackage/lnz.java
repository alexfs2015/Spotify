package defpackage;

import android.content.Context;

/* renamed from: lnz reason: default package */
public final class lnz implements wig<lny> {
    private final wzi<Context> a;

    private lnz(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static lnz a(wzi<Context> wzi) {
        return new lnz(wzi);
    }

    public final /* synthetic */ Object get() {
        return new lny((Context) this.a.get());
    }
}
