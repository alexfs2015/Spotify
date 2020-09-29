package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: aev reason: default package */
public final class aev {
    public static final agd a = agd.a("connected.car.sdk");
    public final String b;
    public final Context c;
    final String d;
    public final BroadcastReceiver e = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            aev.a.b("mWatcherReceiver.onReceive(%s)", intent.getAction());
            String str = "EXTRA_SYNC_BROADCASTER_IDENT";
            String stringExtra = intent.getStringExtra(str);
            aev aev = aev.this;
            StringBuilder sb = new StringBuilder("ACTION_SYNC_BROADCASTER_RESPONSE");
            sb.append(aev.b);
            Intent intent2 = new Intent(sb.toString());
            String str2 = "success";
            intent2.putExtra("EXTRA_SYNC_BROADCASTER_RESPONSE_STRING", str2);
            intent2.putExtra(str, stringExtra);
            intent2.putExtra("EXTRA_SYNC_BROADCASTER_SESSION_ID", aev.d);
            aev.a.b("sendResponse(%s, %s)", intent2.getAction(), str2);
            aev.c.sendBroadcast(intent2);
        }
    };

    public aev(String str, Context context, String str2) {
        this.b = str;
        this.c = context;
        this.d = str2;
    }
}
