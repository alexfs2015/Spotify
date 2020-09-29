package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: gfe reason: default package */
public final class gfe implements gfp {
    private final ghc a;
    private final gfg b;
    private final gfu c;
    private final a d;
    private final boolean e;

    gfe(ghc ghc, gfg gfg, a aVar, gfu gfu, boolean z) {
        this.a = ghc;
        this.b = gfg;
        this.d = aVar;
        this.c = gfu;
        this.e = z;
    }

    public final List<gff> a() {
        List a2 = this.a.a(20, this.e);
        if (a2.size() <= 0) {
            return Collections.emptyList();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a2.size());
        sb.append(this.e ? " Authenticated" : " Non authenticated");
        sb.append(" events to be sent to server: ");
        sb.append(fbl.a(" ").a((Iterable<?>) fcp.a((Iterable<E>) a2).a((Function<? super E, T>) $$Lambda$gfe$KmE8paGcBh2G_i7bdIWvyLRmjRM.INSTANCE)));
        fcp a3 = fcp.a((Iterable<E>) a2);
        gfg gfg = this.b;
        gfg.getClass();
        return ImmutableList.a(a3.a((Function<? super E, T>) new $$Lambda$Pj9dhUEYfBkduAhzzbMQct75i7I<Object,T>(gfg)).a());
    }

    public final void a(Set<Long> set) {
        this.a.a((Collection<Long>) set);
    }

    public final a b() {
        return this.d;
    }
}
