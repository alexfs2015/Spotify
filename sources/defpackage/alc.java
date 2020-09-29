package defpackage;

import android.os.Handler;

/* renamed from: alc reason: default package */
final class alc {
    final long a = akq.j();
    long b;
    long c;
    long d;
    private final akr e;
    private final Handler f;

    alc(Handler handler, akr akr) {
        this.e = akr;
        this.f = handler;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (this.b > this.c) {
            b bVar = this.e.e;
            final long j = this.d;
            if (j > 0 && (bVar instanceof d)) {
                final long j2 = this.b;
                final d dVar = (d) bVar;
                Handler handler = this.f;
                if (handler != null) {
                    AnonymousClass1 r1 = new Runnable() {
                        public final void run() {
                        }
                    };
                    handler.post(r1);
                }
                this.c = this.b;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(long j) {
        this.d += j;
    }
}
