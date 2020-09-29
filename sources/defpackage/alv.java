package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

/* renamed from: alv reason: default package */
public final class alv extends BroadcastReceiver {
    private static alv a;
    private Context b;

    private alv(Context context) {
        this.b = context.getApplicationContext();
    }

    public static alv a(Context context) {
        alv alv = a;
        if (alv != null) {
            return alv;
        }
        alv alv2 = new alv(context);
        a = alv2;
        mc.a(alv2.b).a(alv2, new IntentFilter("com.parse.bolts.measurement_event"));
        return a;
    }

    public final void onReceive(Context context, Intent intent) {
        akw akw = new akw(context);
        StringBuilder sb = new StringBuilder("bf_");
        sb.append(intent.getStringExtra("event_name"));
        String sb2 = sb.toString();
        Bundle bundleExtra = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        for (String str : bundleExtra.keySet()) {
            String str2 = "";
            bundle.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", str2).replaceAll("[ -]*$", str2), (String) bundleExtra.get(str));
        }
        akw.a(sb2, bundle);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            mc.a(this.b).a((BroadcastReceiver) this);
        } finally {
            super.finalize();
        }
    }
}
