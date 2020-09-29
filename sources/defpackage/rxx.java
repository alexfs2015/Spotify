package defpackage;

import android.content.Context;

/* renamed from: rxx reason: default package */
public final class rxx implements wig<rxw> {
    private final wzi<Context> a;

    private rxx(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static rxx a(wzi<Context> wzi) {
        return new rxx(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rxw((Context) this.a.get());
    }
}
