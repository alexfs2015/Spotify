package defpackage;

import java.util.Set;

/* renamed from: smz reason: default package */
public final class smz implements vua<smx> {
    private final wlc<Set<spt>> a;
    private final wlc<Set<spt>> b;

    public static smx a(Set<spt> set, Set<spt> set2) {
        return (smx) vuf.a(CC.a(set, set2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Set) this.a.get(), (Set) this.b.get());
    }
}
