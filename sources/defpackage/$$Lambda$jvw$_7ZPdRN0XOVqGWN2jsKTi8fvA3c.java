package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$jvw$_7ZPdRN0XOVqGWN2jsKTi8fvA3c reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jvw$_7ZPdRN0XOVqGWN2jsKTi8fvA3c implements Cancellable {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ BroadcastReceiver f$1;

    public /* synthetic */ $$Lambda$jvw$_7ZPdRN0XOVqGWN2jsKTi8fvA3c(Context context, BroadcastReceiver broadcastReceiver) {
        this.f$0 = context;
        this.f$1 = broadcastReceiver;
    }

    public final void cancel() {
        this.f$0.unregisterReceiver(this.f$1);
    }
}
