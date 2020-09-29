package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: hen reason: default package */
final class hen implements a<ho<Context, Intent>> {
    private final hel a;
    private final IntentFilter b;
    private final wug c;

    public final /* synthetic */ void call(Object obj) {
        final wuj wuj = (wuj) obj;
        AnonymousClass1 r0 = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if (!wuj.isUnsubscribed()) {
                    wuj.onNext(new ho(context, intent));
                }
            }
        };
        this.a.a(r0, this.b);
        wuj.add(new jwd(this.c, new $$Lambda$hen$at6m9RYSmRU1tcyd1H_J2E72br0(this, r0)));
    }

    public hen(hel hel, IntentFilter intentFilter, wug wug) {
        this.a = hel;
        this.b = intentFilter;
        this.c = wug;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(BroadcastReceiver broadcastReceiver) {
        this.a.a(broadcastReceiver);
    }
}
