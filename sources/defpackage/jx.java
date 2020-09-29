package defpackage;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.util.ArrayList;

/* renamed from: jx reason: default package */
final class jx {
    private static ThreadLocal<jx> e = new ThreadLocal<>();
    final dv<b, Long> a = new dv<>();
    final ArrayList<b> b = new ArrayList<>();
    long c = 0;
    boolean d = false;
    private final a f = new a();
    private c g;

    /* renamed from: jx$a */
    class a {
        a() {
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            jx.this.c = SystemClock.uptimeMillis();
            jx jxVar = jx.this;
            long j = jxVar.c;
            long uptimeMillis = SystemClock.uptimeMillis();
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= jxVar.b.size()) {
                    break;
                }
                b bVar = (b) jxVar.b.get(i);
                if (bVar != null) {
                    Long l = (Long) jxVar.a.get(bVar);
                    if (l != null) {
                        if (l.longValue() < uptimeMillis) {
                            jxVar.a.remove(bVar);
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        bVar.a(j);
                    }
                }
                i++;
            }
            if (jxVar.d) {
                for (int size = jxVar.b.size() - 1; size >= 0; size--) {
                    if (jxVar.b.get(size) == null) {
                        jxVar.b.remove(size);
                    }
                }
                jxVar.d = false;
            }
            if (jx.this.b.size() > 0) {
                jx.this.b().a();
            }
        }
    }

    /* renamed from: jx$b */
    interface b {
        boolean a(long j);
    }

    /* renamed from: jx$c */
    static abstract class c {
        final a a;

        c(a aVar) {
            this.a = aVar;
        }

        /* access modifiers changed from: 0000 */
        public abstract void a();
    }

    /* renamed from: jx$d */
    static class d extends c {
        long b = -1;
        private final Runnable c = new Runnable() {
            public final void run() {
                d.this.b = SystemClock.uptimeMillis();
                d.this.a.a();
            }
        };
        private final Handler d = new Handler(Looper.myLooper());

        d(a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.d.postDelayed(this.c, Math.max(10 - (SystemClock.uptimeMillis() - this.b), 0));
        }
    }

    /* renamed from: jx$e */
    static class e extends c {
        private final Choreographer b = Choreographer.getInstance();
        private final FrameCallback c = new FrameCallback() {
            public final void doFrame(long j) {
                e.this.a.a();
            }
        };

        e(a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.b.postFrameCallback(this.c);
        }
    }

    jx() {
    }

    public static jx a() {
        if (e.get() == null) {
            e.set(new jx());
        }
        return (jx) e.get();
    }

    /* access modifiers changed from: 0000 */
    public final c b() {
        if (this.g == null) {
            if (VERSION.SDK_INT >= 16) {
                this.g = new e(this.f);
            } else {
                this.g = new d(this.f);
            }
        }
        return this.g;
    }
}
