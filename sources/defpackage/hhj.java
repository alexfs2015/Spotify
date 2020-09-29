package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: hhj reason: default package */
final class hhj implements a<ho<Context, Intent>> {
    private final hhh a;
    private final IntentFilter b;
    private final xil c;

    public hhj(hhh hhh, IntentFilter intentFilter, xil xil) {
        this.a = hhh;
        this.b = intentFilter;
        this.c = xil;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(BroadcastReceiver broadcastReceiver) {
        this.a.a(broadcastReceiver);
    }

    public final /* synthetic */ void call(Object obj) {
        final xio xio = (xio) obj;
        AnonymousClass1 r0 = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if (!xio.isUnsubscribed()) {
                    xio.onNext(new ho(context, intent));
                }
            }
        };
        this.a.a(r0, this.b);
        xio.add(new jyl(this.c, new $$Lambda$hhj$ICpZIvKVaVlUKKfgqOvYdsG7Sow(this, r0)));
    }
}
