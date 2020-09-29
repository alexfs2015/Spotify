package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import java.io.IOException;

/* renamed from: sca reason: default package */
final class sca implements FlowableTransformer<xgo<xam>, hcs> {
    private final scc a;
    private final scf b;
    private final Scheduler c;

    public sca(scc scc, scf scf, Scheduler scheduler) {
        this.a = scc;
        this.b = scf;
        this.c = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(xgo xgo) {
        xam xam = (xam) xgo.b();
        if (xam != null) {
            try {
                xcs c2 = xam.c();
                c2.b(2147483647L);
                byte[] i = c2.b().t().i();
                if (i.length > 0) {
                    this.a.a(i);
                }
            } catch (IOException e) {
                Assertion.a("Failed to get response bytes", (Throwable) e);
            }
        }
    }

    public final /* synthetic */ xfk apply(Flowable flowable) {
        return this.a.a().b().a((xfk<? extends T>) flowable.a((Consumer<? super T>) new $$Lambda$sca$xlJ72rwLUri1iYpLRNXKmREHwSA<Object>(this)).a((FlowableTransformer<? super T, ? extends R>) this.b)).b((xfk<? extends T>) flowable.a((FlowableTransformer<? super T, ? extends R>) this.b)).b(this.c);
    }
}
