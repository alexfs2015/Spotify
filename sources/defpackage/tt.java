package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;

/* renamed from: tt reason: default package */
public final class tt extends tv<Boolean> {
    private static final String c = sg.a("BatteryChrgTracker");

    public tt(Context context, vb vbVar) {
        super(context, vbVar);
    }

    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        if (VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    public final void a(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            sg.a();
            String.format("Received %s", new Object[]{action});
            char c2 = 65535;
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                a(Boolean.TRUE);
            } else if (c2 == 1) {
                a(Boolean.FALSE);
            } else if (c2 != 2) {
                if (c2 == 3) {
                    a(Boolean.FALSE);
                }
            } else {
                a(Boolean.TRUE);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r0.getIntExtra("plugged", 0) != 0) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r0 != 5) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object b() {
        /*
            r5 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)
            android.content.Context r1 = r5.a
            r2 = 0
            android.content.Intent r0 = r1.registerReceiver(r2, r0)
            r1 = 0
            if (r0 != 0) goto L_0x001f
            sg r0 = defpackage.sg.a()
            java.lang.String r3 = c
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            java.lang.String r4 = "getInitialState - null intent received"
            r0.a(r3, r4, r1)
            return r2
        L_0x001f:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            r4 = 1
            if (r2 < r3) goto L_0x0035
            r2 = -1
            java.lang.String r3 = "status"
            int r0 = r0.getIntExtra(r3, r2)
            r2 = 2
            if (r0 == r2) goto L_0x0033
            r2 = 5
            if (r0 != r2) goto L_0x003e
        L_0x0033:
            r1 = 1
            goto L_0x003e
        L_0x0035:
            java.lang.String r2 = "plugged"
            int r0 = r0.getIntExtra(r2, r1)
            if (r0 == 0) goto L_0x003e
            goto L_0x0033
        L_0x003e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt.b():java.lang.Object");
    }
}
