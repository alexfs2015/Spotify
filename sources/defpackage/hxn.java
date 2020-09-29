package defpackage;

import android.app.Application;

/* renamed from: hxn reason: default package */
public final class hxn implements wig<hxm> {
    private final wzi<Application> a;
    private final wzi<ujq> b;
    private final wzi<ujs> c;

    private hxn(wzi<Application> wzi, wzi<ujq> wzi2, wzi<ujs> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hxn a(wzi<Application> wzi, wzi<ujq> wzi2, wzi<ujs> wzi3) {
        return new hxn(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new hxm((Application) this.a.get(), (ujq) this.b.get(), (ujs) this.c.get());
    }
}
