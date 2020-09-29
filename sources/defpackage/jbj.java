package defpackage;

import android.content.Context;

/* renamed from: jbj reason: default package */
public final class jbj implements wig<jbi> {
    private final wzi<Context> a;
    private final wzi<b> b;
    private final wzi<a> c;
    private final wzi<jty> d;

    private jbj(wzi<Context> wzi, wzi<b> wzi2, wzi<a> wzi3, wzi<jty> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static jbj a(wzi<Context> wzi, wzi<b> wzi2, wzi<a> wzi3, wzi<jty> wzi4) {
        return new jbj(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new jbi((Context) this.a.get(), (b) this.b.get(), (a) this.c.get(), (jty) this.d.get());
    }
}
