package defpackage;

import io.reactivex.Observable;
import java.util.concurrent.Callable;

/* renamed from: -$$Lambda$lvo$1$YFIrRuffYnEXOio13iNLcNTDmSg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$lvo$1$YFIrRuffYnEXOio13iNLcNTDmSg implements Callable {
    private final /* synthetic */ lve f$0;
    private final /* synthetic */ luu f$1;

    public /* synthetic */ $$Lambda$lvo$1$YFIrRuffYnEXOio13iNLcNTDmSg(lve lve, luu luu) {
        this.f$0 = lve;
        this.f$1 = luu;
    }

    public final Object call() {
        return Observable.b(this.f$0.a(this.f$1));
    }
}
