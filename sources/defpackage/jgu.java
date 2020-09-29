package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Set;

/* renamed from: jgu reason: default package */
public final class jgu extends jht {
    private final Context a;
    private final Set<String> b = new HashSet(2);
    private BroadcastReceiver c;

    public jgu(jhu jhu) {
        super("CarConnected");
        this.a = jhu.a;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        this.c = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                String stringExtra = intent.getStringExtra("source");
                boolean booleanExtra = intent.getBooleanExtra("connected", false);
                if (!fax.a(stringExtra)) {
                    jgu.this.a(stringExtra, booleanExtra);
                }
            }
        };
        mc.a(this.a).a(this.c, new IntentFilter("com.spotify.mobile.android.state.ACTION_CAR_CONNECTED"));
    }

    public final void a(String str, boolean z) {
        if (z) {
            this.b.add(str);
        } else {
            this.b.remove(str);
        }
        if (this.b.isEmpty()) {
            ah_();
        } else {
            ag_();
        }
    }

    /* access modifiers changed from: protected */
    public final void d() {
        if (this.c != null) {
            super.d();
            mc.a(this.a).a(this.c);
        }
    }
}
