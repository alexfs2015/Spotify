package defpackage;

import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.TimeUnit;

/* renamed from: jhg reason: default package */
public final class jhg extends jht {
    private final jic a;
    private final jhn b;
    private final Handler c;
    private final jhy f = new jhy() {
        public final void a() {
            c();
        }

        public final void b() {
            c();
        }

        private void c() {
            if (jhg.this.f()) {
                jhg.this.ah_();
            }
        }
    };

    public jhg(jic jic, jhn jhn, Handler handler) {
        super("Init");
        this.a = jic;
        this.b = jhn;
        this.c = handler;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        super.d();
        this.c.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: private */
    public boolean f() {
        boolean z = this.a.e;
        boolean z2 = this.b.e;
        Logger.a("Checking notification state, sync: %s, playback: %s", Boolean.valueOf(z), Boolean.valueOf(z2));
        return z || z2;
    }

    /* access modifiers changed from: protected */
    public final synchronized void ag_() {
        super.ag_();
        this.c.postDelayed(new $$Lambda$_tSl4CJ0BVhcBTy82h_CaIdpoQ(this), TimeUnit.SECONDS.toMillis(30));
        this.a.a(this.f);
        this.b.a(this.f);
    }

    /* access modifiers changed from: protected */
    public final synchronized void ah_() {
        super.ah_();
        this.c.removeCallbacksAndMessages(null);
        this.a.b(this.f);
        this.b.b(this.f);
    }

    public final void e() {
        if (f()) {
            ah_();
        } else if (!this.e) {
            ag_();
        }
    }
}
