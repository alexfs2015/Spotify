package defpackage;

import android.os.Handler;

/* renamed from: jkw reason: default package */
public final class jkw extends jkj {
    /* access modifiers changed from: private */
    public final jkj a;
    /* access modifiers changed from: private */
    public final jkj b;
    private final Handler c = new Handler();
    private final Runnable f = new Runnable() {
        public final void run() {
            jkw.this.ah_();
        }
    };

    public jkw(jkj jkj, jkj jkj2) {
        super("WakeState");
        this.a = jkj;
        this.b = jkj2;
    }

    /* access modifiers changed from: private */
    public void e() {
        this.c.removeCallbacks(this.f);
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        AnonymousClass2 r0 = new jko() {
            public final void a() {
                jkw.this.e();
                jkw.this.ag_();
            }

            public final void b() {
                if (jkw.this.a.g() && jkw.this.b.g()) {
                    jkw.this.c.postDelayed(jkw.this.f, 120000);
                }
            }
        };
        this.a.a(r0);
        this.b.a(r0);
    }

    /* access modifiers changed from: protected */
    public final void d() {
        e();
    }
}
