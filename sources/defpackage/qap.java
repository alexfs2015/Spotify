package defpackage;

import java.util.Set;

/* renamed from: qap reason: default package */
public final class qap implements vua<qao> {
    private final wlc<Set<a>> a;
    private final wlc<Set<b>> b;

    private qap(wlc<Set<a>> wlc, wlc<Set<b>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qap a(wlc<Set<a>> wlc, wlc<Set<b>> wlc2) {
        return new qap(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qao((Set) this.a.get(), (Set) this.b.get());
    }
}
