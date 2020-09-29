package defpackage;

import android.content.Context;

/* renamed from: qkd reason: default package */
public final class qkd implements wig<qkc> {
    private final wzi<Context> a;
    private final wzi<jpc> b;
    private final wzi<a> c;
    private final wzi<has> d;

    private qkd(wzi<Context> wzi, wzi<jpc> wzi2, wzi<a> wzi3, wzi<has> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qkd a(wzi<Context> wzi, wzi<jpc> wzi2, wzi<a> wzi3, wzi<has> wzi4) {
        return new qkd(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new qkc((Context) this.a.get(), (jpc) this.b.get(), (a) this.c.get(), (has) this.d.get());
    }
}
