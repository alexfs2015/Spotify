package defpackage;

import android.os.SystemClock;
import android.widget.ProgressBar;
import com.google.common.base.Optional;

/* renamed from: jut reason: default package */
public final class jut<V extends ProgressBar> {
    final V a;
    final Optional<Object> b;
    jvk c = jvk.a();
    b d;

    public jut(V v, Optional<Object> optional) {
        this.a = v;
        this.b = optional;
    }

    private void a(long j, long j2, int i, float f) {
        this.a.setMax(i);
        b(j, j2, f);
    }

    public final void a() {
        b bVar = this.d;
        if (bVar != null) {
            this.c.b(bVar);
            this.d = null;
        }
    }

    public final void a(long j, long j2, float f) {
        a(j, f == 0.0f ? j : j2, (int) j2, f);
    }

    public final void b(long j, long j2, float f) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        a();
        jvk jvk = this.c;
        final float f2 = f;
        final long j3 = j;
        final long j4 = j2;
        AnonymousClass1 r0 = new Runnable() {
            public final void run() {
                int elapsedRealtime = (int) ((((float) (SystemClock.elapsedRealtime() - elapsedRealtime)) * f2) + ((float) j3));
                jut.this.a.setProgress(elapsedRealtime);
                if (jut.this.b.b()) {
                    jut.this.b.c();
                }
                if (((long) elapsedRealtime) < j4) {
                    jut.this.c.a(jut.this.d, 16);
                }
            }
        };
        this.d = jvk.a((Runnable) r0);
        this.c.a(this.d);
    }
}
