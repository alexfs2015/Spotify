package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.spotify.music.features.diskalmostfull.DiskAlmostFullActivity;

/* renamed from: mml reason: default package */
public class mml extends jpm {
    /* access modifiers changed from: private */
    public Intent T;
    /* access modifiers changed from: private */
    public boolean U;
    /* access modifiers changed from: private */
    public boolean V;
    private jrm W;
    private final BroadcastReceiver X = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (!mml.this.U && context != null) {
                mml.this.V = true;
                if (!"check_storage.diskspace.ok".equals(intent.getAction())) {
                    mml.this.T = new Intent(context, DiskAlmostFullActivity.class);
                    if (mml.this.Y != null) {
                        mml.this.Y.a((jpm) mml.this);
                        mml.this.U = true;
                    }
                }
            }
        }
    };
    public wlc<jrm> a;
    public mc b;

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            this.U = bundle.getBoolean("queued", false);
            this.V = bundle.getBoolean("checked", false);
        }
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
            this.W = (jrm) this.a.get();
            this.W.execute(new Void[0]);
        }
    }

    public final void A() {
        this.b.a(this.X);
        jrm jrm = this.W;
        if (jrm != null) {
            jrm.cancel(false);
        }
        super.A();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("queued", this.U);
        bundle.putBoolean("checked", this.V);
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.U = false;
    }

    public final void c() {
        super.c();
        Intent intent = this.T;
        if (intent != null) {
            startActivityForResult(intent, this.Z);
        }
    }
}
