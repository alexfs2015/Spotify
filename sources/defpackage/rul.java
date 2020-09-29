package defpackage;

import java.util.Set;

/* renamed from: rul reason: default package */
public final class rul implements vua<ruk> {
    private final wlc<Set<rum>> a;

    private rul(wlc<Set<rum>> wlc) {
        this.a = wlc;
    }

    public static rul a(wlc<Set<rum>> wlc) {
        return new rul(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ruk((Set) this.a.get());
    }
}
