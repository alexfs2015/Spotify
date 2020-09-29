package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: vj reason: default package */
public final class vj extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        String str = "referrer";
        String stringExtra = intent.getStringExtra(str);
        if (stringExtra != null) {
            vi a = ve.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                AnonymousClass2 r1 = new Runnable(context, stringExtra, currentTimeMillis) {
                    private /* synthetic */ Context a;
                    private /* synthetic */ String b;
                    private /* synthetic */ long c;

                    {
                        this.a = r2;
                        this.b = r3;
                        this.c = r4;
                    }

                    public final void run() {
                        new wl(this.a).a(this.b, this.c);
                    }
                };
                wm.a((Runnable) r1);
                if (a.a(str) && a.a.g()) {
                    a.a.h();
                }
            }
        }
    }
}
