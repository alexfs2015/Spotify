package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$jto$pfUR0D0VQIutpGzc0PdV4UMUivE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jto$pfUR0D0VQIutpGzc0PdV4UMUivE implements Cancellable {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ BroadcastReceiver f$1;

    public /* synthetic */ $$Lambda$jto$pfUR0D0VQIutpGzc0PdV4UMUivE(Context context, BroadcastReceiver broadcastReceiver) {
        this.f$0 = context;
        this.f$1 = broadcastReceiver;
    }

    public final void cancel() {
        this.f$0.unregisterReceiver(this.f$1);
    }
}
