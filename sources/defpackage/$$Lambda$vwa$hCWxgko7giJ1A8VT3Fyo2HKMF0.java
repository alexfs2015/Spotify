package defpackage;

import android.content.Context;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: -$$Lambda$vwa$hCWxgko7giJ1A8VT3Fyo2HKMF-0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vwa$hCWxgko7giJ1A8VT3Fyo2HKMF0 implements ObservableOnSubscribe {
    private final /* synthetic */ vwa f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$vwa$hCWxgko7giJ1A8VT3Fyo2HKMF0(vwa vwa, Context context) {
        this.f$0 = vwa;
        this.f$1 = context;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        this.f$0.a(this.f$1, observableEmitter);
    }
}
