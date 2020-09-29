package defpackage;

import io.reactivex.ObservableEmitter;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$tqk$s6mKb23qwSo-8XlT_iMCrpQaMOM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$tqk$s6mKb23qwSo8XlT_iMCrpQaMOM implements Cancellable {
    private final /* synthetic */ tqk f$0;
    private final /* synthetic */ ObservableEmitter f$1;

    public /* synthetic */ $$Lambda$tqk$s6mKb23qwSo8XlT_iMCrpQaMOM(tqk tqk, ObservableEmitter observableEmitter) {
        this.f$0 = tqk;
        this.f$1 = observableEmitter;
    }

    public final void cancel() {
        this.f$0.b(this.f$1);
    }
}
