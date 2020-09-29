package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.PowerManager;

/* renamed from: jjr reason: default package */
public final class jjr extends jkj {
    private final a a;

    /* renamed from: jjr$a */
    interface a {
        void a();

        void b();
    }

    /* renamed from: jjr$b */
    static class b implements a {
        b() {
        }

        public final void a() {
        }

        public final void b() {
        }
    }

    /* renamed from: jjr$c */
    class c implements a {
        final PowerManager a;
        final Context b;
        private BroadcastReceiver d;

        public c(Context context) {
            this.b = context;
            this.a = (PowerManager) context.getSystemService("power");
        }

        public final void a() {
            this.d = new BroadcastReceiver() {
                public final void onReceive(Context context, Intent intent) {
                    c cVar = c.this;
                    if (cVar.a.isDeviceIdleMode() && !cVar.a.isIgnoringBatteryOptimizations(cVar.b.getPackageName())) {
                        jjr.this.ag_();
                    } else {
                        jjr.this.ah_();
                    }
                }
            };
            this.b.registerReceiver(this.d, new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
        }

        public final void b() {
            BroadcastReceiver broadcastReceiver = this.d;
            if (broadcastReceiver != null) {
                this.b.unregisterReceiver(broadcastReceiver);
            }
        }
    }

    public jjr(jkk jkk) {
        super("DozeDeepIdleState");
        if (VERSION.SDK_INT >= 23) {
            this.a = new c(jkk.a);
        } else {
            this.a = new b();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.a.a();
    }

    /* access modifiers changed from: protected */
    public final void d() {
        this.a.b();
    }
}
