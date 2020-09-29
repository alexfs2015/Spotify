package defpackage;

import java.util.Set;

/* renamed from: tjw reason: default package */
public final class tjw implements vua<tjv> {
    private final wlc<Set<tjx>> a;

    private tjw(wlc<Set<tjx>> wlc) {
        this.a = wlc;
    }

    public static tjw a(wlc<Set<tjx>> wlc) {
        return new tjw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tjv((Set) this.a.get());
    }
}
