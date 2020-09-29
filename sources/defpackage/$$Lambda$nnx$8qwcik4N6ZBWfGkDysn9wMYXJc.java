package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$nnx$8qwc-ik4N6ZBWfGkDysn9wMYXJc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$nnx$8qwcik4N6ZBWfGkDysn9wMYXJc implements ObservableTransformer {
    private final /* synthetic */ noc f$0;
    private final /* synthetic */ noh f$1;
    private final /* synthetic */ hhm f$2;
    private final /* synthetic */ nit f$3;

    public /* synthetic */ $$Lambda$nnx$8qwcik4N6ZBWfGkDysn9wMYXJc(noc noc, noh noh, hhm hhm, nit nit) {
        this.f$0 = noc;
        this.f$1 = noh;
        this.f$2 = hhm;
        this.f$3 = nit;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$nnx$q4ejJeI3TinHPPJLTEHAfx3lMtU(this.f$0, this.f$1, this.f$2, this.f$3));
    }
}
