package defpackage;

import android.content.res.Resources;

/* renamed from: nyw reason: default package */
public final class nyw implements wig<nyv> {
    private final wzi<Resources> a;
    private final wzi<jui> b;

    private nyw(wzi<Resources> wzi, wzi<jui> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nyw a(wzi<Resources> wzi, wzi<jui> wzi2) {
        return new nyw(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new nyv((Resources) this.a.get(), (jui) this.b.get());
    }
}
