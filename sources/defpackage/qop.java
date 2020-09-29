package defpackage;

import android.content.Context;

/* renamed from: qop reason: default package */
public final class qop implements wig<qoo> {
    private final wzi<ftm> a;
    private final wzi<Context> b;
    private final wzi<gbp> c;

    private qop(wzi<ftm> wzi, wzi<Context> wzi2, wzi<gbp> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qop a(wzi<ftm> wzi, wzi<Context> wzi2, wzi<gbp> wzi3) {
        return new qop(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new qoo((ftm) this.a.get(), (Context) this.b.get(), (gbp) this.c.get());
    }
}
