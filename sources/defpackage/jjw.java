package defpackage;

import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.TimeUnit;

/* renamed from: jjw reason: default package */
public final class jjw extends jkj {
    private final jks a;
    private final jkd b;
    private final Handler c;
    private final jko f = new jko() {
        private void c() {
            if (jjw.this.f()) {
                jjw.this.ah_();
            }
        }

        public final void a() {
            c();
        }

        public final void b() {
            c();
        }
    };

    public jjw(jks jks, jkd jkd, Handler handler) {
        super("Init");
        this.a = jks;
        this.b = jkd;
        this.c = handler;
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
        this.c.postDelayed(new $$Lambda$C32qffWArG3yFBryXpadxf02vw(this), TimeUnit.SECONDS.toMillis(30));
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

    /* access modifiers changed from: protected */
    public final void d() {
        super.d();
        this.c.removeCallbacksAndMessages(null);
    }

    public final void e() {
        if (f()) {
            ah_();
        } else if (!this.e) {
            ag_();
        }
    }
}
