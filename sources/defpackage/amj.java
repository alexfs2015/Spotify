package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

/* renamed from: amj reason: default package */
public final class amj extends BroadcastReceiver {
    private static amj a;
    private Context b;

    private amj(Context context) {
        this.b = context.getApplicationContext();
    }

    public static amj a(Context context) {
        amj amj = a;
        if (amj != null) {
            return amj;
        }
        amj amj2 = new amj(context);
        a = amj2;
        mh.a(amj2.b).a(amj2, new IntentFilter("com.parse.bolts.measurement_event"));
        return a;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            mh.a(this.b).a((BroadcastReceiver) this);
        } finally {
            super.finalize();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        alk alk = new alk(context);
        StringBuilder sb = new StringBuilder("bf_");
        sb.append(intent.getStringExtra("event_name"));
        String sb2 = sb.toString();
        Bundle bundleExtra = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        for (String str : bundleExtra.keySet()) {
            String str2 = "";
            bundle.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", str2).replaceAll("[ -]*$", str2), (String) bundleExtra.get(str));
        }
        alk.a(sb2, bundle);
    }
}
