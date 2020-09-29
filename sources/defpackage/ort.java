package defpackage;

import java.util.Set;

/* renamed from: ort reason: default package */
public final class ort implements vua<ors> {
    private final wlc<Set<orr>> a;

    private ort(wlc<Set<orr>> wlc) {
        this.a = wlc;
    }

    public static ort a(wlc<Set<orr>> wlc) {
        return new ort(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ors((Set) this.a.get());
    }
}
