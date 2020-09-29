package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: shu reason: default package */
public final class shu {
    Disposable a = Disposables.b();
    private final spi b;
    private final rgz c;
    private final hec d;
    private Optional<Boolean> e = Optional.e();

    public shu(spi spi, rgz rgz, hec hec) {
        this.b = spi;
        this.c = rgz;
        this.d = hec;
    }

    public final void a() {
        this.a.bf_();
        Flowable a2 = this.d.a();
        rgz rgz = this.c;
        rgz.getClass();
        this.a = a2.c((Function<? super T, ? extends R>) new $$Lambda$JX5nf3tq4yxrPUrZhxLMB5DsKM<Object,Object>(rgz)).a(Functions.a()).c((Consumer<? super T>) new $$Lambda$shu$BlqRQv8quQek8IgB51zTrymkJk<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue() && this.e.b() && !((Boolean) this.e.c()).booleanValue()) {
            this.b.a(spd.a("spotify:home").a(true).a());
        }
        this.e = Optional.b(bool);
    }
}
