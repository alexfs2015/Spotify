package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: gdt reason: default package */
public final class gdt implements gee {
    private final gfr a;
    private final gdv b;
    private final gej c;
    private final a d;
    private final boolean e;

    gdt(gfr gfr, gdv gdv, a aVar, gej gej, boolean z) {
        this.a = gfr;
        this.b = gdv;
        this.d = aVar;
        this.c = gej;
        this.e = z;
    }

    public final List<gdu> a() {
        List a2 = this.a.a(20, this.e);
        if (a2.size() <= 0) {
            return Collections.emptyList();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a2.size());
        sb.append(this.e ? " Authenticated" : " Non authenticated");
        sb.append(" events to be sent to server: ");
        sb.append(fau.a(" ").a((Iterable<?>) fbx.a((Iterable<E>) a2).a((Function<? super E, T>) $$Lambda$gdt$Ke83rk2KhimoGqxHIT59dH81R24.INSTANCE)));
        fbx a3 = fbx.a((Iterable<E>) a2);
        gdv gdv = this.b;
        gdv.getClass();
        return ImmutableList.a(a3.a((Function<? super E, T>) new $$Lambda$1DC7qgXtHMsxlrsuD679FR91qI<Object,T>(gdv)).a());
    }

    public final void a(Set<Long> set) {
        this.a.a((Collection<Long>) set);
    }

    public final a b() {
        return this.d;
    }
}
