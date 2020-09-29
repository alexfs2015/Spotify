package defpackage;

import android.os.Handler;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import java.util.concurrent.TimeUnit;

/* renamed from: jjv reason: default package */
public final class jjv extends jkj {
    private static long a = TimeUnit.MINUTES.toMillis(10);
    private static final long b = TimeUnit.SECONDS.toMillis(10);
    /* access modifiers changed from: private */
    public final jkj c;
    /* access modifiers changed from: private */
    public final jkj f;
    /* access modifiers changed from: private */
    public final jkj g;
    /* access modifiers changed from: private */
    public final jil h;
    /* access modifiers changed from: private */
    public final jkj i;
    /* access modifiers changed from: private */
    public final jjj j;
    /* access modifiers changed from: private */
    public final jkj k;
    private long l = a;
    private boolean m;
    private final Handler n = new Handler();
    private final Runnable o = new $$Lambda$JVB4jLYiwrb4rD3S4JElfSTTlQI(this);
    private final Runnable p = new $$Lambda$gPBQUw2ibVJZ4sdXs9WrEN9St4(this);

    public jjv(jkj jkj, jkj jkj2, jjo jjo, jil jil, jjt jjt, jjj jjj, jkj jkj3) {
        super("Idle");
        this.c = jkj;
        this.f = jkj2;
        this.g = jjo;
        this.h = jil;
        this.i = jjt;
        this.j = jjj;
        this.k = jkj3;
    }

    static /* synthetic */ void h(jjv jjv) {
        jjv.n.removeCallbacks(jjv.o);
        jjv.n.post(jjv.p);
        jjv.m = false;
    }

    static /* synthetic */ void i(jjv jjv) {
        jjv.n.removeCallbacks(jjv.p);
        Handler handler = jjv.n;
        Runnable runnable = jjv.o;
        DebugFlag debugFlag = DebugFlag.DEBUG_SHUTDOWN;
        handler.postDelayed(runnable, jjv.l);
        jjv.m = true;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        AnonymousClass1 r0 = new jko() {
            private void c() {
                if (jjv.this.c.e || jjv.this.f.e || jjv.this.g.e || jjv.this.h.e || jjv.this.i.e || jjv.this.j.e || jjv.this.k.e) {
                    jjv.h(jjv.this);
                } else {
                    jjv.i(jjv.this);
                }
            }

            public final void a() {
                c();
            }

            public final void b() {
                c();
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
}
