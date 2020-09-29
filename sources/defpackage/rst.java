package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import java.io.IOException;

/* renamed from: rst reason: default package */
final class rst implements FlowableTransformer<wsj<wmg>, gzz> {
    private final rsv a;
    private final rsy b;
    private final Scheduler c;

    public rst(rsv rsv, rsy rsy, Scheduler scheduler) {
        this.a = rsv;
        this.b = rsy;
        this.c = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(wsj wsj) {
        wmg wmg = (wmg) wsj.b();
        if (wmg != null) {
            try {
                wom c2 = wmg.c();
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

    public final /* synthetic */ wrf apply(Flowable flowable) {
        return this.a.a().b().a((wrf<? extends T>) flowable.a((Consumer<? super T>) new $$Lambda$rst$rkXv9wul4wnMiZYA3fawnLBxOLE<Object>(this)).a((FlowableTransformer<? super T, ? extends R>) this.b)).b((wrf<? extends T>) flowable.a((FlowableTransformer<? super T, ? extends R>) this.b)).b(this.c);
    }
}
