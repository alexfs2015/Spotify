package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: ajx reason: default package */
public abstract class ajx {
    /* access modifiers changed from: private */
    public static final String d = ajx.class.getSimpleName();
    public final BroadcastReceiver a;
    public final mc b;
    public boolean c = false;

    /* renamed from: ajx$a */
    class a extends BroadcastReceiver {
        private a() {
        }

        /* synthetic */ a(ajx ajx, byte b) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                amw.b(ajx.d, "AccessTokenChanged");
                intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN");
                ajx.this.a((aju) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(aju aju);

    public ajx() {
        amx.a();
        this.a = new a(this, 0);
        this.b = mc.a(akc.g());
        a();
    }

    public final void a() {
        if (!this.c) {
            c();
            this.c = true;
        }
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.b.a(this.a, intentFilter);
    }
}
