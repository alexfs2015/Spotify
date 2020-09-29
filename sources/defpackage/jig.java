package defpackage;

import android.os.Handler;

/* renamed from: jig reason: default package */
public final class jig extends jht {
    /* access modifiers changed from: private */
    public final jht a;
    /* access modifiers changed from: private */
    public final jht b;
    private final Handler c = new Handler();
    private final Runnable f = new Runnable() {
        public final void run() {
            jig.this.ah_();
        }
    };

    public jig(jht jht, jht jht2) {
        super("WakeState");
        this.a = jht;
        this.b = jht2;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        AnonymousClass2 r0 = new jhy() {
            public final void a() {
                jig.this.e();
                jig.this.ag_();
            }

            public final void b() {
                if (jig.this.a.g() && jig.this.b.g()) {
                    jig.this.c.postDelayed(jig.this.f, 120000);
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

    /* access modifiers changed from: private */
    public void e() {
        this.c.removeCallbacks(this.f);
    }
}
