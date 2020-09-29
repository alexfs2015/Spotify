package defpackage;

/* renamed from: gik reason: default package */
public final class gik implements vua<gij> {
    private final wlc<b> a;

    private gik(wlc<b> wlc) {
        this.a = wlc;
    }

    public static gik a(wlc<b> wlc) {
        return new gik(wlc);
    }

    public final /* synthetic */ Object get() {
        return new gij((b) this.a.get());
    }
}
