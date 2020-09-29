package defpackage;

import android.content.Context;

/* renamed from: jbv reason: default package */
public final class jbv implements wig<jbr> {
    private final wzi<Context> a;
    private final wzi<izr> b;
    private final wzi<izt> c;
    private final wzi<jam> d;
    private final wzi<jar> e;
    private final wzi<jaw> f;

    private jbv(wzi<Context> wzi, wzi<izr> wzi2, wzi<izt> wzi3, wzi<jam> wzi4, wzi<jar> wzi5, wzi<jaw> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static jbr a(Context context, izr izr, izt izt, jam jam, jar jar, jaw jaw) {
        return (jbr) wil.a(jbu.a(context, izr, izt, jam, jar, jaw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static jbv a(wzi<Context> wzi, wzi<izr> wzi2, wzi<izt> wzi3, wzi<jam> wzi4, wzi<jar> wzi5, wzi<jaw> wzi6) {
        jbv jbv = new jbv(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return jbv;
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get(), (izr) this.b.get(), (izt) this.c.get(), (jam) this.d.get(), (jar) this.e.get(), (jaw) this.f.get());
    }
}
