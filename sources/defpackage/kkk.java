package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: kkk reason: default package */
public final class kkk {
    public static <M, F, FI> kkj<M, F, FI> a(final kko<FI, F> kko) {
        return new kkj<M, F, FI>() {
            public final kjx<M, F> a(M m, boolean z, Set<FI> set) {
                if (set.isEmpty()) {
                    return z ? kjx.b(m) : kjx.e();
                }
                HashSet hashSet = new HashSet();
                for (FI apply : set) {
                    hashSet.add(kkr.a(((kko) kkr.a(kko)).apply(apply)));
                }
                if (z) {
                    return kjx.a(m, hashSet);
                }
                return kjx.a((Set<? extends F>) hashSet);
            }
        };
    }
}
