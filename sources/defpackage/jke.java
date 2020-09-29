package defpackage;

import android.os.Handler;
import com.spotify.mobile.android.util.Assertion;
import java.util.Random;

/* renamed from: jke reason: default package */
public final class jke extends jkj {
    private final long a = 5000;
    private final Handler b = new Handler();
    /* access modifiers changed from: private */
    public final jkg c;
    /* access modifiers changed from: private */
    public final jkf f;
    /* access modifiers changed from: private */
    public final jki g;
    /* access modifiers changed from: private */
    public final jkj h;
    /* access modifiers changed from: private */
    public final Random i;
    private final Runnable j = new Runnable() {
        public final void run() {
            if (!jke.this.h.e) {
                boolean z = false;
                if (jke.this.c.e && jke.this.f.e && jke.this.g.e) {
                    z = true;
                }
                if (jke.this.c.g() && jke.this.f.e && jke.this.g.g()) {
                    z = true;
                }
                if (jke.this.c.g() && jke.this.f.g() && jke.this.g.e) {
                    z = true;
                }
                if (z && jke.this.i.nextDouble() >= 0.99d) {
                    StringBuilder sb = new StringBuilder("RemotePlayback: ");
                    sb.append(jke.this.c.e);
                    sb.append(" Playback: ");
                    sb.append(jke.this.f.e);
                    sb.append(" AudioDriver: ");
                    sb.append(jke.this.g.e);
                    sb.append(" VideoPlayerPlayback: ");
                    sb.append(jke.this.h.e);
                    sb.append(" (Throttled 99%)");
                    Assertion.c(sb.toString());
                }
            }
        }
    };

    public jke(jkg jkg, jkf jkf, jki jki, jkj jkj, Random random) {
        super("PlaybackOnDeviceState");
        this.c = jkg;
        this.f = jkf;
        this.g = jki;
        this.h = jkj;
        this.i = random;
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        AnonymousClass2 r0 = new jko() {
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
