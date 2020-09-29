package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import io.reactivex.ObservableEmitter;

/* renamed from: -$$Lambda$vwa$ACYJgtvGEwYjAOwsC1U2O6KKQ3M reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vwa$ACYJgtvGEwYjAOwsC1U2O6KKQ3M implements Runnable {
    private final /* synthetic */ vwa f$0;
    private final /* synthetic */ Context f$1;
    private final /* synthetic */ ObservableEmitter f$2;
    private final /* synthetic */ ServiceConnection f$3;

    public /* synthetic */ $$Lambda$vwa$ACYJgtvGEwYjAOwsC1U2O6KKQ3M(vwa vwa, Context context, ObservableEmitter observableEmitter, ServiceConnection serviceConnection) {
        this.f$0 = vwa;
        this.f$1 = context;
        this.f$2 = observableEmitter;
        this.f$3 = serviceConnection;
    }

    public final void run() {
        this.f$0.a(this.f$1, this.f$2, this.f$3);
    }
}
