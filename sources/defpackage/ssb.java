package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: ssb reason: default package */
public final class ssb {
    Disposable a = Disposables.b();
    private final szp b;
    private final rqb c;
    private final hgy d;
    private Optional<Boolean> e = Optional.e();

    public ssb(szp szp, rqb rqb, hgy hgy) {
        this.b = szp;
        this.c = rqb;
        this.d = hgy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue() && this.e.b() && !((Boolean) this.e.c()).booleanValue()) {
            this.b.a(szk.a("spotify:home").a(true).a());
        }
        this.e = Optional.b(bool);
    }

    public final void a() {
        this.a.bd_();
        Flowable a2 = this.d.a();
        rqb rqb = this.c;
        rqb.getClass();
        this.a = a2.c((Function<? super T, ? extends R>) new $$Lambda$HqSCQERWkSOwq0USVm_KKL2UU9s<Object,Object>(rqb)).a(Functions.a()).c((Consumer<? super T>) new $$Lambda$ssb$xQxXXzkDpnYpqJxcqbrivzyRo<Object>(this));
    }
}
