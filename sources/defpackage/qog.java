package defpackage;

import android.content.Context;

/* renamed from: qog reason: default package */
public final class qog implements wig<qof> {
    private final wzi<Context> a;
    private final wzi<jyg> b;
    private final wzi<rwl> c;

    private qog(wzi<Context> wzi, wzi<jyg> wzi2, wzi<rwl> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qog a(wzi<Context> wzi, wzi<jyg> wzi2, wzi<rwl> wzi3) {
        return new qog(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new qof((Context) this.a.get(), (jyg) this.b.get(), (rwl) this.c.get());
    }
}
