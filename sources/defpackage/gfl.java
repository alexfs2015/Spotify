package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableSet;
import java.io.IOException;
import java.util.List;

/* renamed from: gfl reason: default package */
final class gfl implements Runnable {
    private final List<gfp> a;
    private final gfu b;

    gfl(List<gfp> list, gfu gfu) {
        this.a = list;
        this.b = gfu;
    }

    private gfo a(a aVar, List<gff> list) {
        try {
            return aVar.publish(list);
        } catch (IOException e) {
            this.b.a("Error publishing events: %s", e.getMessage());
            return gfo.c().a(true).a();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(List list, Integer num) {
        return num.intValue() >= 0 && num.intValue() < list.size();
    }

    public final void run() {
        try {
            for (gfp gfp : this.a) {
                List a2 = gfp.a();
                while (true) {
                    if (!a2.isEmpty()) {
                        gfo a3 = a(gfp.b(), a2);
                        ImmutableSet a4 = ImmutableSet.a(fcp.a((Iterable<E>) a3.a()).a((fbq<? super E>) new $$Lambda$gfl$tmG5pCN2vpl1d9NEXgxecd6Tck<Object>(a2)).a((Function<? super E, T>) new $$Lambda$gfl$ITqTBJjPY20YlSmzCElCcg5mI1k<Object,T>(a2)).a());
                        StringBuilder sb = new StringBuilder();
                        sb.append(a4.size());
                        sb.append(" Events to be deleted from DB: ");
                        sb.append(fbl.a(" ").a((Iterable<?>) a4));
                        gfp.a(a4);
                        if (!a3.b()) {
                            a2 = gfp.a();
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            this.b.a(th, "Exception during periodic event sync");
        }
    }
}
