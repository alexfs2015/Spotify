package defpackage;

import android.content.res.Resources;

/* renamed from: ukz reason: default package */
public final class ukz implements wig<uky> {
    private final wzi<Resources> a;
    private final wzi<ukp> b;

    private ukz(wzi<Resources> wzi, wzi<ukp> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ukz a(wzi<Resources> wzi, wzi<ukp> wzi2) {
        return new ukz(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new uky((Resources) this.a.get(), (ukp) this.b.get());
    }
}
