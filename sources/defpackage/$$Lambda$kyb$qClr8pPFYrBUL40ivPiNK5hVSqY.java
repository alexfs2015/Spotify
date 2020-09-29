package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$kyb$qClr8pPFYrBUL40ivPiNK5hVSqY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kyb$qClr8pPFYrBUL40ivPiNK5hVSqY implements Action {
    private final /* synthetic */ Application f$0;
    private final /* synthetic */ BroadcastReceiver f$1;

    public /* synthetic */ $$Lambda$kyb$qClr8pPFYrBUL40ivPiNK5hVSqY(Application application, BroadcastReceiver broadcastReceiver) {
        this.f$0 = application;
        this.f$1 = broadcastReceiver;
    }

    public final void run() {
        this.f$0.unregisterReceiver(this.f$1);
    }
}
