package defpackage;

import android.content.Context;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: -$$Lambda$viv$4BVS7mPnF94i6XuiuoUlB4wScBY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$viv$4BVS7mPnF94i6XuiuoUlB4wScBY implements ObservableOnSubscribe {
    private final /* synthetic */ viv f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$viv$4BVS7mPnF94i6XuiuoUlB4wScBY(viv viv, Context context) {
        this.f$0 = viv;
        this.f$1 = context;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        this.f$0.a(this.f$1, observableEmitter);
    }
}
