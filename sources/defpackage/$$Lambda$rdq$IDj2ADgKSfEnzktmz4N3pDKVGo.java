package defpackage;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$rdq$IDj2ADgKSfEnzktmz-4N3pDKVGo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rdq$IDj2ADgKSfEnzktmz4N3pDKVGo implements Consumer {
    private final /* synthetic */ rdq f$0;
    private final /* synthetic */ Observable f$1;

    public /* synthetic */ $$Lambda$rdq$IDj2ADgKSfEnzktmz4N3pDKVGo(rdq rdq, Observable observable) {
        this.f$0 = rdq;
        this.f$1 = observable;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (Disposable) obj);
    }
}
