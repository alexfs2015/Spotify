package defpackage;

import android.content.Context;

/* renamed from: qkx reason: default package */
public final class qkx implements wig<qkw> {
    private final wzi<Context> a;
    private final wzi<fqn> b;
    private final wzi<srn> c;
    private final wzi<Boolean> d;
    private final wzi<Boolean> e;

    private qkx(wzi<Context> wzi, wzi<fqn> wzi2, wzi<srn> wzi3, wzi<Boolean> wzi4, wzi<Boolean> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static qkx a(wzi<Context> wzi, wzi<fqn> wzi2, wzi<srn> wzi3, wzi<Boolean> wzi4, wzi<Boolean> wzi5) {
        qkx qkx = new qkx(wzi, wzi2, wzi3, wzi4, wzi5);
        return qkx;
    }

    public final /* synthetic */ Object get() {
        qkw qkw = new qkw((Context) this.a.get(), (fqn) this.b.get(), (srn) this.c.get(), ((Boolean) this.d.get()).booleanValue(), ((Boolean) this.e.get()).booleanValue());
        return qkw;
    }
}
