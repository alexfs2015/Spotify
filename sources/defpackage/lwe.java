package defpackage;

import android.content.Context;

/* renamed from: lwe reason: default package */
public final class lwe implements wig<lwd> {
    private final wzi<Context> a;
    private final wzi<fqn> b;

    private lwe(wzi<Context> wzi, wzi<fqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lwe a(wzi<Context> wzi, wzi<fqn> wzi2) {
        return new lwe(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new lwd((Context) this.a.get(), (fqn) this.b.get());
    }
}
