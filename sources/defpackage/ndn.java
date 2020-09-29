package defpackage;

import android.content.res.Resources;

/* renamed from: ndn reason: default package */
public final class ndn implements wig<ndm> {
    private final wzi<Resources> a;

    private ndn(wzi<Resources> wzi) {
        this.a = wzi;
    }

    public static ndn a(wzi<Resources> wzi) {
        return new ndn(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ndm((Resources) this.a.get());
    }
}
