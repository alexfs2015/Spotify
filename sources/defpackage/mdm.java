package defpackage;

import android.content.Context;

/* renamed from: mdm reason: default package */
public final class mdm implements wig<mdl> {
    private final wzi<Context> a;

    private mdm(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static mdm a(wzi<Context> wzi) {
        return new mdm(wzi);
    }

    public final /* synthetic */ Object get() {
        return new mdl((Context) this.a.get());
    }
}
