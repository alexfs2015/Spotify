package defpackage;

import java.util.Random;

/* renamed from: rlb reason: default package */
public final class rlb implements vua<rla> {
    private final wlc<Random> a;

    private rlb(wlc<Random> wlc) {
        this.a = wlc;
    }

    public static rlb a(wlc<Random> wlc) {
        return new rlb(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rla((Random) this.a.get());
    }
}
