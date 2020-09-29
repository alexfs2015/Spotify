package defpackage;

import java.util.Random;

/* renamed from: kut reason: default package */
public final class kut implements vua<kus> {
    private final wlc<Random> a;

    private kut(wlc<Random> wlc) {
        this.a = wlc;
    }

    public static kut a(wlc<Random> wlc) {
        return new kut(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kus((Random) this.a.get());
    }
}
