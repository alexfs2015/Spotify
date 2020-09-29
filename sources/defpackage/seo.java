package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: seo reason: default package */
public final class seo implements sez {
    private final sfn a;
    private final sfb b;
    private final Scheduler c;

    public final /* synthetic */ Object apply(Object obj) {
        sgh sgh = (sgh) obj;
        return this.a.a(sgh).c().e(10, TimeUnit.SECONDS, this.c).d((Function<? super Throwable, ? extends T>) new $$Lambda$seo$amjpBsnmBEUTppC_xEH8ga4Wcwc<Object,Object>(sgh)).c((Function<? super T, ? extends R>) this.b);
    }

    seo(sfn sfn, sfb sfb, Scheduler scheduler) {
        this.a = (sfn) fay.a(sfn);
        this.b = (sfb) fay.a(sfb);
        this.c = (Scheduler) fay.a(scheduler);
    }
}
