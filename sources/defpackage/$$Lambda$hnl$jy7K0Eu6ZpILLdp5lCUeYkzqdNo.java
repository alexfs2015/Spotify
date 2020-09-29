package defpackage;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hnl$jy7K0Eu6ZpILLdp5lCUeYkzqdNo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hnl$jy7K0Eu6ZpILLdp5lCUeYkzqdNo implements Consumer {
    private final /* synthetic */ hnl f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$hnl$jy7K0Eu6ZpILLdp5lCUeYkzqdNo(hnl hnl, String str) {
        this.f$0 = hnl;
        this.f$1 = str;
    }

    public final void accept(Object obj) {
        this.f$0.c(this.f$1, (Disposable) obj);
    }
}
