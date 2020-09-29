package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: ui reason: default package */
public final class ui extends uj<Boolean> {
    private static final String c = su.a("BatteryNotLowTracker");

    public ui(Context context, vp vpVar) {
        super(context, vpVar);
    }

    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    public final void a(Intent intent) {
        if (intent.getAction() != null) {
            su.a();
            String.format("Received %s", new Object[]{intent.getAction()});
            String action = intent.getAction();
            char c2 = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                    c2 = 1;
                }
            } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                c2 = 0;
            }
            if (c2 != 0) {
                if (c2 == 1) {
                    a(Boolean.FALSE);
                }
                return;
            }
            a(Boolean.TRUE);
        }
    }

    public final /* synthetic */ Object b() {
        Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            su.a().a(c, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("plugged", 0);
        int intExtra2 = registerReceiver.getIntExtra("status", -1);
        float intExtra3 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        boolean z = true;
        if (intExtra == 0 && intExtra2 != 1 && intExtra3 <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
