package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: bvi reason: default package */
public final class bvi extends BroadcastReceiver {
    public Context a;
    private final bvj b;

    public bvi(bvj bvj) {
        this.b = bvj;
    }

    public final synchronized void a() {
        if (this.a != null) {
            this.a.unregisterReceiver(this);
        }
        this.a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.b.a();
            a();
        }
    }
}
