package defpackage;

import android.app.Application;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: -$$Lambda$lbk$IIP9JzbjEdeGXkxtfkv1fjbQbHY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$lbk$IIP9JzbjEdeGXkxtfkv1fjbQbHY implements ObservableOnSubscribe {
    private final /* synthetic */ Application f$0;

    public /* synthetic */ $$Lambda$lbk$IIP9JzbjEdeGXkxtfkv1fjbQbHY(Application application) {
        this.f$0 = application;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        lbk.a(this.f$0, observableEmitter);
    }
}
