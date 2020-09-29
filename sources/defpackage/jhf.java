package defpackage;

import android.os.Handler;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import java.util.concurrent.TimeUnit;

/* renamed from: jhf reason: default package */
public final class jhf extends jht {
    private static long a = TimeUnit.MINUTES.toMillis(10);
    private static final long b = TimeUnit.SECONDS.toMillis(10);
    /* access modifiers changed from: private */
    public final jht c;
    /* access modifiers changed from: private */
    public final jht f;
    /* access modifiers changed from: private */
    public final jht g;
    /* access modifiers changed from: private */
    public final jfw h;
    /* access modifiers changed from: private */
    public final jht i;
    /* access modifiers changed from: private */
    public final jgu j;
    /* access modifiers changed from: private */
    public final jht k;
    private long l = a;
    private boolean m;
    private final Handler n = new Handler();
    private final Runnable o = new $$Lambda$dcdRRunK77RSOhTIapmMc9EzF2Q(this);
    private final Runnable p = new $$Lambda$W2CyrnQallMnaD7X3wJkcFxRcIk(this);

    public jhf(jht jht, jht jht2, jgz jgz, jfw jfw, jhd jhd, jgu jgu, jht jht3) {
        super("Idle");
        this.c = jht;
        this.f = jht2;
        this.g = jgz;
        this.h = jfw;
        this.i = jhd;
        this.j = jgu;
        this.k = jht3;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        AnonymousClass1 r0 = new jhy() {
            public final void a() {
                c();
            }

            public final void b() {
                c();
            }

            private void c() {
                if (jhf.this.c.e || jhf.this.f.e || jhf.this.g.e || jhf.this.h.e || jhf.this.i.e || jhf.this.j.e || jhf.this.k.e) {
                    jhf.h(jhf.this);
                } else {
                    jhf.i(jhf.this);
                }
            }
        };
        this.c.a(r0);
        this.f.a(r0);
        this.g.a(r0);
        this.h.a(r0);
        this.i.a(r0);
        this.j.a(r0);
        this.k.a(r0);
    }

    /* access modifiers changed from: protected */
    public final void d() {
        super.d();
        this.n.removeCallbacksAndMessages(null);
    }

    static /* synthetic */ void h(jhf jhf) {
        jhf.n.removeCallbacks(jhf.o);
        jhf.n.post(jhf.p);
        jhf.m = false;
    }

    static /* synthetic */ void i(jhf jhf) {
        jhf.n.removeCallbacks(jhf.p);
        Handler handler = jhf.n;
        Runnable runnable = jhf.o;
        DebugFlag debugFlag = DebugFlag.DEBUG_SHUTDOWN;
        handler.postDelayed(runnable, jhf.l);
        jhf.m = true;
    }
}
