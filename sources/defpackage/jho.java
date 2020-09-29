package defpackage;

import android.os.Handler;
import com.spotify.mobile.android.util.Assertion;
import java.util.Random;

/* renamed from: jho reason: default package */
public final class jho extends jht {
    private final long a = 5000;
    private final Handler b = new Handler();
    /* access modifiers changed from: private */
    public final jhq c;
    /* access modifiers changed from: private */
    public final jhp f;
    /* access modifiers changed from: private */
    public final jhs g;
    /* access modifiers changed from: private */
    public final jht h;
    /* access modifiers changed from: private */
    public final Random i;
    private final Runnable j = new Runnable() {
        public final void run() {
            if (!jho.this.h.e) {
                boolean z = false;
                if (jho.this.c.e && jho.this.f.e && jho.this.g.e) {
                    z = true;
                }
                if (jho.this.c.g() && jho.this.f.e && jho.this.g.g()) {
                    z = true;
                }
                if (jho.this.c.g() && jho.this.f.g() && jho.this.g.e) {
                    z = true;
                }
                if (z && jho.this.i.nextDouble() >= 0.99d) {
                    StringBuilder sb = new StringBuilder("RemotePlayback: ");
                    sb.append(jho.this.c.e);
                    sb.append(" Playback: ");
                    sb.append(jho.this.f.e);
                    sb.append(" AudioDriver: ");
                    sb.append(jho.this.g.e);
                    sb.append(" VideoPlayerPlayback: ");
                    sb.append(jho.this.h.e);
                    sb.append(" (Throttled 99%)");
                    Assertion.c(sb.toString());
                }
            }
        }
    };

    public jho(jhq jhq, jhp jhp, jhs jhs, jht jht, Random random) {
        super("PlaybackOnDeviceState");
        this.c = jhq;
        this.f = jhp;
        this.g = jhs;
        this.h = jht;
        this.i = random;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        AnonymousClass2 r0 = new jhy() {
            public final void a() {
            }

            public final void b() {
            }
        };
        this.c.a(r0);
        this.f.a(r0);
        this.g.a(r0);
        this.h.a(r0);
    }
}
