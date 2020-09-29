package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$lbk$aiP9UHSXCAbfoBMyi2k_sDphGZI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$lbk$aiP9UHSXCAbfoBMyi2k_sDphGZI implements Action {
    private final /* synthetic */ Application f$0;
    private final /* synthetic */ BroadcastReceiver f$1;

    public /* synthetic */ $$Lambda$lbk$aiP9UHSXCAbfoBMyi2k_sDphGZI(Application application, BroadcastReceiver broadcastReceiver) {
        this.f$0 = application;
        this.f$1 = broadcastReceiver;
    }

    public final void run() {
        this.f$0.unregisterReceiver(this.f$1);
    }
}
