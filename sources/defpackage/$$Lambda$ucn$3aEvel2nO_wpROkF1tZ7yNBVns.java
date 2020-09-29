package defpackage;

import io.reactivex.ObservableEmitter;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$ucn$3aEvel2nO_wp-ROkF1tZ7yNBVns reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ucn$3aEvel2nO_wpROkF1tZ7yNBVns implements Cancellable {
    private final /* synthetic */ ucn f$0;
    private final /* synthetic */ ObservableEmitter f$1;

    public /* synthetic */ $$Lambda$ucn$3aEvel2nO_wpROkF1tZ7yNBVns(ucn ucn, ObservableEmitter observableEmitter) {
        this.f$0 = ucn;
        this.f$1 = observableEmitter;
    }

    public final void cancel() {
        this.f$0.b(this.f$1);
    }
}
