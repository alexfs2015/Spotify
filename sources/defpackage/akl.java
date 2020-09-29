package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: akl reason: default package */
public abstract class akl {
    /* access modifiers changed from: private */
    public static final String d = akl.class.getSimpleName();
    public final BroadcastReceiver a;
    public final mh b;
    public boolean c = false;

    /* renamed from: akl$a */
    class a extends BroadcastReceiver {
        private a() {
        }

        /* synthetic */ a(akl akl, byte b) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                ank.b(akl.d, "AccessTokenChanged");
                intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN");
                akl.this.a((aki) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    public akl() {
        anl.a();
        this.a = new a(this, 0);
        this.b = mh.a(akq.g());
        a();
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.b.a(this.a, intentFilter);
    }

    public final void a() {
        if (!this.c) {
            c();
            this.c = true;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(aki aki);
}
