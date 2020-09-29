package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;

/* renamed from: sdw reason: default package */
public final class sdw {
    private final Flowable<kxx> a;
    private final Flowable<sfa> b;
    private final sex c;
    private final sdc d = new sdc();
    private final sgx e;
    private final lky f;
    private final vim<gzz> g;
    private final sfe h;

    public sdw(Observable<kxx> observable, Observable<sfa> observable2, sex sex, sgx sgx, lky lky, vim<gzz> vim, sfe sfe) {
        this.a = observable.a(BackpressureStrategy.LATEST);
        this.b = observable2.a(BackpressureStrategy.LATEST);
        this.c = (sex) fay.a(sex);
        this.e = (sgx) fay.a(sgx);
        this.f = (lky) fay.a(lky);
        this.g = (vim) fay.a(vim);
        this.h = sfe;
    }

    public final Flowable<gzz> a(Flowable<sge> flowable) {
        return Flowable.a((wrf<? extends T1>) flowable, (wrf<? extends T2>) this.b, (wrf<? extends T3>) this.a, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$k8RfaWPvLkG36Hx1orbQmO9wFio.INSTANCE).a((Consumer<? super T>) new $$Lambda$sdw$VLZcpk6KYEWYt3tAsYiriCoxl3s<Object>(this)).a((FlowableTransformer<? super T, ? extends R>) new het<Object,Object>(this.c, this.d)).a(vun.a((c<T, R>) this.f)).c((Function<? super T, ? extends R>) this.e).a((FlowableTransformer<? super T, ? extends R>) this.g);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sgd sgd) {
        this.h.a(sgd.e);
    }
}
