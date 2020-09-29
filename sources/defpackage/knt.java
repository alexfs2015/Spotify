package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: knt reason: default package */
public final class knt {
    public static <M, F, FI> kns<M, F, FI> a(final knx<FI, F> knx) {
        return new kns<M, F, FI>() {
            public final kng<M, F> a(M m, boolean z, Set<FI> set) {
                if (set.isEmpty()) {
                    return z ? kng.b(m) : kng.e();
                }
                HashSet hashSet = new HashSet();
                for (FI apply : set) {
                    hashSet.add(koa.a(((knx) koa.a(knx)).apply(apply)));
                }
                return z ? kng.a(m, hashSet) : kng.a((Set<? extends F>) hashSet);
            }
        };
    }
}
