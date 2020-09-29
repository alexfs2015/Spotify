package defpackage;

import android.content.res.Resources;

/* renamed from: pku reason: default package */
public final class pku implements wig<pkt> {
    private final wzi<Resources> a;

    private pku(wzi<Resources> wzi) {
        this.a = wzi;
    }

    public static pku a(wzi<Resources> wzi) {
        return new pku(wzi);
    }

    public final /* synthetic */ Object get() {
        return new pkt((Resources) this.a.get());
    }
}
