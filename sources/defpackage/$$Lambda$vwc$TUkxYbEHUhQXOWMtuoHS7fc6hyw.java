package defpackage;

import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: -$$Lambda$vwc$TUkxYbEHUhQXOWMtuoHS7fc6hyw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vwc$TUkxYbEHUhQXOWMtuoHS7fc6hyw implements ObservableOnSubscribe {
    private final /* synthetic */ vwc f$0;
    private final /* synthetic */ fow f$1;

    public /* synthetic */ $$Lambda$vwc$TUkxYbEHUhQXOWMtuoHS7fc6hyw(vwc vwc, fow fow) {
        this.f$0 = vwc;
        this.f$1 = fow;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        this.f$0.a(this.f$1, observableEmitter);
    }
}
