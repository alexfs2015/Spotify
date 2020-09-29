package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.spotify.music.features.diskalmostfull.DiskAlmostFullActivity;

/* renamed from: mre reason: default package */
public class mre extends jry {
    /* access modifiers changed from: private */
    public Intent T;
    /* access modifiers changed from: private */
    public boolean U;
    /* access modifiers changed from: private */
    public boolean V;
    private jtw W;
    private final BroadcastReceiver X = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (!mre.this.U && context != null) {
                mre.this.V = true;
                if (!"check_storage.diskspace.ok".equals(intent.getAction())) {
                    mre.this.T = new Intent(context, DiskAlmostFullActivity.class);
                    if (mre.this.Y != null) {
                        mre.this.Y.a((jry) mre.this);
                        mre.this.U = true;
                    }
                }
            }
        }
    };
    public wzi<jtw> a;
    public mh b;

    public final void A() {
        this.b.a(this.X);
        jtw jtw = this.W;
        if (jtw != null) {
            jtw.cancel(false);
        }
        super.A();
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.U = false;
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            this.U = bundle.getBoolean("queued", false);
            this.V = bundle.getBoolean("checked", false);
        }
    }

    public final void c() {
        super.c();
        Intent intent = this.T;
        if (intent != null) {
            startActivityForResult(intent, this.Z);
        }
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("queued", this.U);
        bundle.putBoolean("checked", this.V);
    }

    public final void z() {
        super.z();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("check_storage.settings_low.error");
        intentFilter.addAction("check_storage.cache_low.error");
        intentFilter.addAction("check_storage.diskspace.ok");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        this.b.a(this.X, intentFilter);
        if (!this.V) {
            this.W = (jtw) this.a.get();
            this.W.execute(new Void[0]);
        }
    }
}
