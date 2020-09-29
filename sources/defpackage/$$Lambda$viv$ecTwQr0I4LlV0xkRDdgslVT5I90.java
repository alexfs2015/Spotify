package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import io.reactivex.ObservableEmitter;

/* renamed from: -$$Lambda$viv$ecTwQr0I4LlV0xkRDdgslVT5I90 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$viv$ecTwQr0I4LlV0xkRDdgslVT5I90 implements Runnable {
    private final /* synthetic */ viv f$0;
    private final /* synthetic */ Context f$1;
    private final /* synthetic */ ObservableEmitter f$2;
    private final /* synthetic */ ServiceConnection f$3;

    public /* synthetic */ $$Lambda$viv$ecTwQr0I4LlV0xkRDdgslVT5I90(viv viv, Context context, ObservableEmitter observableEmitter, ServiceConnection serviceConnection) {
        this.f$0 = viv;
        this.f$1 = context;
        this.f$2 = observableEmitter;
        this.f$3 = serviceConnection;
    }

    public final void run() {
        this.f$0.a(this.f$1, this.f$2, this.f$3);
    }
}
